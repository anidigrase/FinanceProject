package com.cjc.app.fwl.enquiry.main.service;

import java.util.List;

import com.cjc.app.fwl.enquiry.main.model.Documentdetails;

public interface DocsSeriveI {

	void savedata(Documentdetails d);

	List<Documentdetails> getdata(int id);

}
