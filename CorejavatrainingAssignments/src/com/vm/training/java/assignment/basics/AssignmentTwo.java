package com.vm.training.java.assignment.basics;
import java.util.*;
public class AssignmentTwo
{
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.print("Input Number 1 :");
	    int number=sc.nextInt();
	   System.out.print("Input Number 2 :");
	    int number1=sc.nextInt();
	    System.out.print("Input Number 3 :");
	    int number2=sc.nextInt();
	    if(number>number1 && number>number2)    //checking given number is grater than other two numbers
	    {
	        System.out.print("The greatest:"+number);
	    }
	    else if(number1>number2 && number1>number)   //checking given number1 is grater than other two numbers
	    {
	        System.out.print("The greatest:"+number1);
	    }
	    else{                                       //checking given number is grater than other two numbers
	    System.out.print("The greatest:"+number2);
	    }
	}
}

