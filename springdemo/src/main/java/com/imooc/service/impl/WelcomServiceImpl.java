package com.imooc.service.impl;

import com.imooc.service.WelcomService;
import org.springframework.stereotype.Service;

@Service
public class WelcomServiceImpl implements WelcomService {

	@Override
	public String sayHeollo(String name) {
		System.out.println("欢迎你:"+name);
		return "success";
	}
}
