package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User2;
import com.example.demo.Service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	//1.show register page
	
	@GetMapping("/reg")
	public String showReg()
	{
		return "UserRegister";
	}
	
	//2.read form data for save operation
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User2 user2, Model model)
	{
		Integer id = service.saveUser(user2);
		String msg="User "+id+" saved";
		model.addAttribute("message",msg);
		return "UserRegister";
	}

}
