package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.Product;
import in.main.service.ProductService;

@SpringBootApplication
public class SpringDataJpaex3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaex3Application.class, args);
		
		ProductService productService = run.getBean(ProductService.class);
		
		Product product = new Product();
		product.setId(5);
		product.setProductName("Electric");
		product.setProductPrice(20000);
		productService.updateProduct(product);
		System.out.println("After update product :" +productService.findById(5));
		
		
	}

}
