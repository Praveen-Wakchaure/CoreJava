package com.cg.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 * Hello world!
 *
 */

@ComponentScan

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Start");
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        
        Employee obj = context.getBean(Employee.class);
        
     //   Employee obj = new Employee();
        
        obj.work();
        
        context.close();
        
        System.out.println("End");
    }
}
