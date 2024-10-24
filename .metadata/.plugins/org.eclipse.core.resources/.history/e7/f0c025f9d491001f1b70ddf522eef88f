package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.Product;
import in.main.service.ProductService;

@SpringBootApplication
public class SpringDataJpaex2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaex2Application.class, args);
		
		ProductService productService = run.getBean(ProductService.class);
		
		Product p = new Product();
		
		p.setProductName("Mobiles");
		p.setProductPrice(10000.0);
		
		productService.save(p);
		
		Product p2 = new Product();

		p2.setProductName("Iphones");
		p2.setProductPrice(90000.0);
		
		productService.save(p2);
		
	}

}
