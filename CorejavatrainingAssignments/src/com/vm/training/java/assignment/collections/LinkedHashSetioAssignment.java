package com.vm.training.java.assignment.collections;
import java.util.*;
import java.io.*;

public class LinkedHashSetioAssignment {
	
	static void deleteTheSpecificElement(Set<String> lhs)
	  {
	    String s="Delhi";
	    lhs.remove(s);
	    for (String string : lhs) {
	      System.out.println(string);
	    }
	  }
	
	static void displayTheStateNameStartWithK(Set<String> lhs)
	  {
	    for(String s:lhs)
	    {
	      if(s.startsWith("K"))
	      {
	        System.out.println(s);
	      }
	    }
	  }
	
	static void sortTheList(Set<String> lhs)
	  {
	    TreeSet<String> ts=new TreeSet<String>(lhs);
	    System.out.println(ts);
	  }
	  public static void main(String[] args) throws IOException
	  {
	    FileReader fr=new FileReader("C:\\vm\\States.txt");
	    BufferedReader br=new BufferedReader(fr);
	    Set<String> lhs=new LinkedHashSet<String>();
	    
	    String readlines=br.readLine();
	    while(readlines!=null)
	    {
	      
	      lhs.add(readlines);
	      readlines=br.readLine();
	    }  
	    System.out.println("============Data that was present int the LinkedHashSet============");
	    int count=0;
	    for (String s : lhs)
	    {
	      System.out.println(s);
	      count++;
	    }
	    System.out.println("==========No of states that was present in the list============");
	    System.out.println(count);
	    
	    System.out.println("==========Remove delhi from the List and display============");
	    deleteTheSpecificElement(lhs);
	     
	    System.out.println("==========print the state name starting with 'k'  ============");
	    displayTheStateNameStartWithK(lhs);
	    
	    System.out.println("=========print the list in sorted order============");
	    sortTheList(lhs);
	    
	  }

	}

