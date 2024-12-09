package in.main.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.main.model.Company;
import in.main.model.CompanyProdId;

public interface CompanyReposistory extends JpaRepository<Company, CompanyProdId> {

}
