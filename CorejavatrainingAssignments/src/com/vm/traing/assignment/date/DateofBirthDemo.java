package com.vm.traing.assignment.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateofBirthDemo {

	public static void main(String[] args) {
		LocalDate tillDate=LocalDate.now();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Bday");
		String str=sc.nextLine();
		LocalDate borndate=LocalDate.parse(str);
		Period period1=Period.between( borndate,tillDate);
		System.out.println("Year :"+period1.getYears()+" "+"Months :"+period1.getMonths()+" "+" Days :"+period1.getDays());
	}

}
