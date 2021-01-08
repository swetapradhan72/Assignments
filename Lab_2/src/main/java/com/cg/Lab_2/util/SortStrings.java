package com.cg.Lab_2.util;

import java.util.Arrays;

public class SortStrings {

	public String sorting(String[] string) {
		if(isEmpty(string)) {
		return null;
	}else if(string.length>1&&string.length%2==0) {
		return evenSortString(string) ;
		} else if(string.length>1&&string.length%2!=0) {
			return oddSortingString(string);
		}
		return string[0];
	}
	

	private String oddSortingString(String[] string) {
		Arrays.sort(string);
		int l=string.length;
		String odd_string= "";
		for(int i=0;i<(l/2)+1;i++) {
			odd_string+=string[i].toUpperCase()+" ";
		}
		for(int j=(l/2)+1;j<l;j++) {
			odd_string+=string[j].toLowerCase()+" ";
		}
		return odd_string;
	}


	private String evenSortString(String[] string) {
		Arrays.sort(string);
		int l=string.length;
		String even_string="";
		for(int i=0;i<l/2;i++) {
			even_string+=string[i].toUpperCase()+" ";
		}
		for(int j=(l/2);j<l;j++) {
			even_string+=string[j].toLowerCase()+" ";
		}
		return even_string;
	}













	private boolean isEmpty(String[] string) {
		
		return string.length==0;
	}

}
