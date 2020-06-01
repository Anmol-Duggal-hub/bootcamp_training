package com.anmolduggal.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String codeInput(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		if(code.equals("Bushido")) {
			return "redirect:/code";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
}
