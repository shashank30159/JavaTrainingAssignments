package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentSeven
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int number,sum=0;

		System.out.println("Input the 5 numbers : ");
		for(int i=1;i<=5;i++)
		{
			number=input.nextInt();
			sum=sum+number;                     //calculating sum of five numbers
		}
		System.out.println("The sum of 5 numbers is : "+sum);
		System.out.println("The Average is : "+(float)(sum/5)); //calculating average of sum


	}


}

