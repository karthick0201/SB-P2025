import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.spring.config.BeansConfig;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// Context Initalition
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(BeansConfig.class);
		// Create DispatcherServlet Object - excepts config (xml/java) based.
		DispatcherServlet servlet = new DispatcherServlet(context);
		
		Dynamic dynamic = servletContext.addServlet("myDispatcherServlet", servlet);
		// Setting Load on startup and url pattern
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/myhome.com/*");
	}

	
	
	/* Beans.xml File configuration
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		/ *
		 * Web.xml
		 * 
		 * tomcat --> affter deploying project --> automatically finds web.xml
		 * 
		 * 1. dispatcherservlet --> also servlet
		 * 
		 * 		--> Looking for configuration file
		 * 
		 * 2. load on startup
		 * 3. filename change - myservlet-servlet.xml
		 * 4. prefix url pattern
		 * 
		 * * /
		
		
		// dispatcher object crate
		// webapplicationcontext oda regist
		// servlet context oda register 
		
		XmlWebApplicationContext context= new XmlWebApplicationContext();
		context.setConfigLocation("classpath:beans.xml");
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		
		Dynamic dynamic = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/myhome.com/*");
		
		

	}
*/
	
	
	/*
	 * web.xml
	 * 
	 <servlet>
		<servlet-name>myDispatcherServlet</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<!-- CHange DispatcherServlet Name 
			From : myDispatcherServlet-servlet.xml
			To   : beans.xml
		 -->
		 <init-param>
		 <param-name>contextConfigLocation</param-name>
		 <param-value>/WEB-INF/beans.xml</param-value>
		 </init-param>
		
		
		<!-- When COntainter activates, initialize DispatcherServlet(Front-controller)
		     if DispatcherServlet needs beans.xml(servlet name -servlet.xml)file to gets activate  -->
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>myDispatcherServlet</servlet-name>
		<url-pattern>/home.com/*</url-pattern>
	</servlet-mapping>
	 * */
}
