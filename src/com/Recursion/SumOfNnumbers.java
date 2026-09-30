package com.Recursion;

public class SumOfNnumbers {
	public static int print(int n) {
		if(n==0) {
			return 0;
		}
		return n+print(n-1);
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println("sum of n natural numbers : "+print(5));
		System.out.println("---------------------------");
		
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of N natural numbers : "+sum);
	}
}
