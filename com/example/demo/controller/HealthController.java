package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Healthmodel;
import com.example.demo.service.HealthService;

@Controller
public class HealthController {
	
	@Autowired
	HealthService service;
	
	@GetMapping("/")
	public String save(Model model) {
		Healthmodel user = new Healthmodel();
		model.addAttribute("user",user);
		return "register";
	}
	
	
	@PostMapping("/saveuser")
		public String saveuser(@ModelAttribute("user") Healthmodel user) {
		service.SavedUser(user);
			return "home";
		}

}
