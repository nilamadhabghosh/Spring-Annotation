package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	//Field Injection
	
	@Autowired
	@Qualifier("randomFortune")
    private FortuneService fortuneservice;
	
	
	
//	@Autowired
//	public TennisCoach(FortuneService thefortuneservice) {
//		fortuneservice = thefortuneservice;
//	}
	
	public TennisCoach() {
		
	}
	
	//setter Method
//	@Autowired
//	public void setFortuneService(FortuneService thefortuneservice) {
//		fortuneservice = thefortuneservice;
//	}
	
	//MEthod INjection
	
//	@Autowired
//	public void dosomecrazystuff(FortuneService thefortuneservice) {
//		fortuneservice = thefortuneservice;
//	}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Daily 30 min workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
