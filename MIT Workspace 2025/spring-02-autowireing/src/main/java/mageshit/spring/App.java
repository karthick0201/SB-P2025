package mageshit.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import mageshit.spring.beans.Labtop;
import mageshit.spring.beans.StudyLight;
import mageshit.spring.corejava.Room;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(">>>======> 2. Autowireing Pratice <=========<<<");
        
        String path = "mageshit/spring/config/application.xml";
        
        //pratice1(path); // testing interface dependency injection
        
        
       // pratice2(path); // Object creation order -> parent obj and child object which object is first created?
        
        /*
         * Only Inject dependencies in form of object by using below stergys
         * 
         * 1. no
         * 2. byName
         * 3. byClass
         * 4. by using constructor
         * 
         * <bean id = "employee" class = "com.spring.beans.Employee" autowire = "no/name/class/">
         * */
        
       // pratice3(path); // autowire = "no"
       // pratice4(path); // autowire = "byName"
       // pratice5(path); // autowire = "byType"
        pratice6(path); // autowire = "constructor"
        
        
    }

	private static void pratice6(String path) {
		
		// 1. Activating Container by creating impl class
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(path);
		
		// 2. Getting Object
		
		StudyLight studyLightBean = factory.getBean(StudyLight.class);
		printEmptyLine();
		System.out.println(">>=====> 4. Autowire - using 'constructor' statergy <<========<<");
		studyLightBean.lightOn();
		
		
	}

	private static void pratice5(String path) {
		// 1. Activating Container by creating impl class
			DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions(path);
			
			// 2. Getting Object
			
			Labtop labtopBean = factory.getBean(Labtop.class);
			printEmptyLine();
			System.out.println(">>=====> 3. Autowire - using 'byType' statergy <<========<<");

			labtopBean.powerOn(); // type = Interface object, so which object you need, set primary = "true" corresponding bean
	
	}

	private static void pratice4(String path) {
		// 1. Activating Container by creating impl class
				DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
				XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions(path);
				
				// 2. Getting Object
				
				Labtop labtopBean = factory.getBean(Labtop.class);
				printEmptyLine();
				System.out.println(">>=====> 4. Autowire - using 'byName' statergy <<========<<");

				labtopBean.powerOn();
				
		
	}

	private static void pratice3(String path) {
		// 1. Activating Container by creating impl class
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(path);
		
		// 2. Getting Object
		
		Labtop labtopBean = factory.getBean(Labtop.class);
		printEmptyLine();
		System.out.println(">>=====> 3. Autowire - using 'no' statergy <<========<<");

		labtopBean.powerOn();
		
		
		
		
		
		
		
		
	}

	private static void printEmptyLine() {
		System.out.println();
		System.out.println();
		
	}

	private static void pratice2(String path) {
		//System.out.println(">>=====> 2. Which Order object first created Parent/child object <<========<<");
		// Activating Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(path);
		
		System.out.println(">>------> Example 1 : Core java object creation order :::");
		/*
		 * class Room{
		 * 
		 * 	Table table = new Table();;
		 * }
		 * 
		 * if i create object of 'Room' class which object created first?
		 * 
		 * Conclusion :: 
		 * 1st Table object Created 
		 * 2nd Room Object Created
		 * 
		 * 
		 * Seaonro 2 : Same way getting object from IOC, -  Using setter Injection
		 * 
		 * First Parent Object created
		 * sencond dependent object will created
		 * 
		 * 
		 * seanorio 3: Same way  getting object from Ioc - Using constructor Injection
		 * 
		 * First Dependent - Child object created
		 * Second - Parent object created
		 * 
		 * */
		
		//Manually Creating object
		
		Room room = new Room();
		
		
		
		
		
	}

	private static void pratice1(String path) {
		//1. activating Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // its lazy loading -> when object used then only object created
		// 2. loading factory to beanDefnreader 
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(path);
		
		// Getting Object from listable bean factory
		
		Labtop labtopBean = factory.getBean(Labtop.class);
		
		labtopBean.powerOn();
		
		
		
	}
}
