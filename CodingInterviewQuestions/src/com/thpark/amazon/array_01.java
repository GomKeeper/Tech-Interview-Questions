package com.thpark.amazon;

import java.util.ArrayList;
import java.util.Hashtable;

public class array_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayA = {1,2,3,4,5,6,7,8,9,10};
		int[] arrayB = {1,5,7,19,10,34,35,7,44,65,99};
		
		findIntersections(arrayA, arrayB);
		
	}

	public static void findIntersections(int[] arrA, int[] arrB) {
		Hashtable arrHash = new Hashtable();
		ArrayList intersections = new ArrayList();
		
		for (int i = 0; i < arrA.length; i++ ) {
			arrHash.put(arrA[i], 1);
		}
		
		for (int j = 0; j < arrB.length; j++) {
			if(arrHash.containsKey(arrB[j])) {
				intersections.add((Integer)arrB[j]);
			}
		}
		
		for(Object x : intersections) {
			System.out.println(x);
		}
	}
}
