package com.mindtree.kalingahospital.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HospitalController {
	


	

	@RequestMapping("/")
	public String viewHomePage() {

		return "HomePage";
	}
	
	

}









