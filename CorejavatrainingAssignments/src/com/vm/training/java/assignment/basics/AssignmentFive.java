package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentFive {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Input the year :");
		int year = input.nextInt(); 

		if ((year % 400 == 0) || (year % 4 == 0) ) {    //condition for leap year
			if(year % 100 != 0)
			{
				System.out.println(year+"year is a leap year");
			}
			else{
				System.out.println(year+"year is not a leap year");
			}

		}
	}

}



