package com.thpark.pies.arrays;

import com.thpark.library.TwoIndex;

public class FindZeroSumSubarray {
	
	public static void main(String[] args) {
		int[] array = {4,8,-3,-5,10,7,9};
		
		TwoIndex ti= findZeroSum(array);
		
		System.out.println("Subarray = {" + ti.fIndex + ","+ti.sIndex + "}");
	}

	public static TwoIndex findZeroSum(int[] intArr) {
		if(intArr == null) { return null; }
		int[] sumArr = new int[intArr.length];
		for(int i=0; i<intArr.length-1; i++ ) {
			sumArr[i] = intArr[i];
			for(int j=i+1; j<intArr.length; j++) {
				sumArr[j] = sumArr[j-1] + intArr[j];
				if(sumArr[j] == 0) {
					return new TwoIndex(i,j);
				}
			}
		}
		return null;
	}
}