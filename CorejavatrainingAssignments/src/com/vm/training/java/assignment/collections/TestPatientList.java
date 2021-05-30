package com.vm.training.java.assignment.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class TestPatientList {

	static void dipalyPatientname(ArrayList<PatientList> orderpatientList)
	{
		List<String> sortedList = sortedList.stream().sorted().collect(Collectors.toList());
		for (String iterable_element : hm.keySet()) 
		{
			System.out.println(iterable_element);
		}
	}
	public static void main(String[] args) {
		ArrayList<PatientList> patientlist = new ArrayList<PatientList>();
		patientlist.add(new PatientList(1,"ravi",52));
		patientlist.add(new PatientList(2,"sam",26));
		patientlist.add(new PatientList(3,"bunny",43));
		
		
	}

}
