package org.maven.config;

import org.maven.Alien;
import org.maven.Computer;
import org.maven.Desktop;
import org.maven.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.maven")
public class AppConfig {
    //going to replace your spring.xml file

 //   @Bean(name = {"com1","Beast","Watt"})
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop1(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Alien alien1(Computer comp){
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComp(comp);
//        return obj;
//        //return new Alien();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
