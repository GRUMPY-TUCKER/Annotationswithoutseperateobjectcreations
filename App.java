package org.maven;

import org.maven.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //java-based configuration approach
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj = context.getBean(Alien.class);  //normal way of getBean T=Type1
        obj.code();
        //System.out.println(obj.age);
        obj.setAge(21);
        System.out.println( "Hello World!" );
        System.out.println(obj.getAge());
        Laptop lap = context.getBean(Laptop.class);
        lap.compile();
        //Your bean name will be as same as the method name created in the AppConfig class
        Desktop desk = context.getBean(Desktop.class);
        desk.compile();
//      Desktop desk1 = context.getBean("com1",Desktop.class);
//      desk1.compile( );
        Desktop desk1 = context.getBean(Desktop.class);
        desk1.compile();





        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates the container
//        Alien obj = context.getBean("alien1", Alien.class);  //nprmal way of getBean T=Type1
//        obj.code();
//        //System.out.println(obj.age);
//        System.out.println( "Hello World!" );
//        System.out.println(obj.getAge());
//        Alien obj2 = (Alien) context.getBean("alien1");  //type casting of getBean T=type2
//        obj2.code();
//        System.out.println(obj2.getAge());
//        Alien obj3 = (Alien) context.getBean("alien1");
//        obj3.code();
//        obj3.setAge(34);
//        System.out.println(obj3.getAge());
//        Computer com1 = context.getBean(Laptop.class);
//        Computer com2 = context.getBean(Desktop.class);
//        //After implementing lazy-init, we can only call the desktop object once we have created it on my own
//        Desktop desk = (Desktop) context.getBean("comp2");

    }
}
