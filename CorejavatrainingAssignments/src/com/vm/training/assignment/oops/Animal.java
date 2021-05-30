package com.vm.training.assignment.oops;
public class Animal
{
 void walk()
 {
	 System.out.println("I can walking");
 }
}
class Bird extends Animal            //Bird inherit properties of animal
{
	void walk()
	{
		System.out.println("I can walk");
	}
	void fly()
	{
		System.out.println("I can flying");
	}
	void Sing()
	{
		System.out.println("I can singing");
	}
}

