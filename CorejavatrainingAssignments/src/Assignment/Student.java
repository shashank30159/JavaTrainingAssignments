package Assignment;

import java.util.HashMap;
public class Student
{
 HashMap name = new HashMap();
 HashMap address = new HashMap();
 HashMap department = new HashMap();
 void initialize()
 {
  name.put(100,"shashank");
  address.put(100, "Nizamabad");
  department.put(100, "D&C");
 }
 public void addStudent(int studentId,String studentName,String studentAddress,String studentDepartment)
 {
  name.put(studentId, studentName);
  address.put(studentId, studentAddress);
  department.put(studentId, studentDepartment);
 }
 public void displayStudent()
 {
  System.out.println(name);
  System.out.println(address);
  System.out.println(department);
 }
 public void updateAddressAndDepartment(int studentId,String studentAddress,String studentDepartment )
 {
  if(address.isEmpty()==false)
  {
  address.put(studentId, studentAddress);
  department.put(studentId,studentDepartment);
  }
 }
}