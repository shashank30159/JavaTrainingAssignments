package com.vm.training.assignment.oops;
class MyCalculator implements AdvArithmetic {  

	@Override
	public int divisor_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)   //loop to add numbers input 6 1+2+3+6=12
		{
			if(n%i==0)
			{
				sum=sum+i;      //to sum according to given number
			}
		}
		return sum;
	}

}
