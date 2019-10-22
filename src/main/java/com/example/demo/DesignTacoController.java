package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// This class will control "/design" http requests
@Controller
@RequestMapping("/design")
public class DesignTacoController {
	
	// This method control GET http request
	@GetMapping
	public String showDesignForm(Model model) {
		// Add some form initial data to model
		model.addAttribute("message", "Create your Shaverma!");
		String[] wrapList = {"Lavash", "Pita", "Bulka"};
		model.addAttribute("wraps", wrapList);
		// Pass it to view "design.html"
		return "design";
	}

}
