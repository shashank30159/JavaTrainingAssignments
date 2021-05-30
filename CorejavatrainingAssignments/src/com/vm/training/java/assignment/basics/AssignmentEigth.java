package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentEigth {

	public static void main(String[] args) {
		int number;

	    System.out.print("Input number of terms : ");
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			    number = input.nextInt();

	     for(int i=1;i<=number;i++)
	     {
	     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));  //calculating cube for number
	     }
	}
}





