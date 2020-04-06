package com.mindtree.kalingahospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.kalingahospital.entity.KalingaHospital;
import com.mindtree.kalingahospital.service.KalingaHospitalService;


@Controller
public class HospitalController {
	

	@Autowired
	private KalingaHospitalService service;
	
	

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<KalingaHospital> listPatients = service.allPatients();
		model.addAttribute("listPatients", listPatients);
		return "HomePage";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		KalingaHospital hospital = new KalingaHospital();
		model.addAttribute("hospital", hospital);

		return "New_Patient";
	}
	
	@PostMapping(value = "/save")
	public String saveProduct(@ModelAttribute KalingaHospital hospital) {
		service.addpatient(hospital);
		return "redirect:/";
	}
	
	//upp
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("Edit_details");
		KalingaHospital hospital = service.update(id);
		mav.addObject("hospital", hospital);

		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";
	}

}









