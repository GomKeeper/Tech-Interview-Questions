package thpark.pies.ch06arrays_strings;

import java.util.Enumeration;
import java.util.Hashtable;

public class UniqueCharacter {

	public static void main(String[] args) {
		String str = "ThomasPark";
	
		findUniqueChar(str);
	}
	
	public static void findUniqueChar(String str) {
		if(str == null) { return; }
		
		char[] charArr = str.toCharArray();
		Hashtable<Character, Integer> myHash = new Hashtable<Character, Integer>();
		for(int i = 0; i < charArr.length; i++) {
			if(myHash.containsKey(charArr[i])) {
				myHash.put(charArr[i], (myHash.get(charArr[i])+1));
			} else {
				myHash.put(charArr[i], 1);
			}
		}
		
		Enumeration<Character> enumKeys = myHash.keys();
		while(enumKeys.hasMoreElements()) {
			char aKey = enumKeys.nextElement();
			if(myHash.get(aKey) == 1) {
				System.out.println("UC = " + aKey);
			}
		}

	}
	
	

}
