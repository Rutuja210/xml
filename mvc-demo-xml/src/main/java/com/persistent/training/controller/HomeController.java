package com.persistent.training.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.persistent.training.model.Employee;
import com.persistent.training.services.EmployeeService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private EmployeeService service;

	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("hello");
		return m;
	}
	
	@RequestMapping("/hello_users")
	public String hello_user(Model model)
	{
		List<Employee> userNames = service.getEmployees();
		model.addAttribute("usernames", userNames);
		return "hello_users";
	}
	
}
