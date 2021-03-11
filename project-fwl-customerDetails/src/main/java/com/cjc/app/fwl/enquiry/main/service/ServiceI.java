package com.cjc.app.fwl.enquiry.main.service;

import java.util.List;

import com.cjc.app.fwl.enquiry.main.model.Customer;

public interface ServiceI {
	

	void savedata(Customer customer);

	List<Customer> getdata(int customerId);


}
