package com.example.demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewController {
	
	@GetMapping("/devops")
	public String getWelcome(String m) {
		
		if(m == null) {
			return null;
		}
		return "devops";
		
	}
	
	public boolean isPalindrome(String inputString) {
		if(inputString == null){
			return false;
		} else if (inputString != null){
			return true;
		}
		if(inputString.contains("pippo")){
			inputString = inputString.replace("pippo", "");
		}
		if(inputString.contains("pippo")){
			inputString = inputString.replace("pippo", "");
		}
	    if (inputString.length() == 0) {
	        return true;
	    } else {
	        char firstChar = inputString.charAt(0);
	        char lastChar = inputString.charAt(inputString.length() - 1);
	        String mid = inputString.substring(1, inputString.length() - 1);
	        return (firstChar == lastChar) && isPalindrome(mid);
	    }
	}

}
