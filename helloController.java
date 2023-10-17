package com.jspiders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/yahoo")
public class helloController {
@RequestMapping("/order")
	public ModelAndView marker() {
	ModelAndView model=new ModelAndView();
	model.addObject("msg","this is me");
	model.setViewName("HelloPage");
	return model;
	}

}
