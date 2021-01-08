/**
 * Get the second smallest element in the array 
 */

package com.cg.Lab_2.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SecondSmallestTest {
    private SecondSmallest ss;
	private static int[] SINGLE_ARRAY= {1};
	private static int[] DOUBLE_ARRAY= {1,2};
	private static int[] ANY_NUM_OF_ARRAY= {9,3,5,7,4,8};
	
	@Before
	public void setup() {
		ss=new SecondSmallest();
	}
	@Test
	public void testgetSecondSmallest_GiveEmptyArray_ShouldReturn0AsInteger() {
		SecondSmallest ss=new SecondSmallest();
		int []arr= {};
		int res= ss.getSecondSmallest(arr);
		assertEquals(0,res);
	}
	@Test
	public void testgetSecondSmallest_Give1InIntegerArray_ShouldReturn1AsInteger() {
		SecondSmallest ss=new SecondSmallest();	
		int res= ss.getSecondSmallest(SINGLE_ARRAY);
		assertEquals(1,res);
		
	}
	@Test
	public void testgetSecondSmallest_Give1And2InIntegerArray_ShouldReturn1AsInteger() {
		SecondSmallest ss=new SecondSmallest();	
		int res= ss.getSecondSmallest(DOUBLE_ARRAY);
		assertEquals(1,res);
	}
	
	@Test
	public void testgetSecondSmallest_GiveAnyNumInIntegerArray_ShouldReturnResAsInteger() {
		SecondSmallest ss=new SecondSmallest();	
		int res= ss.getSecondSmallest(ANY_NUM_OF_ARRAY);
		assertEquals(4,res);
	}
}


