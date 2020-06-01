package com.anmolduggal.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
		else {
		Integer count = (Integer) session.getAttribute("count");
		count= count + 1;
		session.setAttribute("count", count);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session){
		model.addAttribute(session.getAttribute("count"));
		return "counterdisplay.jsp";
		
	}
}
