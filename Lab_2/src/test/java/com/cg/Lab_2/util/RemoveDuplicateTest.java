package com.cg.Lab_2.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicateTest {
	private RemoveDuplicate remdup;
	    private static int[] EMPTY_ARRAY= {};
		private static int[] SINGLE_ARRAY= {1};
		private static int[] DOUBLE_ARRAY= {10,10};
		private static int[] ANY_NUM_OF_ARRAY= {2,2,6,8,9,5,1,8};
		
		@Before
		public void setup() {
			remdup=new RemoveDuplicate();
		}
	@Test
	public void test_GiveEmptyArray_ShouldReturn0AsInteger() {
		int res=remdup.removingDuplicate(EMPTY_ARRAY);
				assertEquals(0,res);
	}
	
	@Test
	public void test_GiveSingleArray_ShouldReturn1AsInteger() {
		int result[]= {1};
		int res[]=remdup.sortSingleArray(SINGLE_ARRAY);
		assertArrayEquals(result,res);
	}
	@Test
	public void test_GiveDoubleInIntegerArray_ShouldReturnAsInteger() {	
		int res= remdup.removingDoubleDuplicate(DOUBLE_ARRAY);
		assertEquals(10,res);
	}
	
	@Test
	public void test_GiveAnyIntegerArray_ShouldReturnAsInteger() {	
		int result[]= {9,8,6,5,2,1};
		int res[]= remdup.removingAnyDuplicate(ANY_NUM_OF_ARRAY);
		assertArrayEquals(result,res);
	}

}
