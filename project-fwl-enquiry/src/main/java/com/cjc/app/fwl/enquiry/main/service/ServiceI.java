package com.cjc.app.fwl.enquiry.main.service;

import java.util.List;

import com.cjc.app.fwl.enquiry.main.model.EnquiryDetails;

public interface ServiceI {

	public List<EnquiryDetails> getEnquiry();
	
	public List<EnquiryDetails> getStatus(String status);
	
	public EnquiryDetails getEnquiry(int id);
	
	public List<EnquiryDetails> updateEnquiry(EnquiryDetails enquiry);
}
