package spring.gradle.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		// 1. Annotation based Configuration
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);

		// 2. XML based configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee emp = context.getBean("emp4", Employee.class);
		System.out.println(emp.toString());

	}

}
