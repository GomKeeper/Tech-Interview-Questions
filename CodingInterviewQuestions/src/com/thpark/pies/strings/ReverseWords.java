package com.thpark.pies.strings;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "This is Thomas Park Speaking";
		
		System.out.println("Original String = " + str);
		
		reverseWords(str.toCharArray());

		
	}
	
	public static void reverseWords(char[] charArr) {
		if(charArr == null) { return ; }
		if(charArr.length == 1) { System.out.println( charArr[0]); }
		int start = 0, end = 0;
		
		reverseEachWord(charArr, start, charArr.length-1);

		while(end < charArr.length) {
			if( charArr[end] != ' ') {
				start = end;
				while(end < charArr.length && charArr[end] != ' ') {
					end++;
				}
				end--;
				
				reverseEachWord(charArr, start, end);
			}
			end++;
		}

		for(int t = 0; t < charArr.length; t++) {
			System.out.print(charArr[t]);
		}
		
		return ;
		
	}
	
	public static String reverseEachWord(char[] charArr, int start, int end) {
		while(start < end) {
			char temp = charArr[end];
			charArr[end] = charArr[start];
			charArr[start] = temp;
			start++;
			end--;
		}

		
		return charArr.toString();
	}
	

}
