package edu.cueb.degree.repository;

import edu.cueb.degree.model.Amount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmountRepository extends JpaRepository<Amount,Integer> {
}
