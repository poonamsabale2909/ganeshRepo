package com.jdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class welcomeController {

@GetMapping("/welcome")
public String welcomeMsg(Model model) {
	
	model.addAttribute("msg", "Welcome to Java Development Course-04");
	
	return "index";		
}

}
