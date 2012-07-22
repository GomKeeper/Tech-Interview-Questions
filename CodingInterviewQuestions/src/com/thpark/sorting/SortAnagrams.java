package com.thpark.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortAnagrams {

	public static void main(String[] args) {
		String[] strArray = {"thomas", "god", "dog", "race", "care", "samoht", "kick", "cook"};
		AnagramComparator acp = new AnagramComparator();
		
		Arrays.sort(strArray, acp);
		
		for(String s : strArray) {
			System.out.println(s);
		}
	}
}

class AnagramComparator implements Comparator<String> {

	public String sortStr(String str) {
		char[] currStr = str.toCharArray();
		Arrays.sort(currStr);
		return new String(currStr);
	}
	
	@Override
	public int compare(String str1, String str2) {
		return sortStr(str1).compareTo(sortStr(str2));
	}
	
}