package com.thpark.pies.strings;

public class StrToInt {

	public static void main(String[] args) {
		String srcStr = "-2867";
		
		int result = convertToInt(srcStr);
		
		System.out.println("The result is " + result);
		
		int testCase = 5 - result;
		
		System.out.println("The test is " + testCase);
	}
/*	
	public static int convertToInt(String str) {
		if(str == null || str.length() == 0) { return -1; }
		if(str.length() == 1) { return Character.getNumericValue(str.charAt(0)); }
		if(str.length() == 2 && str.charAt(0) == '-') { return -1 * Character.getNumericValue(str.charAt(1)); }
		int resultInt = 0, start = 1;
		boolean negative = false;
		if( str.charAt(0) == '-') {
			negative = true;
			start = 1;
		} else {
			start = 0;
		}
		for(int i = start; i < str.length(); i++) {
			resultInt = (resultInt * 10) + Character.getNumericValue(str.charAt(i));
		}// for loop
		if(negative) {
			resultInt *= -1;
		} //if(negative)
		
		return resultInt;
	}// convertToInt
*/
	public static int convertToInt(String str) {
		//special cases
		if(str == null || str.length() == 0) {
			return Integer.MIN_VALUE;
		}
		if(str == "0") { return 0; }
		if(str.length() == 1) { return (int)(str.charAt(0) - (int)'0'); }
		if(str.length() == 2 && str.charAt(0) == '-') {
			return -1 * (int)(str.charAt(1)-(int)'0');
		}
		if(str.charAt(0) != '-' && str.length() > 10) {
			return Integer.MIN_VALUE-1;
		}
		int resultInt = 0, start = 0; boolean negative = false;
		//check negative sign
		if(str.charAt(0) == '-') {
			negative = true;
			start = 1;
		} else {
			start = 0;
		}
		//fetch digits to resultInt
		for(int i = start; i < str.length(); i++) {
			if((int)'0' > (int)str.charAt(i) || (int)str.charAt(i) > (int)'9') {
				return Integer.MIN_VALUE-2;
			}
			int digit = (str.charAt(i)-(int)'0');
			resultInt = (resultInt*10) + digit ;
		}
		//apply negativeness 
		if(negative) {
			resultInt *= -1;
		}
		return resultInt;
	}
}
