package com.anmolduggal.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.anmolduggal.relationships.models.Person;
import com.anmolduggal.relationships.services.LicenseService;

@Controller
public class PersonController {
	
	@Autowired
	private LicenseService licenseService;

	
	@GetMapping("/newperson")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "/WEB-INF/newPerson.jsp";
	}
	
	@PostMapping("/newperson")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/WEB-INF/newPerson.jsp";
		} else {
			licenseService.createPerson(person);
			return "redirect:/newperson";
		}
	}
}
