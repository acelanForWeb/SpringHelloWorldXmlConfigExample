package tw.acelan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.acelan.common.HelloWorld;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		HelloWorld object = (HelloWorld)context.getBean("helloBean");
		
		object.printHello();
	}
}
