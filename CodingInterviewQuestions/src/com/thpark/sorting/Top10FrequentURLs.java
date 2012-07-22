package com.thpark.sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Top10FrequentURLs {

	public static void main(String[] args) {
		HashMap<String, Integer> myHash = new HashMap<String, Integer>();
		ValueComparator vc = new ValueComparator(myHash);
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(vc);
		
		myHash.put("www.naver.com", 1000);
		myHash.put("www.daum.net", 900);
		myHash.put("www.cyworld.com", 452);
		myHash.put("www.google.com", 793);
		myHash.put("www.yahoo.com", 548);
		myHash.put("www.ebay.com", 457);
		myHash.put("www.nate.com", 351);
		myHash.put("www.chrome.com", 392);
		myHash.put("www.msn.co.kr", 602);
		myHash.put("www.yelp.com", 242);
		myHash.put("www.twitter.com", 802);
		
		for(String s : myHash.keySet()) {
			System.out.println(s + "\t " + myHash.get(s));
		}
		
		sortedMap.putAll(myHash);
		System.out.println("------------------------------------");
		
		int count = 1;
		for(String str : sortedMap.keySet()) {
			System.out.println(str + "\t " + sortedMap.get(str));
			count++;
			if(count > 7) { break; }
		}
		
	}

}

class ValueComparator implements Comparator<String>{

	private Map<String, Integer> map;
	
	public ValueComparator(Map<String, Integer> map) {
		this.map = map;
	}
	public int compare(String str1, String str2) {
		if((Integer)map.get(str1) < (Integer)map.get(str2)) {
			return 1;
		} else if ((Integer)map.get(str1) > (Integer)map.get(str2)) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
}
