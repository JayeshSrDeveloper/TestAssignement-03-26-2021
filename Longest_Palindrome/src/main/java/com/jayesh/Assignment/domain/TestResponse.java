package com.jayesh.Assignment.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@Value
public class TestResponse {
	String inputString;
	String longestPalindromicSubstring;

	public TestResponse(String inputString, String longestPalindromicSubstring) {

	}
}
