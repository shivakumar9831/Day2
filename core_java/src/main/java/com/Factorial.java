package com;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+" is "+fact);

	}

}
