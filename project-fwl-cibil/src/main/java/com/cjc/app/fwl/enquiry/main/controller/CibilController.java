package com.cjc.app.fwl.enquiry.main.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fwl.enquiry.main.model.Score;
import com.cjc.app.fwl.enquiry.main.service.ServiceI;

@RestController
@CrossOrigin("*")
public class CibilController
 {
	@Autowired
	private ServiceI s;

	@GetMapping("/checkcibil/{pan}")
	public Score checkScore(@PathVariable("pan")String pan) 
	 {	
		Score sendScore = new Score();
		
		Random r = new Random();
		
		int score=r.nextInt(601)+300;
		System.out.println("myscore: " + score);
		s.saveEnquiry(score, pan);
		
		if(score >= 700)
		 {
			sendScore.setScore("score is good : "+score);
			return sendScore;
		 }
	
		else 
		 {
			sendScore.setScore("score is poor : "+score);
		      return sendScore;
	     }
	}		
 }
