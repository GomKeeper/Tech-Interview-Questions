package com.thpark.pies.arrays;

public class FindNthSmallestNum {

	public static void main(String[] args) {
		int[] array = {12,5,75,3,8,32,7,23,11,17,9,4};
		
		for(int x = 1; x <= array.length; x++) {
		int result = findNthSmallest(array, x);
		System.out.println(x + " th element in the array = " + result);
		}
	}

	public static int findNthSmallest(int[] array, int nth) {
		if(array == null || nth < 1) { return -1; }
		if(array.length < nth) { return -2; }
		int start = 0, end = array.length-1;
		int nthIndex = nth-1;
		return doFindNthSmallest(array, nthIndex, start, end);
		
	}
	
	public static int doFindNthSmallest(int[] array, int nthIndex, int start, int end) {
		if(start > end) { return -2; }
		if(start == end && nthIndex == start) { 
			//System.out.println("start == end");
			return array[start]; }
		int pivotIndex = partition(array, start, end);
		
		if(pivotIndex > nthIndex) {
			return doFindNthSmallest(array, nthIndex, start, pivotIndex-1);
		} else if(pivotIndex < nthIndex) {
			return doFindNthSmallest(array, nthIndex, pivotIndex+1, end);
		} else {
			//System.out.println("nthIndex == pivotIndex");
			return array[pivotIndex];
		}
	}
	
	public static int partition(int[] array, int start, int end)
	{
	      int i = start, j = end;
	      int temp;
	      int pivotValue = array[(start + end) >>> 1];
	      while (i <= j) {
	            while (array[i] < pivotValue) { i++; }
	            while (array[j] > pivotValue) { j--; }
	            if (i <= j) {
	            	temp = array[i];
	            	array[i] = array[j];
	            	array[j] = temp;
	                i++;
	                j--;
	            }
	      };
	      return i;
	}
}