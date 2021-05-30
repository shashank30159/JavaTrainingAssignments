package com.vm.training.java.assignment.collections;
import java.util.*;



class sortByPatientId implements Comparator<PatientList>
{
public int compare(PatientList o1, PatientList o2) {
    // TODO Auto-generated method stub
    if(o1.getPatientId()==o2.getPatientId())
      return 0;
    else if(o1.getPatientId()>o2.getPatientId())
      return 1;
    else
      return -1;
  }
  
}
class sortByPatientName implements Comparator<PatientList>
{

  @Override
  public int compare(PatientList o1, PatientList o2) {
    return o1.getPatientName().compareTo(o2.getPatientName());
  }
  
}

public class TestPatient {
	
	
	 static void display(Set<PatientList> ts1)
	  {
	    Iterator<PatientList> itr1=ts1.iterator();
	    while(itr1.hasNext())
	    {
	      System.out.println(itr1.next());
	    }
	  }
	static void getPatientAge(Set<PatientList> ts1)
	  {
	    for (PatientList p : ts1) {
	      System.out.println(p.getPatientName()+"="+p.getPatientAge());
	    }
	  }
	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    ArrayList<PatientList> al=new ArrayList<PatientList>();
	    al.add(new PatientList(1,"ravi", 21));
	    al.add(new PatientList(2,"arun", 18));
	    al.add(new PatientList(3,"sam", 20));
	    
	    System.out.println("=========total list of patients=======");
	    System.out.println(al);
	    
	    System.out.println("=========Sort by patient_id===========");
	    Collections.sort(al,new sortByPatientId());
	    for (PatientList p: al) {
	      System.out.println(p);
	    }
	    
	    
	    
	    System.out.println("=========Sorty by patient_name========");
	    Collections.sort(al,new sortByPatientName());
	    Iterator<PatientList> itr=al.iterator();
	    while(itr.hasNext())
	    {
	      System.out.println(itr.next());
	      
	    }
	    
	    
	    
	    System.out.println("========Storing the array list data to set========= ");
	    Set<PatientList> ts1=new HashSet<PatientList>(al);
	    display(ts1);
	    
	    
	    System.out.println("========print patientName = patientAge===========");
	    getPatientAge(ts1);
	    
	  }

	}


