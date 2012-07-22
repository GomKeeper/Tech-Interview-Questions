package com.thpark.pies.strings;

public class LCSubstring {

	public static void main(String[] args) {
		String firstString = "Algorithm rulez!";
		String secondString = "Logarithm is easy";
		
		String result = findLCS(firstString, secondString);
		System.out.println("The Longest common Substring = " + result);
	}

	public static String findLCS(String fStr, String sStr) {
		if(fStr == null || sStr == null) { return ""; }
		String maxString = "";
		for(int i = 0; i < fStr.length(); i++) {
			for(int j = 0; j < sStr.length(); j++) {
				int x = 0;
				while(fStr.charAt(i+x) == sStr.charAt(j+x)) {
					x++;
					if((i+x) >= fStr.length() || (j+x) >= sStr.length()) {
						break;
					}
				}
				if(x > maxString.length() ) {
					maxString = fStr.substring(i,(i+x));
				}
			}
		}
		
		return maxString;
	}
}
