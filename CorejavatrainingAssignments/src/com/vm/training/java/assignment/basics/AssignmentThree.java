package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentThree{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);            //input using scanner class
		System.out.print("Input number : ");
		int day = in.nextInt();
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:                                 //when we provide grater than 7 it switch case will check default case
			System.out.println("Please Enter a valid input");
			break;
		}
	}
}




