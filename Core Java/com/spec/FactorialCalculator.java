package com.spec;

public class FactorialCalculator {

public static int calculateFactorial(int n) {

int i,res=1;

for(i=1;i<n+1;i++) {

res=res*i;

}

return res;

}

public static void main(String[] args) {

int[] testCases={5,0,1,10,3};

for(int n:testCases) {

System.out.println("Factorial of "+n+" is: "+calculateFactorial(n));

}

}

}
