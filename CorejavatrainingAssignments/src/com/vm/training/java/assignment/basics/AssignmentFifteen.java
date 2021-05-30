package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentFifteen
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		Long number;
		int number_of_Digits=0;
		System.out.print("Input an integer number less than ten billion:");
		number=input.nextLong();
		while(number>0)
		{
			number=number/10;
			number_of_Digits++;                        //count number of digits
		}
		System.out.println(" Number of digits in the number: "+number_of_Digits);

	}

}

