package com.imooc.controller;

import com.imooc.service.WelcomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WelComeController {
	@Autowired
	private WelcomService welcomService;


	public void sayHello( ) {
		 welcomService.sayHeollo("AAA");
	}
}
