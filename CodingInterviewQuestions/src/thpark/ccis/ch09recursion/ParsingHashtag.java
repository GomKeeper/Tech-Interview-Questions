package thpark.ccis.ch09recursion;

import java.util.ArrayList;
import java.util.HashSet;

public class ParsingHashtag {

	public static void main(String[] args) {
		HashSet<String> myHash = new HashSet<String>();
		
		myHash.add("go");
		myHash.add("giants");
		myHash.add("gia");
		myHash.add("nts");
		myHash.add("gogi");
		myHash.add("ants");
		myHash.add("gog");
		myHash.add("ian");
		myHash.add("ts");
		
		String hashtag = "gogiants";
		
		ArrayList<String> result = parseHashtag(myHash, hashtag);
		
		for(String s : result) {
			System.out.print(s + " ");
		}
	}
	
	public static ArrayList<String> parseHashtag(HashSet<String> myHash, String str) {
	if(myHash == null || str == null) { return null; }
	return doParseHT(myHash, str, new ArrayList<String>());
	}
	
	public static ArrayList<String> doParseHT(HashSet<String> myHash, String str, ArrayList<String> words) {
		if(str.isEmpty()) { return words; }
		ArrayList<String> resultList = new ArrayList<String>();
		for(int i = 0; i <= str.length(); i++) {
			String oneWord = str.substring(0, i);
			if(myHash.contains(oneWord)) {
				words.add(oneWord);
				resultList.addAll(doParseHT(myHash, str.substring(i), words));
				words.remove(oneWord);
			}
		}
		
		return resultList;
	}
}
