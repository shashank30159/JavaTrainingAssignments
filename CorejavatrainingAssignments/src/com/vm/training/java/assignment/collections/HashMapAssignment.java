package com.vm.training.java.assignment.collections;
import java.util.*;
public class HashMapAssignment {

	
		
		static void addContact(LinkedHashMap contacts, String name, String number) {
			contacts.put(name,number);
			System.out.println(contacts);
		}
		static void removeContact(LinkedHashMap contacts,String name) {
			contacts.remove(name);
			System.out.println(contacts);
		}
		
		static void DisplayContacts(LinkedHashMap contacts) {
			System.out.println(contacts);
		}
		public static void main(String[] args) {
			
			
		LinkedHashMap contacts=new LinkedHashMap();
		
		addContact(contacts,"shashank","96422225565");
		addContact(contacts,"sasi","98456612335");
		addContact(contacts,"rakesh","86614534556");
		
		
		
		removeContact(contacts,"raman");
		System.out.println("after removing contact"+contacts);
		
		DisplayContacts(contacts);
		
		
		
				
	}

}
