package bing.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bing.server.IHelloService;

public class HelloServiceClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring-conf/applicationContext-client.xml");
		IHelloService helloService = (IHelloService) context.getBean("client");
		String response = helloService.sayHello("Peter");
		System.out.println(response+"11");
	}

}
