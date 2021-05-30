package com.vm.training.java.classassignments;

public class TestCar {

	public static void main(String[] args) {
		Car carspeed = new Car("BatMobile", 1965);
	
		for (int i = 1; i <= 5; i++)
		{
			carspeed.accelerate();
			System.out.println("Current speed after accelerate is: " + carspeed.getSpeed());
		}
		for (int j = 1; j <= 5; j++)
		{
			carspeed.brake();
			System.out.println("Current speed after break is: " + carspeed.getSpeed());
		}
	}

}
