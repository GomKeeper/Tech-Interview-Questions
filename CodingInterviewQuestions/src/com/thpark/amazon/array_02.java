package com.thpark.amazon;

import java.util.ArrayList;
import java.util.Hashtable;

public class array_02 {
	public static void main(String[] args) {
		int[] srcArr = {1,2,3,4,5,6,7,8,4,6,10,12,15,16,6};
		
		pairCount(srcArr);
	}
	
	public static void pairCount(int[] srcArr){
		Hashtable arrHash = new Hashtable();
		ArrayList pairs = new ArrayList();
		
		for(int i = 0; i < srcArr.length; i++) {
			if(arrHash.containsKey(srcArr[i])) {
				arrHash.put(srcArr[i], (Integer)arrHash.get(srcArr[i])+1);
				if((Integer)arrHash.get(srcArr[i]) == 2) {
					pairs.add(srcArr[i]);
				}
			}  else {
				arrHash.put(srcArr[i], new Integer(1));
			}
			
		}
		
		for(Object o : pairs) {
			System.out.println((Integer)o);
		}
	}
}
