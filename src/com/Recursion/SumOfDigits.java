package com.Recursion;

public class SumOfDigits {
	public static int print(int n) {
		if(n==0) {
			return 0;
		}
	return n%10+print(n/10);
	}
public static void main(String[] args) {
	System.out.println("Sum of Digits : "+print(1234));
	
}
}
