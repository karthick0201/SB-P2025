package mageshit.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import mageshit.spring.beans.User;

@Configuration
@PropertySource(value = { "configuration.properties" }) // "classpath:configuration.properties"
//@ImportResource(locations = "mageshit.spring.config.beans.xml")  by using this annotation we import xml configution to java based configuration
public class BeanPropertiesConfig {

//	@Value("${userName}")
	@Value("${userForUser}")
	private String userName;

	@Value("${password}")
	private String password;
	
	@Bean(name = "user") // we can provide other logical name --> getBean("user"); // if not name, default :: logical Name is : method name "userBean"
	public User userBean() {
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		return user;
	}
	
}
