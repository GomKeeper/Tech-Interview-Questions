package thpark.pies.ch06arrays_strings;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class CountPairElements {

	public static void main(String[] args) {
		int[] array = {23,46,8,3,234,6,78,6,3,24,5,78,23,6,42,1,45,8,56,4,21,8};
		
		ArrayList<Integer> result = countAllPairs(array);
		
		for(Integer i : result) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> countAllPairs(int[] intArr) {
		if(intArr == null) { return null; }
		ArrayList<Integer> pairs = new ArrayList<Integer>();
		Hashtable<Integer, Integer> intHash = new Hashtable<Integer,Integer>();
		for(int i=0; i < intArr.length; i++) {
			if(!intHash.containsKey(intArr[i]) ) {
				intHash.put(intArr[i], 1);
			} else {
				intHash.put(intArr[i], intHash.get(intArr[i])+1);
			}
		}// for loop
		
		Enumeration<Integer> enumKey = intHash.keys();
		while(enumKey.hasMoreElements()) {
			int current = enumKey.nextElement();
			if(intHash.get(current) == 2) {
				pairs.add(current);
			}//if statement
		}
		return pairs;
	}//countAllPairs
}