package thpark.pies.ch06arrays_strings;

import java.util.Hashtable;

public class SumOfTwoInts {
	
	public static void main(String[] args) {
		int[] array = {12,5,75,3,8,32,7,23,11,17,9,4};
		int n = 30;
		
		findSumofTwoInts(array, n);
	}

	public static void findSumofTwoInts(int[] array, int n) {
		if(array == null || n < 1) { return; }
		Hashtable<Integer, Integer> intHash = new Hashtable<Integer, Integer>();
		
		for(int i = 0; i < array.length; i++) {
			int diff = n - array[i];
			if(!intHash.containsKey(array[i])) {
				intHash.put(array[i], diff);
				if(intHash.containsKey(diff) && (diff != array[i])) {
					System.out.println("Sum of Ints = " + array[i] + ", " + diff);
					return;
				} //if(intHash) 
			} //if(!intHash)
		} //for loop
		
		System.out.println("No match");
	} //findSumofTwoInts
}