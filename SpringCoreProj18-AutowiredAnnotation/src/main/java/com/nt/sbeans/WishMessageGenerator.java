//WishMessageGenerator.java (target spring bean class)
package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class WishMessageGenerator {
	  // HAS-A property;
	@Autowired   // Field Injection
    private   Date  date;
    
    public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param costructor)");
	}

    // b.method
    public  String  showWishMessage(String user) {
    	System.out.println("WishMessageGenerator.showWishMessage()");
    	// get current hour of the day
    	int hour=date.getHours(); // gives in 24 hours format (0-23)
    	//generate the wish message
    	if(hour<12)
    		return "Good Morning::"+user;
    	else if(hour<16)
    		return "Good AfterNoon::"+user;
    	else if(hour<20)
    		return "Good Evening::"+user;
    	else
    		return "Good Night::"+user;
    }
    
    
}//class
