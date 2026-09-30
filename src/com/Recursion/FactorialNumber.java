package com.Recursion;

public class FactorialNumber {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Factorial Number : "+fact(5));
		System.out.println("------------------------------------");
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Number : "+fact);
	}
}
