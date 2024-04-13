package com.spec;

public class VowelConsonantCounter {
	  public static void main(String[] args) {

	String s="Alphabets";

	System.out.println("The number of vowels in "+s+" are : "+vowelsCount(s.toLowerCase()));

	System.out.println("The number of consonants in "+s+" are : "+consonantsCount(s.toLowerCase()));
	  }

	static int vowelsCount(String w) {

	int i,count=0;

	char ch;
	w.toLowerCase();

	for(i=0;i<w.length();i++) {

	ch=w.charAt(i);

	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {

	count++;

	}

	}

	return count;

	}

	static int consonantsCount(String w) {

	int count=0,i;
	char ch;

	for(i=0;i<w.length();i++) {
	   ch=w.charAt(i);
	   if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
	       count++;
	   }
	}

	return count;
	}
	}
	 