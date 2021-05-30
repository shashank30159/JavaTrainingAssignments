package com.vm.traing.assignment.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TicketBooking {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		System.out.println("Enter the booking date in format:yyyy/MMM/dd for example 2021/May/25: ");
		String bookingDate=input.next();
		
		LocalDate today = LocalDate.now();
		
		LocalDate bkdate = LocalDate.parse(bookingDate,dtf1);
		if(bkdate.isAfter(today))
		{
			System.out.println("Ticket booked succesfully on:"+bookingDate);
		}
		else
			System.out.println("Ticket Cannot be booked for previous dates");
	}
}