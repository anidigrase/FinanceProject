package com.cjc.app.fwl.enquiry.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fwl.enquiry.main.model.Customer;
import com.cjc.app.fwl.enquiry.main.service.ServiceI;

@RestController
@CrossOrigin("*")
public class Homecontroller {

	@Autowired
	ServiceI hs;
	
	@RequestMapping(value = "/set",method = RequestMethod.POST)
	private String setdata(@RequestBody Customer customer )
	{
		hs.savedata(customer);
		System.out.println("saved"+ customer);
		return "success";
	}
	
	@RequestMapping("/get/{customerId}")
	private List<Customer> getdata(@PathVariable("customerId")int customerId)
	{
		List<Customer> list=hs.getdata(customerId);
		return list;
	}
}
