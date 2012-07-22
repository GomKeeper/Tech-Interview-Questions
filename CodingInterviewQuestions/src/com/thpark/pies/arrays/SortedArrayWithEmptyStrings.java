package com.thpark.pies.arrays;

public class SortedArrayWithEmptyStrings {
	
	public static void main(String[] args) {
		String[] strArr = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		String input = "at";
		
		System.out.println(getStrIndex(strArr, input));
		
	}
	
	public static int getStrIndex(String[] strArr, String input) {
		if(strArr == null || input == null) {
			return -1;
		}
		int start = 0, end = strArr.length;
		return doGetStrIndex(strArr, input, start, end);
	}
	
	public static int doGetStrIndex(String[] strArr, String input, int start, int end) {
		if(start > end) { return -2; }
		int midIdx = (start+end) >> 1;
		int offset = 1;
		while(strArr[midIdx].isEmpty()) {
			if((midIdx-offset) >= 0 && !strArr[midIdx-offset].isEmpty()) {
				midIdx = (midIdx-offset);
				break;
			}
			if((midIdx+offset) < strArr.length && !strArr[midIdx+offset].isEmpty()) {
				midIdx = (midIdx+offset);
				break;
			}
			if((midIdx-offset) < 0 && (midIdx+offset) >= strArr.length) {
				return -3;
			}
			offset++;
		}
		
		if(input.compareToIgnoreCase(strArr[midIdx]) < 0 ) {
			return doGetStrIndex(strArr, input, start, midIdx-1);
		} else if (input.compareToIgnoreCase(strArr[midIdx]) > 0  ) {
			return doGetStrIndex(strArr, input, midIdx+1, end);
		} else {
			return midIdx;
		}
	
	}
}