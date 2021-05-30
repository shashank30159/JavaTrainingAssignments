package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentOne {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);  //Scan the input
		int number=in.nextInt();
		if(number>0)                //Checking number is grater than 0
		{
			System.out.println("Given Number is positive");   
		}
		else if (number<0)          //checking number is less than 0
		{
			System.out.println("Given Number is negative");   
		}
		else{
			System.out.println("Given Number is neither negative nor positive");
		}

	}

}
