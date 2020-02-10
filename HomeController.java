package com.cts.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.User;

@Controller
public class HomeController {
@RequestMapping("hey")
public String home(Model model) {
	model.addAttribute("user",new User());
	return "home";
	}
@RequestMapping("gohere")
String form(@Valid @ModelAttribute("user") User user,BindingResult result) {
if(result.hasErrors()){
		return "home";
	}
else {
	return "success";
}
	}

}
