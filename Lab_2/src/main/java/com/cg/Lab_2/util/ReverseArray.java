package com.cg.Lab_2.util;

import java.util.Arrays;

public class ReverseArray {

	public int arraySorting(int [] arr) {
		if(isEmpty(arr)) {
			return 0;
		}
		return 1;
	}
	

	private boolean isEmpty(int[] arr) {
		
		return arr.length==0;
	}


	public int[] duplicateArraySorting(int[] anArray) {
		 int ar[]= new int[1];
		 if(anArray[0]==anArray[1]) {
			 ar[0]=anArray[0];
	}    
		     return ar; 
	
	}


	public int[] doubleArraySorting(int[] input) {
		int double_array[]=new int[2];
		 Arrays.sort(input);
		 double_array[0]= input[1];
		 double_array[1]= input[0];
	     return double_array; 
	}


	public int[] removeDuplicateAndSort(int[] anyArray) {
		int sameValue[]=new int[5];
		Arrays.sort(anyArray);
		int l=anyArray.length;
		for(int i=0;i<l;i++) {
	    		sameValue[i]=anyArray[l-1];
	    		l=l-1;
		}
		return sameValue;
	}
	

}
