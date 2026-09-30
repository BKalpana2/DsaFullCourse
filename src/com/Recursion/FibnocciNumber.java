package com.Recursion;

public class FibnocciNumber {
	public static int print(int n) {
		if(n<=1)
			return 1;
		return print(n-1)+print(n-2);
	}
	public static void main(String[] args) {
		System.out.println("Fibnocci Number : "+print(65));
	}
}
