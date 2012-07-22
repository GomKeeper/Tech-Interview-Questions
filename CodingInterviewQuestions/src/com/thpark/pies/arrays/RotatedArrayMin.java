package com.thpark.pies.arrays;

public class RotatedArrayMin {

	public static void main(String[] args) {
		int[] array = {3,4,5,6,7,8,9,10,11,12,1,2};
		
		int min = findMinNum(array);
		System.out.println("Minimum number = " + min);
	}
	
	public static int findMinNum(int[] array) {
		if(array == null) { return -1; }
		if(array.length == 1) { return array[0]; }
		if(array.length == 2) { return array[0] < array[1] ? array[0] : array[1]; }
		
		int start = 0, end = array.length-1;
		return doFindMinNum(array, start, end);
	}

	public static int doFindMinNum(int[] array, int start, int end) {
		if( start >= end) {
			return array[start];
		}
		int mid = (start + end) >>> 1;
		if(array[mid] > array[end]) { //min is in upper
			return doFindMinNum(array, mid+1, end);
		} else {
			return doFindMinNum(array, start, mid);
		}
		
	}
}
