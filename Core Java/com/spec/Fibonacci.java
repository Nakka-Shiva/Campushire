package com.spec;

public class Fibonacci {
	  
	  public static void main(String[] args) {
	      int n = 10;
	      System.out.println("Fibonacci series up to " + n + " terms:");
	      printFibonacci(n);
	  }
	  
	  public static void printFibonacci(int n) {

	int[] fib=new int[n];
	int i;
	fib[0]=0;

	fib[1]=1;

	System.out.print(fib[0]+" "+fib[1]+" ");

	for(i=2;i<10;i++) {

	fib[i]=fib[i-1]+fib[i-2];

	System.out.print(fib[i]+" ");

	}
	  }
	}
	 