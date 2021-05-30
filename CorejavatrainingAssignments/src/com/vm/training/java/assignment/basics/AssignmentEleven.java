package com.vm.training.java.assignment.basics;   //fibonacci series
import java.util.*;
public class AssignmentEleven {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int number1=0,number2=1,number3,number;  
		System.out.print("Input the number: ");
		number=input.nextInt();

		for(int i=2;i<number;i++)
		{    
			number3=number1+number2;              //adding two numbers to number3
			System.out.print(" "+number3);    
			number1=number2;    
			number2=number3;    
		}

	}

}


