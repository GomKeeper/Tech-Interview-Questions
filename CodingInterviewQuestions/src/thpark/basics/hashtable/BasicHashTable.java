package thpark.basics.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class BasicHashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Hashtable occurHash = new Hashtable(); 
		String srcStr = "This is Thomas Park";
		char[] charArr = srcStr.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			if (occurHash.containsKey(charArr[i])) {
				occurHash.put(charArr[i], (Integer)occurHash.get(charArr[i])+1); 
			} else {
				occurHash.put(charArr[i], 1);
			}
		}			
		
		System.out.println("a - " + occurHash.get('T'));
	
	}

}
