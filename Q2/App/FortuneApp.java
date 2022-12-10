package com.nissan.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.services.Fortune;



public class FortuneApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("Context.xml");
		Fortune demoFortune=con.getBean("demoFortune",Fortune.class);
		
		System.out.println("Random Fortune: " +demoFortune.fortune());
	}
}
