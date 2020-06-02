package com.anmolduggal.relationships.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.anmolduggal.relationships.models.License;
import com.anmolduggal.relationships.services.LicenseService;

@Controller
public class LicenseController {
	
	@Autowired
	private LicenseService licenseService;
	
	@GetMapping("/newlicense")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("allPersons", licenseService.getAllPersons());
		return "/WEB-INF/newLicense.jsp";
	}
	
	@PostMapping("/newlicense")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "/WEB-INF/newLicense.jsp";
		} else {
			
			
			licenseService.createLicense(license);
		    String license_Number = Long.toString(license.getId());
			System.out.println(license_Number);
			return "redirect:/newlicense";
		}
	}
}
