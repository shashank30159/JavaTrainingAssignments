package com.vm.training.java.assignment.fileio;
import java.util.*;
import java.io.*;
public class EvenNumbers {

	  public static void main(String[] args) throws IOException {
	    File f=new File("numbers1.txt");
	    if(f.exists())
	    {
	      System.out.println("file is already present");
	    }
	    else
	    {
	      System.out.println("file is not present");
	      f.createNewFile();
	      System.out.println("file created");
	    }
	    Scanner input = null;
	    try {
	      input = new Scanner(new File("numbers1.txt"));
	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }

	    int even=0;
	    while(input.hasNextDouble()) {
	      double next = input.nextDouble();

	      if(next%2==0)
	        even++;
	    }


	    System.out.println("\nEven Numbers: " + even);
	  }
	}