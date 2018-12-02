package com.thd.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/test01")
	public String test01(){
		System.out.println("hello test01234");
		return "/index";
	}
	
	@RequestMapping("/test02")
	@ResponseBody
	public String test02(){
		System.out.println("hello test02");
		return "s";
	}
}
