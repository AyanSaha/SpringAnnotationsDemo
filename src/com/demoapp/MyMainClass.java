package com.demoapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get beans of cricket coach implementation
		Coach cricketcoach = context.getBean("cricketCoach",Coach.class);
		System.out.println(cricketcoach.getWorkOut());
		System.out.println(cricketcoach.suggestion());
		Coach hockeycoach = context.getBean("hockeyCoach",Coach.class);
		System.out.println(hockeycoach.getWorkOut());
		System.out.println(hockeycoach.suggestion());
		context.close();

	}

}
