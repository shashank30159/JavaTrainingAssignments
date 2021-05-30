package com.vm.training.assignment.oops;


public class TestArithmetic {

	public static void main(String[] args) {
		Adder adder = new Adder();

		System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());	

		System.out.print(adder.add(20,20) + " " + adder.add(7,6) + " " + adder.add(5,15) ); //calling add method to add given numbers

	}

}
