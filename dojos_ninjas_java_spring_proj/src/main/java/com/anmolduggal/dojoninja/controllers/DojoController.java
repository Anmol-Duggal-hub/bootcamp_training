package com.anmolduggal.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.anmolduggal.dojoninja.models.Dojo;
import com.anmolduggal.dojoninja.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/newdojo")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		model.addAttribute("allDojos", dojoService.getAllDojos());
		return "/WEB-INF/newDojo.jsp";
	}
	
	@PostMapping("/newdojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/WEB-INF/newDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/newdojo";
		}
	}
}
