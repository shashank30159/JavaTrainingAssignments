package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentThrteen {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);

		System.out.print("Input the number: ");
		int range1=input.nextInt();         //input range1
		int range2=input.nextInt();         //input range2
		do{
			System.out.print(range1+" ");  //printing in given range 
			range1++;
		}while(range1<=range2);

	}

}




