package com.Recursion;

public class RecursiveDigitSum {
	public static int sum(int n) {
		if(n==0)
			return n;
		return n%10+sum(n/10);
	}
	public static void main(String[] args) {
		System.out.println("Recursive Sum Of Digits : "+sum(54321));
	}
}
