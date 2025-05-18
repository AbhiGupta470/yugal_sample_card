// this class is normally not changed this is like a normal file only for doing Dependency Injection
package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com//nt/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		String result = generator.generateWishMessage("Raja");
		System.out.println(result);
	}
}
