package in.main.model;
import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class CompanyProdId implements Serializable{
	private String compName;
	private String prodName;
	
	public CompanyProdId() {
		
	}

	public CompanyProdId(String compName, String prodName) {
		super();
		this.compName = compName;
		this.prodName = prodName;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	
   
}
