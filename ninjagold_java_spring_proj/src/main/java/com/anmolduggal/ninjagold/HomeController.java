package com.anmolduggal.ninjagold;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Date;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/gold")
	public String index(HttpSession session) {
		if (session.getAttribute("your_Gold")==null) {
			session.setAttribute("your_Gold", 0);
		}
		if (session.getAttribute("text_List")==null) {
			session.setAttribute("text_List", new ArrayList<String>());
		}
		return "gold.jsp";
	}
	
	@RequestMapping(value="/process_money",  method=RequestMethod.POST)
	public String process_money(@RequestParam(value="which_form") String location, HttpSession session) {
		int gold = 0;
		ArrayList<String> arrayList = (ArrayList<String>) session.getAttribute("text_List");
		Date date = new java.util.Date();
		
	    if (location.equals("farm")) {
		         gold += ThreadLocalRandom.current().nextInt(10,20+1);
		         arrayList.add("Earned " + gold + " golds from the farm! " + date);
		         session.setAttribute("text_List", arrayList);
	    	}
	    else if(location.equals("cave")) {
		         gold += ThreadLocalRandom.current().nextInt(5,9+1);
		         arrayList.add("Earned " + gold + " golds from the cave! " + date);
		         session.setAttribute("text_List", arrayList);
		    	}
	    else if(location.equals("house")) {
		         gold += ThreadLocalRandom.current().nextInt(2,4+1);
		         arrayList.add("Earned " + gold + " golds from the house! " + date);
		         session.setAttribute("text_List", arrayList);
	    	}
	    else if(location.equals("casino")) {
		         gold += ThreadLocalRandom.current().nextInt(-50,50+1);
		         arrayList.add("Earned " + gold + " golds from the casino! " + date);
		         session.setAttribute("text_List", arrayList);
    
	    	}
	    int your_Gold = (int)session.getAttribute("your_Gold");
        your_Gold += gold;
        session.setAttribute("your_Gold", your_Gold);
        return "redirect:/gold";
	    }
		
	}

