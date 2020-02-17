package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.Service.WorkerService;
import com.cts.model.ManAtWork;

@Controller
public class HController {
	
	
	@Autowired
	WorkerService ws;
	@RequestMapping("one")
	public String one() {
		
		return "one";
	}
	
	
	@RequestMapping("form")
	public String two(Model model) {
		
		
		model.addAttribute("student",new ManAtWork());
		return "form";
	}
	
	
	 @RequestMapping("/list")
	 public ModelAndView getStudents() {
		 List list = ws.getThem();
		 System.out.println(list);
		 ModelAndView modelAndView = new ModelAndView("List","lis",list);
		 return modelAndView;
	 }

	 @PostMapping("/saveStudent")
	 public String saveStudent(@ModelAttribute("student") ManAtWork student) {
		 ws.saveOrUpdate(student);
		 return "redirect:/list";
	 }
	
	
}
