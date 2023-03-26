package com.example.HotelManagement;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelManagementController {

	@Autowired
	HotelManagementRepository hotelrepo;
	
//Testing Comments....for my first Testing CRUD API..........!
	
	@RequestMapping ("/testing")
	public String test()
	{
		return "This is my first CRUD Testing API...!";
	}
	
//Creating a Tables with following data......for my first CRUD Operation API...........!
	
	@RequestMapping("/saveall")
	
	public String saveall()
	{
		Hotel h =new Hotel();
		h.setName("Raj kumar Singh");
		h.setCity("Bokaro Steel City -14");
		h.setEmail("Singham420raj@gmail.com");
		h.setPhone(8102772401l);
		
		Hotel h1=new Hotel();
		h1.setName("Karina Kumari");
		h1.setCity("Koderma");
		h1.setEmail("Karinakumari907ce@gmail.com");
		h1.setPhone(9508310272l);
		
		Hotel h2 =new Hotel();
		h2.setName("Annu Priya");
		h2.setCity("Bokaro Steel City-14");
		h2.setEmail("Annupriya132@gmail.com");
		h2.setPhone(9155511913l);
		
		Hotel h3=new Hotel();
		h3.setName("Abhishek kumar Singh ");
		h3.setCity("Bokaro Steel City-14");
		h3.setEmail("Rajkumar950ce@gmail.com");
		h3.setPhone(9431704002l);
		
		Hotel h4=new Hotel();
		h4.setName("Amit Singh");
		h4.setCity("Bokaro");
		h4.setEmail("Amitrani007@gmail.com");
		h4.setPhone(9155511912l);
		
		List<Hotel>list=Arrays.asList(h,h1,h2,h3,h4);
		hotelrepo.saveAll(list);
		return "data saved";
	}
	
//Retrive any data from the given table ....................!
	
	@RequestMapping("/all")
	
	public List<Hotel> all()
	{
		return hotelrepo.findAll();
	}
	
//Update any data of that table............according to our new updates..............!
	
	@RequestMapping("/{id}/{name}/{city}/{email}/{phone}")
	
	public String byid(@PathVariable int id ,@PathVariable String name ,@PathVariable String city,
			      @PathVariable String email,@PathVariable long phone)
	{
		Hotel h5=new Hotel ();
		h5.setId(id);
		h5.setName(name);
		h5.setCity(city);
		h5.setEmail(email);
		h5.setPhone(phone);
		hotelrepo.save(h5);
		
		return "Your Data will be updated....!";
	}
	
// Delete any data from the Following Created data ......................!
	
	@RequestMapping("/delete/{id}")
	
	public String byid (@PathVariable int id)
	{
         hotelrepo.deleteById(id);
         return "Unwanted data be deleted.....!";
	}
	
//Using Dto(Class) to get BY ID data from Database...!
	
	@RequestMapping("/get/by/{id}")
	public List<Hotel1> get(@PathVariable int id )
	{
		return hotelrepo.getDetailsById(id);
	}
	
//Using New Query to get data from Database....!
	
	@RequestMapping("/new/by/{name}")
	public List<Hotel2> newby(@PathVariable String name)
	{
		return hotelrepo.getDetailByName(name);
	}
	
// Using Dto(Interface) to get by City Data From Database....!
	
	@RequestMapping("/by/some/new/{city}")
	public List<Hotel3> somenew(@PathVariable String city)
	{
		return hotelrepo.getDataByCity(city);
	}
}
