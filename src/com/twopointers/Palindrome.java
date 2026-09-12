package com.twopointers;

public class Palindrome {
	public static void ispalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<=right) {
			if(str.charAt(left)!=str.charAt(right)){
				System.out.println("Not a palindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println("Palindrome");
	}
	public static void main(String[] args) {
		String str="LeveL";
		ispalindrome(str);
	}
}
