package com.vm.training.java.assignment.basics;


import java.util.*;
public class AssignmentFourteen
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int number1=0,number2=0,number3=0;
		for(int i=1;i<=3;i++)
		{
			if(i==1)
			{
				System.out.print("Input first number :");
				number1=input.nextInt();
			}
			else if(i==2)
			{
				System.out.print("Input second number :");
				number2=input.nextInt();
			}
			else
			{
				System.out.print("Input third number :");
				number3=input.nextInt();
			}

		}
		if((number1<number2)&&(number2<number3))
		{
			System.out.println("Increasing");
		}
		else if((number1>number2)&&(number2>number3))
		{
			System.out.println("decreasing");
		}
		else{
			System.out.println("Neither increasing or decreasing order");
		}

	}

}

