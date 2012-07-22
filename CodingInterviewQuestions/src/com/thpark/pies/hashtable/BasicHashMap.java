package com.thpark.pies.hashtable;

import java.util.HashMap;

public class BasicHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap occurHash = new HashMap();
		String srcStr = "This is Thoams Park";
		int strLength = srcStr.length() - 1;
		
		for (int i = 0; i < srcStr.length(); i++){
			if (occurHash.containsKey(srcStr.charAt(i))) {
				occurHash.put(srcStr.charAt(i), (Integer)occurHash.get(srcStr.charAt(i))+1);
			} else
			{
				occurHash.put(srcStr.charAt(i), new Integer(1));
			}
		}
		
		System.out.println("s occures " + occurHash.get('s'));
		
	}

}
