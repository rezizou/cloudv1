package com.sip.ams.controllers;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Animal;

@Controller

public class FirstController {	
	
	@GetMapping("/home")
	//@ResponseBody
	public String home()
	{ 
		//return "<h1 align=center> Hello Spring Boot</h1>";
		return"/first/home";
	}
	
	
	@GetMapping("/acceuil")
	
	public String acceuil(@RequestParam(required=false, defaultValue=" Spring boot ") String framework, @RequestParam( required=false, defaultValue=" aziz ")String dev, ModelMap monObj)
	{ 
		
		String ecole="POLY";
		String formation = "Spring boot & angular";
		String ch ="Vous avez choisi: "+ framework;
		String ch2 ="hey it's me: "+ dev + framework ;
		
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Amine");
		names.add("Aziz");
		names.add("Ahmed");
		
		 		 
				
		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(new Animal("lion",3));
		zoo.add(new Animal("chat",4));
		
		monObj.put("ec", ecole);
		monObj.put("forma",formation);
		monObj.put("names", names );
		monObj.put("zoo", zoo );
		monObj.put("msg", ch);
		monObj.put("ms", ch2);
		
			
		
		return"/first/acceuil";
	}
	
	
	
}


