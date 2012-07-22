package com.thpark.practice;

public class findNthSmallestElement {

	public static void main(String[] args) {
		int[] array = {4,10,2,6,9,11,64,100,33,50,1,44,23,87};
		int nth = 3;
		
		int result = findNthSmallest(array, nth);
		System.out.println("Nth number is " + result);
	}
	
	public static int findNthSmallest(int[] array, int nth) {
		if(array == null || nth < 0 || nth > array.length) { return -1; }
		if(array.length == 1) { return array[0]; }
		int smallest = array[0], resetValue = array[0], localSmallest = 0;
		for(int i = 1; i < array.length-1; i++) {
			if(smallest > array[i]) {
				smallest = array[i];
			}//if statement
			if(resetValue < array[i]) {
				resetValue = array[i];
			}//if statement
		}//for loop
		for(int j = 0; j < nth; j++) {
			localSmallest = resetValue;
			for(int k = 0; k < array.length-1; k++) {
				if(array[k] > smallest && localSmallest > array[k]) {
					localSmallest = array[k];
				}//if statement
			}//for loop
			//System.out.println(localSmallest);
			smallest = localSmallest;
		} //for loop
		return smallest;
	} //findNthSmallest

}
