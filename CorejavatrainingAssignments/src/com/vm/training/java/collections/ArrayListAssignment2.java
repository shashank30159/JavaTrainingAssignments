package com.vm.training.java.collections;
import java.util.*;

public class ArrayListAssignment2
{

  static void oddsum(ArrayList array)
  {
    Iterator<Integer> it=array.iterator();
    int oddsum=0;
    while(it.hasNext())
    {
      if(it.next()%2!=0)
      {
        oddsum+=it.next();
      }
    }
    System.out.println("Even sum:"+oddsum);
  }
  
  static void evensum(ArrayList array)
  {
    Iterator<Integer> it=array.iterator();
    int evensum=0;
    while(it.hasNext())
    {
      if(it.next()%2==0)
      {
        evensum+=it.next();
      }
    }
    System.out.println("Even sum:"+evensum);
  }
  static void acorder(ArrayList array)
  {
    Collections.sort(array);
    System.out.println("AC Order :"+array);
  }
  static void dcorder(ArrayList array)
  {
    Collections.reverse(array);
    System.out.println("DC Order :"+array);
  }
  public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(5);
    al.add(3);
    al.add(100);
    ArrayList<Integer> al1=new ArrayList<Integer>(al);
    System.out.println(al1);
    
    oddsum(al1);
    acorder(al1);
    dcorder(al1);
    evensum(al1);
  }
}