package com.vm.training.java.collections;
import java.util.*;

public class StudentsMarks {
	static void avgOfMarkes(ArrayList<Integer> studentmarks,int n)
	{
		int avg=0;
		for (Integer integer : studentmarks) {
			avg+=integer;
		}
		System.out.println(avg/n);
	}

	static void highestmark (ArrayList<Integer> studentmarks)
	{
		int max=1;
		for (Integer integer : studentmarks) {
			if(max<integer)
			{
				max=integer;
			}
		}
		System.out.println(max);
	}

	static void sortOfList(ArrayList<Integer> studentmarks,int n)
	{
		int count=0;
		for (Integer integer : studentmarks) {
			count++;
			if(count==n)
			{
				System.out.println(integer);
			}
		}
	}


	static void sortOfArray(ArrayList<Integer> studentmarks)
	{
		Collections.sort(studentmarks);
		Iterator itr=studentmarks.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}


	public static void main(String[] args) {
		ArrayList<Integer> studentmarks=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students :");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			int marks;
			System.out.println("Enter the marks of "+i+"st"+" "+"Student :");
			marks=sc.nextInt();
			studentmarks.add(marks);
		}
		System.out.println("=======highest mark========="); 
		highestmark(studentmarks);
		System.out.println("=======Average of marks======");
		avgOfMarkes(studentmarks,n);
		System.out.println("=======print the paticuler person======");
		System.out.println("Enter the paticuler person id ");
		int m=sc.nextInt();
		sortOfList(studentmarks,m);
		System.out.println("======Sorted ArrayList========");
		sortOfArray(studentmarks);
	}
}

