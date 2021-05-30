package com.vm.training.java.assignment.fileio;
import java.util.*;
import java.io.*;
public class BufferWriterTask {

	  public static void main(String[] args) throws IOException {
	    // TODO Auto-generated method stub
	    FileWriter fw=new FileWriter("C:\\vm\\shashank.txt");
	    BufferedWriter bw=new BufferedWriter(fw);
	    bw.write("Id"+" "+"Name"+" "+"Batch");
	    bw.newLine();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number how many time does data emter in the file :");
	    int n=sc.nextInt();
	    
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Enter id :");
	      String id=sc.next();
	      System.out.println("Enter name :");
	      String name=sc.next();
	      System.out.println("enter dept :");
	      String dpt=sc.next();
	      bw.write(id);
	      bw.write(" ");
	      bw.write(name);
	      bw.write(" ");
	      bw.write(dpt);
	      bw.newLine();
	      bw.flush();
	      
	    }
	    System.out.println("data recorded sucessfully");
	    
	  }

	}
