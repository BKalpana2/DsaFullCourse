package com.Recursion;

public class ReverseString {

    public static String print(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }

        return str.charAt(str.length() - 1)
                + print(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {

        System.out.println("Reverse a String : " + print("kalpana"));
    }
}