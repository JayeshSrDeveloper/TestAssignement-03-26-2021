package com.jayesh.Assignment.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jayesh.Assignment.entity.Palin;
import com.jayesh.Assignment.repo.TestRepo;


@Service
public class TestService {

	PalindromeService palinService; // use interface so that we can easily swap implementation
									//  STRATEGY design pattern
	TestRepo repo;
	
	// use constructor injection because both dependencies are required
	public TestService(PalindromeService palinService, TestRepo repo) {
		this.palinService = palinService;
		this.repo = repo;
	}
	
	public String getLongestPalindromicSubstring(String inputString) {
		Optional<Palin> palinOptional = repo.findByName(inputString);
		if(palinOptional.isPresent()) {
			return palinOptional.get().getLongestPalin();
		}
		String longest = palinService.getLongestPalindromicSubstring(inputString);
		Palin entity = new Palin(inputString, longest);
		repo.save(entity);
		return longest;
	}
}
