package com.imooc.controller;

import com.imooc.service.WelcomService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller
public class WelComeController implements ApplicationContextAware, BeanNameAware {
	@Autowired
	private WelcomService welcomService;

	private  String myName;

	private  ApplicationContext myContainer;

	public void sayHello( ) {
		 welcomService.sayHeollo("AAA");
	}

	@Override
	public void setBeanName(String name) {
	this.myName=myName;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		myContainer=applicationContext;
	}

	public void handleRequest(){
		welcomService.sayHeollo("来自WelComeController问候");
		System.out.println("我是谁"+myName);
		String[] beanDefinitionNames = myContainer.getBeanDefinitionNames();
		for (String aa:beanDefinitionNames) {
			System.out.println("召唤容器圣兽"+aa);
		}
	}

}
