package mageshit.spring_01_bean_creation;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import mageshit.spring.beans.Player;
import mageshit.spring.beans.Stadium;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(">>-----> Spring Core Pratice <-------<<");
        String path = "mageshit/spring/config/application.xml";
        /*
         * Container : 
         * 
         * 1. Bean Factory Container
         * 2. Appliaction Context Containter
         * 
         * Implementation Class :: 
         * Bean Factory ::
         * 1. XMLBeanFactory
         * 2. SimpleJNDIBeanFactory
         * 3. DefaultListableBeanFactory
         * 
         * ApplicationContext Container :: 
         * 1. ClassPathXMLApplicationContext
         * 2. FileSystemXMLApplicationContext
         * 3. 
         * 
         * */
        
        pratice1(); // beanFactory - depricated, spring recommaded to use ApplicationContext over BeanFactory
        
        Pratice2(path); // Using ApplicationContext Container, defaultListableBeanFactory
        
//        praticeInjection(path); // Setter and Constructer injection pratice
        
//        pratice3_signletonValueChange(path); 
        
        
    }

	private static void pratice3_signletonValueChange(String path) {
		System.out.println(">>>---> 3. SingletonBean and object value change -----<<<< ");

		System.out.println("----------- activating spring container!!!!");
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Player playerBean = context.getBean(Player.class);
		
		playerBean.printPlayer();
		
		System.out.println(">>>>------> Checking by default is singleton <<-----------<<");
		
		playerBean.setJercyNumber(10);
		
		
		Player bean2 = context.getBean(Player.class);
		
		bean2.printPlayer();
		
		System.out.println("Bean 1 Hashcode :: " + playerBean.hashCode());
		System.out.println("Bean 2 Hashcode :: " + bean2.hashCode());
		
		System.out.println("Conclusion:: 1. By default beans are singleton"
				+ "2. Changing after class variables"
				+ "Result : after changing jercy number : 7 To 10"
				+ "After again get from getBean, value is changed to 10...."
				+ "is Pass by reference...");
		
		
	}

	private static void praticeInjection(String path) {
		// Setter and Constructer injection pratice
		System.out.println(">>>---> Setter Injection Pratice -----<<<< ");
		// activating spring container
		System.out.println("~~~~ activating spring container!!!!");
		System.out.println("~~~~ Player - Injected using set method....");
		System.out.println("~~~~ Stadium - Injected using constructor");
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		// getting bean object from container
		
		Player playerBean = context.getBean(Player.class);
	
		playerBean.printPlayer();
		
		// getting Stadium object
		
		Stadium stadiumBean = context.getBean(Stadium.class);
		
		stadiumBean.printInfo();
		
		
		
		
	}

	private static void Pratice2(String path) {
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext(path);
		//1. Getting Object Using .class
		Player playerBean = appContext.getBean(Player.class);
		playerBean.printPlayer();
		
		// 2. Getting Object using specified Name
		
		Player beanPlayer = (Player) appContext.getBean("player");
		beanPlayer.printPlayer();
		
		
		// Creating DefaultListableBeanFactoryContainer
		//1. activating container
		System.out.println(">>>==========> DEFAULT LISTABLE BEAN FACTORY <============<<<");
		
		DefaultListableBeanFactory defListFactory = new DefaultListableBeanFactory();
		// 2. loading configuation file
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defListFactory);
		reader.loadBeanDefinitions(path);
		
//		Stadium stadiumBean = defListFactory.getBean(Stadium.class);
//		
//		stadiumBean.printInfo();
		
		Player playerBean2 = defListFactory.getBean(Player.class);
//		playerBean2.printPlayer();
		
		

		
	}

	private static void pratice1() {
		Resource resource=new ClassPathResource("com/spring/config/bean.xml");
	    
//        BeanFactory factory=new XmlBeanFactory(resource); // removed from 6.2.6 version
		
	}
}
