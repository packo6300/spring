package com.packo.spring;

import org.springframework.context.support.*;

import com.packo.beans.Mundo;

import org.springframework.context.ApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext app= new ClassPathXmlApplicationContext("com/packo/xml/beans.xml"); 
		Mundo m =(Mundo)app.getBean("mundo");
		System.out.println(m.getSaludo());
	}

}
