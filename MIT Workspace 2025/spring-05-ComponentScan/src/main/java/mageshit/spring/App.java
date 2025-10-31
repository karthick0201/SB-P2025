package mageshit.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mageshit.spring.beans.Principal;
import mageshit.spring.beans.School;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(">>>> 5. Component Scan Pratice <<<<<");
        /*
         * Component Scan practice :::
         * 
         * What :: to avoid bean configurations
         * 
         * how to achieve : using stereo type annotations
         * 
         * Stereo Type annotations : 
         * 1. Component
         * 2. Repository
         * 3. Service
         * 4. Controller
         * 
         * What is Difference ? above four annotations functionally same.
         * 
         * for naming purpose.
         * 
         * */
        
        String path = "mageshit/spring/config/beans.xml";
//  	ApplicationContext factory = new AnnotationConfigApplicationContext(path);
        
        ApplicationContext factory = new ClassPathXmlApplicationContext(path);
        
       
        School schoolBean = factory.getBean(School.class);
        
        schoolBean.test();
        
        
        
        
    }
}
