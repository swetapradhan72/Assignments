/**
 *Return a reverse and sorted array  
 */
package com.cg.Lab_2.util;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ReverseArrayTest {
	private ReverseArray revarray;
	 private static int[] EMPTY_ARRAY= {};
		private static int[] SINGLE_ARRAY= {1};
		private static int[] DOUBLE_ARRAY= {10,10};
		private static int[] DOUBLE_ARRAY_1= {10,20};
		private static int[] ANY_NUM_OF_ARRAY= {2,6,8,9,1};
		
		@Before
		public void setup() {
			revarray=new ReverseArray();
		}
	@Test
	public void testsorting_GiveEmptyArray_ShouldReturn0AsInteger() {
		int res=revarray.arraySorting(EMPTY_ARRAY);
				assertEquals(0,res);
	}
	
	@Test
	public void testsorting_GiveSingleArray_ShouldReturn1AsInteger() {
		int res=revarray.arraySorting(SINGLE_ARRAY);
		assertEquals(1,res);
	}
	
	@Test
	public void testduplicateArraySorting_GivenDuplicateArray_ShouldReturnOneElementAsArray() {
	int result_array[]={10};
	int res[]=revarray.duplicateArraySorting(DOUBLE_ARRAY);
	assertArrayEquals(result_array, res);
	}
	
	@Test
	public void testduplicateArraySorting_GivenTwoElementsOfArray_ShouldReturnOneElementAsArray() {
	int result_array[]={20,10};
	int res[]=revarray.doubleArraySorting(DOUBLE_ARRAY_1);
	assertArrayEquals(result_array, res);
	}
	
	@Test
	public void testremoveDuplicateAndSort_GivenArray_ShouldReturnSortedArray() {
	int result_array[]={9,8,6,2,1};
	int res[]=revarray.removeDuplicateAndSort(ANY_NUM_OF_ARRAY);
	assertArrayEquals(result_array, res);
	}
	
}
	


