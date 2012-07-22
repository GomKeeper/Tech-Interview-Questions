package com.thpark.ccis.recursion;

import com.thpark.library.*;

public class NthFibonnaci {

	public static void main(String[] args) {
		int nth = 20;
		long startSec, elapsedSec;
		/*
		startSec = System.currentTimeMillis();
		int fibNum = findNthFib(nth);
		long elapsedSec = System.currentTimeMillis() - startSec;
		System.out.println("fib = " + fibNum);
		System.out.println("Elapsed ms = " + elapsedSec + " ms");
		*/
		startSec = System.currentTimeMillis();
		int newFibNum = findLinearNthFib(nth);
		elapsedSec = System.currentTimeMillis() - startSec;
		System.out.println("new fib = " + newFibNum);
		System.out.println("Elapsed ms = " + elapsedSec + " ms");
		
		/*
		startSec = System.currentTimeMillis();
		int[] newRecFibNum = findRecursiveLinearNthFib(nth);
		elapsedSec = System.currentTimeMillis() - startSec;
		System.out.println("new Rec fib = " + newRecFibNum[0]);
		System.out.println("Elapsed ms = " + elapsedSec + " ms");
		*/
		
		startSec = System.currentTimeMillis();
		TwoElement RecLinNum = findRecLinearNthFib(nth);
		elapsedSec = System.currentTimeMillis() - startSec;
		System.out.println("new Rec fib = " + (Integer)RecLinNum.getFirst());
		System.out.println("Elapsed ms = " + elapsedSec + " ms");
	}
	
	public static int findNthFib(int n) {
		
		return (n <= 1) ? n : (findNthFib(n-1) + findNthFib(n-2)); 
	}

	public static int findLinearNthFib(int n) {
		if(n < 0) { return -1; }
		int previous = -1;
		int result = 1, sum;
		for(int i = 0; i <= n; i++) {
			sum = previous + result;
			previous = result;
			result = sum;
		}
		
		return result;
	}
	/*
	public static int[] findRecursiveLinearNthFib(int n) {
		if(n < 0) { return null; }
		int[] result = new int[2];
		int temp;
		if(n == 1) {
			result[0] = n;
			result[1] = 0;
			return result;
		} else {
			result = findRecursiveLinearNthFib(n-1);
			temp = result[0];
			result[0] += result[1];
			result[1] = temp;
			
			return result;
		}
		
	}
	*/
	public static TwoElement findRecLinearNthFib(int n) {
		if(n < 0) { return null; }
		TwoElement twoInt;
		if(n == 1) {
			System.out.println("n= 1, 1");
			return new TwoElement(1, 0);
		} else {
			twoInt = findRecLinearNthFib(n-1);
			System.out.println("n= " + n + ", " + ((Integer)twoInt.getFirst()+(Integer)twoInt.getSecond()));
			return new TwoElement((Integer)twoInt.getFirst()+(Integer)twoInt.getSecond(), 
					(Integer)twoInt.getFirst());
		}
		
		
	}
	
}

