package com.vm.training.java.assignment.oops.hdfcbank;

public class MoneyOnHold extends Exception 
{
  String s;

  public MoneyOnHold(String s) {
    super();
    this.s = s;
  }

  @Override
  public String toString() {
    return "MoneyOnHold [s=" + s + "]";
  }
  
}
