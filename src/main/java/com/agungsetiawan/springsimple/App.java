package com.agungsetiawan.springsimple;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.agungsetiawan.springsimple.domain.User;
import com.agungsetiawan.springsimple.service.UserService;


public class App{
    public static void main( String[] args ){
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	UserService service=(UserService) context.getBean("userService");
    	
    	List<User> users=service.findAll();
    	
    	for(User u:users){
    		System.out.println(u.getFirstname());
    	}
    }
}
