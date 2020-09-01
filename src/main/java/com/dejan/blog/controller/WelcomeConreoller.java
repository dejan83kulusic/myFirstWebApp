package com.dejan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeConreoller {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String showLoginPage(ModelMap model) {
		model.put("name", "dejanBlog");
		return "welcome";
	}

}