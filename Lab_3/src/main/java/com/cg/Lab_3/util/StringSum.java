package com.cg.Lab_3.util;

import java.util.Arrays;

public class StringSum {

	public int stringCalculator(String str) {
		if(isEmpty(str)) {
		return 0;
	}else if(str.length()==1) {
		return Integer.parseInt(str);
	     }else {
		return Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).sum();
		}
	

}

	private boolean isEmpty(String str) {
		
		return str.length()==0;
	}
}
