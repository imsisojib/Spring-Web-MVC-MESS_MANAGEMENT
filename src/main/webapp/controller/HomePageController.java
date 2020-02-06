package main.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import main.webapp.services.UserService;

@Controller
public class HomePageController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("message","HomePage");
		model.addAttribute("headerMessage","Hello World from Hell");
		return "index";
	}
	@GetMapping("/add-user")
	public String homePageForParameter(@RequestParam("name") String name,Model model) {
		userService.createNewUser(name, "imsisojib@gmail.com");
		model.addAttribute("message","Successful");
		model.addAttribute("headerMessage","Add New User");
		return "index";
	}
	@GetMapping("/show-all")
	public String showAll(Model model) {
		userService.showAllUser();
		model.addAttribute("message","SHOWING ALL USERS IN CONSOLE");
		model.addAttribute("headerMessage","SHOWING ALL USERS IN CONSOLE");
		return "index";
	}
}
