package com.thpark.pies.arrays;

public class FindCombiSum {

	public static void main(String[] args) {
		int[] array = {12,5,75,3,8,32,7,23,11,17,9,4};
		int n = 0;
		
		System.out.println(sumExist(array, n));
	}

	public static boolean sumExist(int[] intArr, int n) {
		if (intArr == null) { return false; }
		int index = 0, sum = 0;
		return doesSumExist(intArr, n, sum, index);
	}
	
	public static boolean doesSumExist(int[] intArr, int n, int sum, int currIndex) {
		int localSum = sum + intArr[currIndex];
		if(localSum == n) {
			return true;
		}
		
		for(int i = currIndex+1; i < intArr.length; i++) {
			if(doesSumExist(intArr, n, localSum, i)) {
				return true;
			}
		}
			
		return false;	
	}
}
