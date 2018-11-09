package com.demoapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	private SuggestionService suggestionService;
	public CricketCoach() {
		//System.out.println("Inside cricket coach constructor..");
	}
	@Autowired
	@Qualifier("selectionService")
	public void setSuggestion(SuggestionService se) {
		suggestionService = se;
	}
	@Override
	public String getWorkOut() {
		return "Bowl 30 minutes of left arm wrist spin";
		
	}
	public String suggestion(){
		return suggestionService.giveSuggestion();
	}
	
	public String nextStep() {
	return suggestionService.nextStep();
	}
	
	//bean life cycle method/hook methods @PostConstruct and @PreDestroy,methods will not take any formal argument
	@PostConstruct
	public void doinitStuff() {
		System.out.println("after bean is created");
	}
	@PreDestroy
	public void dobeforeDestroy() {
		System.out.println("clean up before bean is destroyed");
	}
	

}
