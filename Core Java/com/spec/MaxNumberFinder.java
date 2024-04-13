package com.spec;

public class MaxNumberFinder {
	   public static int findMax(int[] nums) {

	int i,max=nums[0];

	for(i=0;i<nums.length;i++) {

	if(max<nums[i]) {

	max=nums[i];

	}

	}

	return max;
	   }

	   public static void main(String[] args) {
	       int[] test1 = {1, 2, 3, 4, 5};
	       System.out.println("Max number in test1: " + findMax(test1));
	       
	       int[] test2 = {-1, -5, -2, -9};
	       System.out.println("Max number in test2: " + findMax(test2));
	       
	       int[] test3 = {10, 5, 20, 15};
	       System.out.println("Max number in test3: " + findMax(test3));
	       
	       int[] test4 = {0};
	       System.out.println("Max number in test4: " + findMax(test4));
	       
	       int[] test5 = {-10, -20, -5, -3};
	       System.out.println("Max number in test5: " + findMax(test5));
	   }
	}
	 
