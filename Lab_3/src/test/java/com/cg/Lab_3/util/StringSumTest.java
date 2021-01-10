/**
 * reads a line of integers and then displays each integer and the sum of all integers
 */

package com.cg.Lab_3.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringSumTest {
	 private StringSum ss;
	  private static String EMPTY_STRING="";
	  private static String SINGLE_STRING="10";
	  private static String DOUBLE_STRING="10,20";
	  private static String ANY_NO_STRING="1,3,6,7";
	  
	@Before
	  public void setup() {
		  ss=new StringSum();
	  }
		@Test
		public void testStringCalculator_GivenEmptyString_ShouldReturnAsInteger() {
			int res=ss.stringCalculator(EMPTY_STRING);
			assertEquals(0,res);
		}
		
		@Test
		public void testStringCalculator_GiveSingleString_ShouldReturnInteger() {
			int res=ss.stringCalculator(SINGLE_STRING);
			assertEquals(10,res);
		}
		@Test
		public void testStringCalculator_GiveDoubleString_ShouldReturnInteger() {
			int res=ss.stringCalculator(ANY_NO_STRING);
			assertEquals(17,res);
		}


	
}
	


