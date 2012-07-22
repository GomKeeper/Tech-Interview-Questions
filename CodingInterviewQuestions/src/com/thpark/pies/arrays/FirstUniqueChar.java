package com.thpark.pies.arrays;

import java.util.Hashtable;

public class FirstUniqueChar {


	public static void main(String[] args) {
		String srcStr = "starting this sentence.";
		Character c;
		
		c = findFirstUnique(srcStr);
		System.out.println("Result is " + c);
	}

	public static Character findFirstUnique(String src) {
		char[] strArr = src.toCharArray();
		Hashtable<Character, Integer> charHash = new Hashtable<Character, Integer>();
		Character result = null;
		for (int i = 0; i < strArr.length; i++) {
			if(charHash.containsKey(strArr[i])) {
				charHash.put(strArr[i], (charHash.get(strArr[i])+1));
			} else {
				charHash.put(strArr[i], new Integer(1));
			} //else
		}// for loop
		/*
		for (int x = 0; x < strArr.length; x++) {
			System.out.println(strArr[x] + " has occured " + charHash.get(strArr[x]) + " times");
		}
		*/
		for (int j = 0; j < strArr.length; j++) {
			if((charHash.get(strArr[j]) == 1)) {
				result = strArr[j];
				break;
			}//if statement
		}// for loop
		
		return result;
		
	}
}
