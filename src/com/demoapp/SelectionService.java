package com.demoapp;

import org.springframework.stereotype.Component;

@Component
public class SelectionService implements SuggestionService {

	@Override
	public String giveSuggestion() {
		// TODO Auto-generated method stub
		return "Give 100%";
	}

	@Override
	public String nextStep() {
		// TODO Auto-generated method stub
		return "Domestic suggestion to be after a week";
	}
	
}
