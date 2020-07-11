package com.learncode.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class LinkController {

	@GetMapping("/rest")
	public String page() {
		return "rest-page123";
	}
}
