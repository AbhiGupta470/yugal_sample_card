package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("wmg");
		
		WishMessageGenerator generate = (WishMessageGenerator) obj;
		System.out.println(generate.generateWishMessage("Raja"));
	}
}
