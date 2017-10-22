package edu.cueb.degree.repository;

import edu.cueb.degree.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
 
}
