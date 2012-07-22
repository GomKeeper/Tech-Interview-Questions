package com.thpark.practice;

public class PracticeNthSmallestNum {

	public static void main(String[] args) {
		int[] intArray = {1,5,8,12,4,7,34,9,24,5,2,7,16,53};
		//int[] intArray = {1,2};
		int nth = 5;
		
		System.out.println(nth + " th smallest number = " + detectNthSmallest(intArray, nth));
	}

	
	public static int detectNthSmallest(int[] intArray, int nth) {
		if(intArray == null || nth < 0) { return -1; }
		if(nth > intArray.length){ return -2; }
		
		int smallest = intArray[0], localSmall = 0, initializer = 0;
		
		for(int i = 1; i < intArray.length; i ++) {
			if(intArray[i] < smallest) {
				smallest = intArray[i];
			}
			if(intArray[i] > initializer) {
				initializer = intArray[i];
			}
		}
		
		for(int j = 0; j < nth; j++) {
			localSmall = initializer;
			for(int k = 0; k < intArray.length; k++) {
				if(intArray[k] > smallest && localSmall > intArray[k]) {
					localSmall = intArray[k];
				}
			}
			System.out.println("smallest = " + smallest + " , localSmall = " + localSmall);
			smallest = localSmall;
		}
		
		return smallest;
	}
}
