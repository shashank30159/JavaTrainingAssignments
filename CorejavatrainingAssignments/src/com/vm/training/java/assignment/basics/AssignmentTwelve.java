package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentTwelve {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);

		System.out.print("Input the number: ");
		int number=input.nextInt();
		int sum=0;
		while(number>0)                   //without using array here using while loop
		{
			int number1=input.nextInt();
			if(number1>0)
			{
				sum=sum+number1;
			}
			number--;
		}
		System.out.println(sum);

	}

}

