/**
 * accepts a String and checks if it is a positive string
 */

package com.cg.Lab_3.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PositiveStringTest {
  private PositiveString ps;
  private static String EMPTY_STRING="";
  private static  String NEG1_STRING = "AB c";
  private static String NEG_STRING="SWETA";
  private static String POS_STRING="ABCD";
  
  @Before
  public void setup() {
	  ps=new PositiveString();
  }
	@Test
	public void testgetPositiveString_GiveEmptyString_ShouldReturnNull() {
		String res=ps.getPositiveString(EMPTY_STRING);
		assertEquals(null,res);
	}
	@Test
	public void test_whitespace_ShouldReturnException() {
	    String exp_result="WhiteSpace Exception Caught";
	       String act_result= ps.checkForWhitespace( NEG1_STRING);
	       assertEquals(exp_result,act_result);
	}
	
	@Test
	public void testNegString_GiveNegativeString_ShouldReturn() {
		String exp_res="Negative String";
		String res=ps.checkForString(NEG_STRING);
		assertEquals(exp_res,res);
	}
	@Test
	public void testPosString_GivePositiveString_ShouldReturn() {
		String exp_res="positive string";
		String res=ps.checkForString(POS_STRING);
		assertEquals(exp_res,res);
	}
	

}
