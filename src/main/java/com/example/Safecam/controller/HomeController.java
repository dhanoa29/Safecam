package com.example.Safecam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Safecam.entity.User;

@Controller
public class HomeController {

	@GetMapping({ "/", "/index" })
	public String home(@ModelAttribute("user") User user) {
		return "index";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("user") User user) {
		return "save";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/service")
	public String service() {
		return "service";
	}

	@GetMapping("/price")
	public String price() {
		return "price";
	}

	@GetMapping("/blog")
	public String blog() {
		return "blog";
	}

	@GetMapping("/detail")
	public String detail() {
		return "detail";
	}

	@GetMapping("/team")
	public String team() {
		return "team";
	}

	@GetMapping("/testimonial")
	public String testimonial() {
		return "testimonial";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

}
