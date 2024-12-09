package in.main;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.main.model.Company;
import in.main.service.CompanyService;



@SpringBootApplication
public class SpringDataJpaCompEx1 {

	public static void main(String[] args) {ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaCompEx1.class, args);
	CompanyService serv= container.getBean(CompanyService.class);
	serv.addCompany("Nothing", "Phone2a", 35000.0);
	serv.addCompany("Dell", "Inspiron",80000.0);
	
	Optional<Company>result=serv.getDetails("Nothing", "Phone2a");
	
	if(result.isPresent()) {
		
		Company comp=result.get();
		System.out.println("Company Name:"+comp.getCpId().getCompName());
		System.out.println("Product Name:"+comp.getCpId().getProdName());
		System.out.println("Price:"+comp.getPrice());
	}else {
		System.out.println("Record not found");
	}
	
}


}
