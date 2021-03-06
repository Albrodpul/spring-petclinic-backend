package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer>{
	
	List<Bill> findAll();
	
	Bill findById(Integer id);

	Bill save(Bill b);
	
	void delete(Bill b);
	
	void deleteAll();
	
	List<Bill> findByVisitNotNull();
	
	List<Bill> findByVisitNull();
}
