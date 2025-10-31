package mageshit.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mageshit.spring.beans.MiTv;
import mageshit.spring.beans.Room;
import mageshit.spring.beans.User;
import mageshit.spring.config.BeanConfig;
import mageshit.spring.config.BeanPropertiesConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	//1. Java based configuration
    	//pratice1();
    	
    	// 2. Properties file read using annotation
    	
    	pratice2();
    	
        
    }

	private static void pratice2() {
		System.out.println(">>>->>> 1. Properties File and Set Class properties value <<<-------<<<<");
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(BeanPropertiesConfig.class);
		
		User userBean = factory.getBean(User.class);
		
		System.out.println("PRINTING USER BEAN : " + userBean);
		
		System.out.println("User Name : " + userBean.getUserName());
		
		System.out.println("Password : " + userBean.getPassword());
		
		
		
	}

	private static void pratice1() {
System.out.println(">>>->>> 3. PRATICING JAVA BASED CONFIGURATION <<<-------<<<<");
        
        /* ApplicationContext container 
        	Behaviour : 
        		* Early Loading by default
        		* Provide more services than beanfactory
        */
        ApplicationContext factory = new AnnotationConfigApplicationContext(BeanConfig.class);
        
       /* 
        String[] beanNames = factory.getBeanDefinitionNames();
        System.out.println(">-----> bean Names <-------<");
        for(String name : beanNames) {
        	System.out.println(name);
        }
        System.out.println(">----------------------------< \n\n");
        */
        
        Room roomBean = factory.getBean(Room.class);
        
        System.out.println("PRINTING ::: RoomBean : " + roomBean);
        
        roomBean.printRoomInfo();
        
        // Injected Using COnstrutor injection
        
        MiTv tvBean = factory.getBean(MiTv.class);
        System.out.println("PRINTING TV :: " + tvBean);
        
        
        String[] beanDefinitionNames = factory.getBeanDefinitionNames();
        
        System.out.println("||||---------------------------|||");
        Arrays.stream(beanDefinitionNames).forEach(name -> System.out.println(name));
        
        /*
         * Method name consider to be a bean name
         * 
         * Injected Using Reflection Concept - Java based configuration
         * 
         * */
		
	}
}
