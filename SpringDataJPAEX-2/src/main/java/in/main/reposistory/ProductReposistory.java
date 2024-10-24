package in.main.reposistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.main.model.Product;

import jakarta.persistence.EntityManager;

@Repository
public class ProductReposistory {
	@Autowired
	public ProductReposistory(EntityManager emEntityManager) {
	
		this.emEntityManager = emEntityManager;
	}

	private EntityManager emEntityManager;
	
	public void save(Product p) {
		emEntityManager.persist(p);
	}

	public Product findById(int id) {
		return emEntityManager.find(Product.class, id);
	}
	
	
	

	
}
