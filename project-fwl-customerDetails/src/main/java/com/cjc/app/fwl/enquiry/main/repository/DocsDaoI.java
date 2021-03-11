package com.cjc.app.fwl.enquiry.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fwl.enquiry.main.model.Documentdetails;

@Repository
public interface DocsDaoI extends JpaRepository<Documentdetails, Integer>{
	
	

}
