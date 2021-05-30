package com.vm.training.java.assignment.fileio;

import java.util.*;
import java.io.*;

public class reverseString
{
	public static void main (String [] args)throws IOException
	{
		String s="";
		File f = new File("C:\\vm\\inputre.txt");
		FileReader br = new FileReader(f);
		int r=br.read();
		while(r!=-1)
		{
			s=s+(char)r;
			r=br.read();
		}
		br.close();
		StringBuffer sb=new StringBuffer(s);
		String s1=sb.reverse().toString();
		FileWriter fw=new FileWriter(f);

		fw.write(s1);
		fw.flush();
		fw.close();

		}

	
}
