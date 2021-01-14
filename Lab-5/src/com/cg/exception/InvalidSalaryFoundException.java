package com.cg.exception;

public class InvalidSalaryFoundException extends Exception {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public InvalidSalaryFoundException() {
	  super();
  }
  public InvalidSalaryFoundException(String errMsg) {
	  super(errMsg);
  }
}
