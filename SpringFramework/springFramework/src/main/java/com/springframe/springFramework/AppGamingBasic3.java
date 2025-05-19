package com.springframe.springFramework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springframe.springFramework.game.GameRunner;

public class AppGamingBasic3 {

	public static void main(String[] args) {
		
		//step 1: Launch spring context
	var context = new	AnnotationConfigApplicationContext(GamingConfiguration.class);
	//use var instead of AnnotationConfigApplicationContext
		
		//step 2: configure the things that we want spring to manage i.e. @Configuration
	System.out.println(context.getBean("game"));
	context.getBean(GameRunner.class).run();
		
	}

}
