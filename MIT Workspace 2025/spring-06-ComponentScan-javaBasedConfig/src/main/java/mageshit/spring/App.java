package mageshit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mageshit.spring.beans.Developer;
import mageshit.spring.beans.ProductManager;
import mageshit.spring.beans.Writer;
import mageshit.spring.config.AppConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(">>>>>>> 06. ComponentScan Feacture Using JavaBased Configuration <<<<<<<<");
        
       // pratice1(); // coreJava Object Creation 

        
        pratice2(); // Ioc Container Will create Object
        
       
        
        
        
        
        
    }

	private static void pratice2() {
		 ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
	        
		 System.out.println("<<---< Getting Developer Object ");
		 
		// Developer develoeprBean = factory.getBean(Developer.class);
		 
		 System.out.println("<<---< Getting Manager Object ");
		 
		// ProductManager managerBean = factory.getBean(ProductManager.class);
		 
		 
		 System.out.println("<<---< Getting Writer Object ");
		 
	     Writer writerBean = factory.getBean(Writer.class);
	     writerBean.liftOfWriter();
	        
		
	}

	private static void pratice1() {
		/* System.out.println("<------<< Core Java >>-------->");
	        
	        ProductManager manager = new ProductManager();
	        
	        manager.setName("Syamala Ma'am");
	        manager.assignWork();
	        emptyLine();
	        
	        Developer developer = new Developer();
	        
	        developer.setName("Akalya");
	        developer.develop();
	        emptyLine();
	        
	        Writer writer = new Writer();
	        
	        writer.setDeveloper(developer);
	        writer.setProductManager(manager);
	        writer.setProductName("Writer");
	        writer.liftOfWriter();
	        System.out.println("<------<< THE END >>-------->");*/
		
	}

	private static void emptyLine() {
		System.out.println("<<>>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<<>>");
		
	}
}
