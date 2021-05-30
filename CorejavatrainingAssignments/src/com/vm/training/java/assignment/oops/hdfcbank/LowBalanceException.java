package com.vm.training.java.assignment.oops.hdfcbank;

public class LowBalanceException extends Exception {
	  String msg;

	  public LowBalanceException(String msg) {
	    super();
	    this.msg = msg;
	  }

	  @Override
	  public String toString() {
	    return "LowBalanceException [msg=" + msg + "]";
	  }
	  
	}
