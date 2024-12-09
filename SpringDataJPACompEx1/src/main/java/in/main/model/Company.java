package in.main.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Companies")
public class Company {
	@EmbeddedId
	private CompanyProdId cpId;
	private Double price;
	
	public Company() {
		System.out.println("non param const of Company called");
	}

	public Company(CompanyProdId cpId, Double price) {
		super();
		this.cpId = cpId;
		this.price = price;
	}

	public CompanyProdId getCpId() {
		return cpId;
	}

	public void setCpId(CompanyProdId cpId) {
		this.cpId = cpId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
    
}
