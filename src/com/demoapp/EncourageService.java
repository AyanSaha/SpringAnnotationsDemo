package com.demoapp;

import org.springframework.stereotype.Component;
//Step 1-->Define dependency class that implements dependency interface
@Component
public class EncourageService implements SuggestionService {

	@Override
	public String giveSuggestion() {
		return "Continue to work hard";
	}

	@Override
	public String nextStep() {
		// TODO Auto-generated method stub
		return "play domestic matches";
	}


}
