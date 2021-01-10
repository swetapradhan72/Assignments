package com.cg.Lab_3.util;

import java.util.Arrays;

public class PositiveString {

	public String getPositiveString(String str) {
		
		return null;
		
	}

	public String checkForWhitespace(String input) {
		int count=0;
		String output="";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				output+="WhiteSpace Exception Caught";
				break;
	}
			else {
	          count++;			
	}
			if(count==input.length())
				output+="No Exception Caught";
	}
		   return output;
	}

	public String checkForString(String input) {
		String output="";
		String op="";
		char ch[]=input.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++) {
			output+=ch[i];
		}
		if(input.equals(output)) {
			op+="positive string";
		}
		else {
			op+="Negative String";
		}
		return op;
	}

	
}
