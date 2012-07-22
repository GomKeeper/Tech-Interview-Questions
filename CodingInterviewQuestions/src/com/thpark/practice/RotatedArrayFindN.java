package com.thpark.practice;

public class RotatedArrayFindN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {3,4,5,6,7,8,9,10,11,12,1,2};
		
		int n = 5;
		int i = findN(array, n);
		
		System.out.println(n + " is in " + (i+1) + " th place.");
	}

	public static int findN(int[] array, int n) {
		if(array == null || n < 0) { return -1; }
		int start = 0, end = array.length-1;
		return doFindN(array, n, start, end);
	}//findN

		public static int doFindN(int[] array, int n, int start, int end) {
			if(start > end) { return -3; }
			int mid = (end + start) >> 1;
			if(array[mid] == n) { return mid; }
			if(array[start] < array[mid]) { // bottom half is sorted
				if(array[start] < n && n < array[mid]) {
					return doFindN(array, n, start, mid-1);
				} else {
					return doFindN(array, n, mid+1, end);
				}
			} else { // upper half is sorted
				if(array[mid] < n && n < array[end]) {
					return doFindN(array, n, mid+1, end);
				} else {
					return doFindN(array, n, start, mid-1);
				}
			}
		} //doFindN
}
