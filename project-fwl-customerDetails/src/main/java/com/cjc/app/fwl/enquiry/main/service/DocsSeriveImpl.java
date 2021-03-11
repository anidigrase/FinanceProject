package com.cjc.app.fwl.enquiry.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cjc.app.fwl.enquiry.main.model.Documentdetails;
import com.cjc.app.fwl.enquiry.main.repository.DocsDaoI;


@Service
public class DocsSeriveImpl implements DocsSeriveI{

	
	  @Autowired DocsDaoI hr;
	  
	  @Override
	  public void savedata(Documentdetails d) {
	  
	  hr.save(d);
	  
	  }
	  
	  @Override
	  public List<Documentdetails> getdata(int id) {
	  List<Documentdetails> list= hr.findAll();
	  return list;
	  }
 }
