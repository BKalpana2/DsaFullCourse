package com.searching;
public class FindString {
	public static void main(String[] args) {
		String str[]= {"kalpana","bathula","ganesh","santhosh"};
		String target="kalpana";
		boolean found=false;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(target)) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("String is there");
		}
		else {
			System.out.println("String is not there");
		}
	}
}

