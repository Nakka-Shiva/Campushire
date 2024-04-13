package com.spec;

public class PalindromeChecker {
	   public static boolean isPalindrome(String str) {

	int i;

	char ch;

	String rs="";

	for(i=0;i<str.length();i++) {

	ch=str.charAt(i);

	rs=ch+rs;

	}

	if(str.equals(rs)) {

	return true;

	}

	else {

	return false;

	}
	   }

	   public static void main(String[] args) {
	       String[] testCases = {
	           "radar",
	           "level",
	           "hello",
	           "A man, a plan, a canal, Panama",
	           "12321"
	       };

	       for (String testCase : testCases) {
	           System.out.println(testCase + " is a palindrome: " + isPalindrome(testCase));
	       }
	   }
	}
	 