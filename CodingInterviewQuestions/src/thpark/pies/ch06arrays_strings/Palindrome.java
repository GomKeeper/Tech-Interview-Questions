package thpark.pies.ch06arrays_strings;

public class Palindrome {

	public static void main(String[] args) {
		String str = "kinnikinnik! tartrat kayak peeweep aibohphobia ";
		
		String result = findPalindrome(str);
		
		System.out.println("The longest palindrome = " + result);
	}
	
	public static String findPalindrome(String str) {
		if(str == null) { return ""; }
		StringBuffer transStr = new StringBuffer();
		String result = ""; 
		for(int i = 0; i < str.length()-1; i++ ) {
			transStr.append(str.charAt(i) + "#");
		}
		transStr.append(str.charAt(str.length()-1));
		
		//System.out.println(transStr.toString());
		
		for(int j = 1; j < transStr.length()-2; j++) {
			int x = 1;
			while(transStr.charAt(j-x) == transStr.charAt(j+x)) {
				x++;
				if(j-x < 0 || j+x > transStr.length()-1) {
					break;
				}
			}
			x--;
			if(result.length() < 2*x+1) {
				result = transStr.substring(j-x, j+x+1);
				System.out.println("local result = " + result);
			}
		}
		result = result.replaceAll("#", "");
		return  result.length() < 2 ? "" : result ;
	}

}