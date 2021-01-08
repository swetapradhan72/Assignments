package com.cg.Lab_2.util;

import java.util.Arrays;

public class SecondSmallest {

	public int getSecondSmallest(int[] arr) {
		if(isEmpty(arr))
		{
		return 0;
	}else if(arr.length==2) {
		return Math.min(arr[0], arr[1]);
	}if(arr.length>2) {
		Arrays.sort(arr);
		return arr[1];
	}
		return 1;
	}

	private boolean isEmpty(int[] arr) {
		
		return arr.length==0;
	}

}
