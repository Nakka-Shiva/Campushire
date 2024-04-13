package com.spec;

public class PrimeChecker {
static Boolean isPrime(int n) {
int count=0,i;
for(i=1;i<n+1;i++) {
if(n%i==0) {
count++;
}
}
if(count==2) {
return true;
}
else {
return false;
}
}
public static void main(String[] args) {
System.out.println(isPrime(2));
System.out.println(isPrime(7));
System.out.println(isPrime(12));
System.out.println(isPrime(23));
System.out.println(isPrime(29));
}
}
