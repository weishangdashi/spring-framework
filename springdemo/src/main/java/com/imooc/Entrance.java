package com.imooc;

import com.imooc.bean.User;
import com.imooc.controller.WelComeController;
import com.imooc.service.WelcomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;
@Configuration
@ComponentScan("com.imooc")
public class Entrance {

//	public static void main(String[] args){
//		System.out.println("Aaa");
//		String xmlPath ="F:\\space\\other\\2021\\08\\spring-framework-5.3.9\\springdemo\\src\\main\\resources\\spring\\spring-config.xml";
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
//		WelcomService welcomService = (WelcomService) applicationContext.getBean("welcomService");
//		welcomService.sayHeollo("强大的spring 框架");
//
//
//	}


	public static void main(String[] args){
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String []beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String aa:beanDefinitionNames ) {
//			System.out.println(aa);
//		}
		User user5 = (User) applicationContext.getBean("user5");
		System.out.println("CustomizeBeanDefinitionRegistryPostProcessor"+user5);

		WelComeController welComeController= (WelComeController) applicationContext.getBean("welComeController");
		welComeController.handleRequest();
	}
}
