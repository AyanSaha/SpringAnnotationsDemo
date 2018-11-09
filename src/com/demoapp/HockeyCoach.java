package com.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
private SuggestionService suggestionservice;
 //constructor injection

/*
  public HockeyCoach(SuggestionService se) {
	  suggestionservice = se;
  }
*/
public HockeyCoach() {
	System.out.println("Inside Hockey coach constructor");
}
@Autowired
@Qualifier("encourageService")
public void setSuggestion(SuggestionService e) {
	System.out.println("Inside setSuggestion method...");
	suggestionservice = e;
}
   @Override
	public String getWorkOut() {
		return "defend for 50 minutes";
	}
	public String suggestion() {
		return suggestionservice.giveSuggestion();
	}

}
