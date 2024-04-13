package com.spec;

public class ReverseString {

static String reverseString(String w) {

int i;

char ch;

String rw="";

for(i=0;i<w.length();i++) {

ch=w.charAt(i);

rw=ch+rw;

}

return rw;

}

public static void main(String[] args) {

System.out.println(reverseString("hello"));

System.out.println(reverseString("Java"));

System.out.println(reverseString("world"));

System.out.println(reverseString("12345"));

System.out.println(reverseString(""));

}

}
