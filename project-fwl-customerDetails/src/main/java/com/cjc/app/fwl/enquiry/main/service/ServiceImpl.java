package com.cjc.app.fwl.enquiry.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fwl.enquiry.main.model.Customer;
import com.cjc.app.fwl.enquiry.main.repository.DetailsDaoI;

@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	DetailsDaoI hr;
	@Override
	public void savedata(Customer customer) {
		
		hr.save(customer);
		
	}

	@Override
	public List<Customer> getdata(int customerId) {
		List< Customer> list=hr.findByCustomerId(customerId);
		
		return  list;
	}


}
