package in.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.model.Company;
import in.main.model.CompanyProdId;
import in.main.reposistory.CompanyReposistory;

@Service
public class CompanyService {
	
	private CompanyReposistory repo;

	@Autowired
	public CompanyService(CompanyReposistory repo) {
		this.repo = repo;
	}
	public void addCompany(String compName,String prodName,Double price) {
	
	 CompanyProdId comPr = new CompanyProdId(compName,prodName);
		Company comp = new Company(comPr, price);
		repo.save(comp);
	}
	

	
	public Optional<Company>getDetails(String compName,String prodName){
	   CompanyProdId compProd = new CompanyProdId(compName,prodName);
	   return repo.findById(compProd);
		
		
	}

}
