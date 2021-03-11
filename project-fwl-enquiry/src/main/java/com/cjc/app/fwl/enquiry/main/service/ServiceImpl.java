package com.cjc.app.fwl.enquiry.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.app.fwl.enquiry.main.model.EnquiryDetails;
import com.cjc.app.fwl.enquiry.main.repository.EnquiryRepository;


@Service
public class ServiceImpl implements ServiceI{
	
	@Autowired
	public JavaMailSender javamailsender;
	
	@Autowired private EnquiryRepository repository;
	  
	  @Override public List<EnquiryDetails> getEnquiry() {
	  
	  return repository.findAll();
	  
	  }
	 
	

	@Override
	public List<EnquiryDetails> getStatus(String status) {
		List<EnquiryDetails> list = null;
		status = "pending";
		if(status.equalsIgnoreCase("Pending")) {
			list = repository.findByStatus(status);
			
			System.out.println(list);
		}
		return list;
	}



	@Override
	public EnquiryDetails getEnquiry(int id) {
		EnquiryDetails en = repository.findById(id).get();
		return en;
	}



	@Override
	public List<EnquiryDetails> updateEnquiry(EnquiryDetails enquiry) {
		 repository.save(enquiry);
		 
	
		 
		 String mail=enquiry.getEmail();
		 System.out.println(mail);
		 String approve="your loan application is approved...."; 
		 
		 String reject="your loan application is reject...."; 
		  String check=enquiry.getStatus();
		 
		 SimpleMailMessage m=new SimpleMailMessage();
			m.setTo(mail);
			m.setSubject("HELLO");
			
			if(check.equalsIgnoreCase("approve"))
			{
				System.out.println("approved");
			  m.setText(approve);
			  javamailsender.send(m);
			  System.out.println(mail);
			}
			else
			{
				System.out.println("rejected");
				m.setText(reject);
				javamailsender.send(m);
			}
			
			
		 
		return repository.findAll();
			
	}
	
	

	
}
