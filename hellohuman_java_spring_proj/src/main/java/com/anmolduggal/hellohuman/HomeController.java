package com.anmolduggal.hellohuman;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) List<String> name) {
		if (name == null) {
			return "<h1>Hello Human!</h1>" + "<h2>Welcome to SpringBoot</h2>";
		}
		else {
		return "<h1>Hello "  + name.get(0) + " " + name.get(1) + "!</h1>" + "<h2>Welcome to SpringBoot</h2>";
		}
	}

}
