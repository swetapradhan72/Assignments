/**
 * accept an array of String objects and sort in
Alphabetical order

 */

package com.cg.Lab_2.util;

import static org.junit.Assert.*;

import javax.swing.SortingFocusTraversalPolicy;

import org.junit.Before;
import org.junit.Test;

public class SortStringsTest {
	 private SortStrings sortstring;
	 private static String[] EMPTY_STRING= {};
		private static String[] SINGLE_STRING= {"sweta"};
		private static String[] DOUBLE_STRING= {"java","software"};
		private static String[] ANY_NUM_OF_STRING= {"zebra","ball","jet","dog"};
		private static String[] ANY_NO_OF_STRING= {"Ram","Sita","Laxman","Hanuman","Shiva","Vishnu"};
		
		@Before
		public void setup() {
			sortstring=new SortStrings();
		}
	@Test
	public void testsorting_GiveEmptyString_SouldReturnNullAsString() {
		String res=sortstring.sorting( EMPTY_STRING);
		assertEquals(null,res);
	}
	
	@Test
	public void testsorting_GiveSingleString_SouldReturnThatStringAsString() {
		String res=sortstring.sorting(SINGLE_STRING);
		assertEquals("sweta",res);
	}
	
	@Test
	public void testsorting_GiveDoubleString_SouldReturnThatStringAsString() {
		String res=sortstring.sorting(DOUBLE_STRING);
		String s="JAVA software ";
		assertEquals(s,res);
	}
	
	@Test
	public void testsorting_GiveAnyNumOfString_SouldReturnThatStringAsString() {
		String res=sortstring.sorting(ANY_NUM_OF_STRING);
		String a="BALL DOG jet zebra ";
		assertEquals(a,res);
	}
	
	@Test
	public void testsorting_GiveAnyNoOfString_SouldReturnThatStringAsString() {
		String res=sortstring.sorting(ANY_NO_OF_STRING);
		String a="HANUMAN LAXMAN RAM shiva sita vishnu ";
		assertEquals(a,res);
	}
	

}
