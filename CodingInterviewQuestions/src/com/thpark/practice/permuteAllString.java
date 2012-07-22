package com.thpark.practice;

public class permuteAllString {

	public static void main(String[] args) {
		String myString = "Parkster";
		
		System.out.println(myString);
		
		permuteAllStr(myString);
	}
	
	public static void permuteAllStr(String str) {
		if(str == null || str == "") {
			return;
		} else if (str.length() == 1) {
			System.out.println(str);
			return;
		}
		String expendString = "";
		String remainString = str;
			
		doPermuteAllStr(expendString, remainString);
	}
	
	public static void doPermuteAllStr(String exStr, String reStr) {
		if(reStr.length() == 0) {
			System.out.println(exStr);
			return;
		}
		for(int i = 0; i < reStr.length(); i ++) {
			doPermuteAllStr(exStr + reStr.charAt(i), 
					reStr.substring(0,i) + reStr.substring(i+1));
		}
	}
}
