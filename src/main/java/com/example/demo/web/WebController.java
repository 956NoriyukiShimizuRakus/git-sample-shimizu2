package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/index")
	public String index(){
		System.out.println("ピカチュー");
		return "hello";
	}
	
}
