package com.anmolduggal.stringassignment;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo")
	public String index(@RequestParam(value="d", required=false) String dojo) {
		return "The " + dojo + " is awesome!";
	}
	
	@RequestMapping("/burbank-dojo")
	public String burbank(@RequestParam(value="b") String burbank) {
		return "The Burbank Dojo is located in Southern California";
	}
	
	@RequestMapping("/san-jose")
	public String sanjose(@RequestParam(value="s")String sanjose) {
		return "SJ dojo is the headquarters";
	}
}
