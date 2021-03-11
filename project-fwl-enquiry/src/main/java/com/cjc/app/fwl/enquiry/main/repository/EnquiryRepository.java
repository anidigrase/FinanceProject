package com.cjc.app.fwl.enquiry.main.repository;





import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fwl.enquiry.main.model.EnquiryDetails;

@Repository
public interface EnquiryRepository extends JpaRepository<EnquiryDetails, Integer>{
	
	
List<EnquiryDetails>findIdByEnqpancardno(String enqpancardno);

List<EnquiryDetails> findByStatus(String st);
	

}
