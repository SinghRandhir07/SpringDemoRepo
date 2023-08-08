package com.Spring.MySync;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Async
@RestController
public class SyncController {

	@RequestMapping("/test/sleep")
	Future<String> test() throws InterruptedException
	{
		for (int n=0;n<=10;n++)
		{
			Thread.sleep(2000);
			System.out.println("n is "+n);
		}
		return null;
    }
	
	@RequestMapping("/testing")
     Future <Void> testing() throws InterruptedException
     {
    	 for (int x=100;x<=120;x++)
    	 {
    		 Thread.sleep(2000);
    		 System.out.println("x is "+x);
    	 }
    	 return null;
     }
}
