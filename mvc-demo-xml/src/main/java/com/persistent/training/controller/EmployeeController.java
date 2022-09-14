package com.persistent.training.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.persistent.training.model.Employee;
import com.persistent.training.services.EmployeeService;

@Controller
@RequestMapping("/ems")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/register")
	public String getRegistration(Model model) {
		model.addAttribute("employee", new Employee());
		return "register";
	}

		@PostMapping("/register")
		public String add(Model model, Employee employee) {
			// CALL SEVICE-INTERFACE FOR SAVING EMPLOYEE DATA
			// CONFIRM THE SUCCESS FLAG
			System.out.println("At Controller.add()");
			boolean saved = service.save(employee);
			if (saved) {
				model.addAttribute("user", employee);
				return "hello_user";
			} else {
				model.addAttribute("user", "No Employee");
				return "redirect:/ems/register";
			}
	}
}
