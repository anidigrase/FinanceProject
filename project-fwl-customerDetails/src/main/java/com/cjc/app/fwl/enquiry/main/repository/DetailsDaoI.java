package com.cjc.app.fwl.enquiry.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fwl.enquiry.main.model.Customer;

@Repository
public interface DetailsDaoI extends JpaRepository<Customer, Integer> {

	List<Customer> findByCustomerId(int customerId);
}
