package com.cg.Lab_2.util;

import java.util.Arrays;

public class RemoveDuplicate {

	public int removingDuplicate(int[] arr) {
		return 0;
	}

	public int[] sortSingleArray(int[] input) {
			return input;
	}

	public int removingDoubleDuplicate(int[] arr) {
		if(arr[0]==arr[1])
		{
			return arr[0];
		}
		return 0;
	}

	public int[] removingAnyDuplicate(int[] input) {
		Arrays.sort(input);
		String unique_integer="";
		int j=0;
		int count=0;
		for(int i=0;i<input.length;i++){
			for(int k=i+1;k<input.length;k++) {
			if(input[i]==input[k]){
				count++;  
	}
	}
			if(count==0) {
				unique_integer+=input[i];  
				  j++;
	}
			count=0;
	}
	       int n=Integer.parseInt(unique_integer);
	       int modify_Array[]=new int[j];
	       for(int i=0;i<j;i++) {
		   modify_Array[i]=n%10;
		   n=n/10;
	}
		   return modify_Array;
	}
}




