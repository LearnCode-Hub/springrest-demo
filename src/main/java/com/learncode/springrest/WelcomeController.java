package com.learncode.springrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/welcome")
public class WelcomeController {

	@RequestMapping("/")
	public String page() {
		return "welcome-page";
	}
	
}
