package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentTen {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int number=input.nextInt();
		int number1=1;
		while(number1<=number){             //loop for spaces
			for(int i=1;i<=number1;i++)     //loop to print @ according to pattern
			{
				System.out.print("@");

			}
			System.out.println();
			number1++;
		}
	}

}




