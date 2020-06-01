package com.anmolduggal.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.anmolduggal.dojoninja.models.Dojo;
import com.anmolduggal.dojoninja.models.Ninja;
import com.anmolduggal.dojoninja.services.DojoService;


@Controller
public class NinjaController {
	
	@Autowired
	private DojoService ninjaService;
	
	@GetMapping("/newninja")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", ninjaService.getAllDojos());
		return "/WEB-INF/newNinja.jsp";
	}
	
	@PostMapping("/newninja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/WEB-INF/newNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/newninja";
		}
	}
	
	@GetMapping("/dojo/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
		 Dojo dojo = ninjaService.findDojo(id);
	     model.addAttribute("dojo", dojo);
        return "/WEB-INF/show.jsp";
	}
}
