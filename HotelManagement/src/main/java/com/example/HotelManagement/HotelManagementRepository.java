package com.example.HotelManagement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelManagementRepository extends JpaRepository<Hotel,Integer> {

	Hotel deleteById(int id);
	
	List<Hotel1> getDetailsById(int id);
	List<Hotel3> getDataByCity(String city);
	
	@Query("select new com.example.HotelManagement.Hotel2(h.id,h.name,h.email) from Hotel h where h.name=?1")
	List<Hotel2> getDetailByName(String name);
}
