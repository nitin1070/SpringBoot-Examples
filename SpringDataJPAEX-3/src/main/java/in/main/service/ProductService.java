package in.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.Product;
import in.main.reposistory.ProductReposistory;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
	@Autowired
	public ProductService(ProductReposistory productRepo) {
	
		this.productRepo = productRepo;
	}

	private ProductReposistory productRepo;
	


	  public void save(Product p) {
		  productRepo.save(p);
	  }
	public Product findById(int id) {

		return productRepo.findById(id);
	}
	public Product updateProduct(Product p) {

		return productRepo.updateProduct(p);
	}

	

}
