package mageshit.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Writer {

	@Value("Writer")
	private String productName;
	
	@Autowired
	private ProductManager productManager;
	
	@Autowired
	private Developer developer;
	
	public Writer() {
		System.out.println("<><><> Writer - Default Constructor Called!!!!");
	}
	
	public void liftOfWriter() {
		
		System.out.println(">>>>>> Writer Team <<<<<<<");
		System.out.println("Product Name : " + productName);
		System.out.println(">----> Product Manger Work <------<");
		productManager.assignWork();
		System.out.println(">---------------------------------<");
		System.out.println(">-----> Developr Work <-----------<");
		developer.develop();
		System.out.println(">---------------------------------<");
		
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductManager getProductManager() {
		return productManager;
	}

	public void setProductManager(ProductManager productManager) {
		this.productManager = productManager;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	
	
	
	
}
