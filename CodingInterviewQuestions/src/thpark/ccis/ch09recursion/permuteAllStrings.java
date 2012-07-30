package thpark.ccis.ch09recursion;

public class permuteAllStrings {


	public static void main(String[] args) {
		String str = "Thomas";
		
		permuteAllString(str);
		
	}

	public static void permuteAllString(String srcStr) {
		if(srcStr == null) { return; }
		
		String buildString = "";
		String remainString = srcStr;
		
		doPermuteAll(buildString, remainString);
		System.out.println("-----------------------------");
		
		StringBuffer result = new StringBuffer();
		boolean[] used = new boolean[srcStr.length()];
		for(int i = 0; i < used.length; i++) {
			used[i] = false;
		}// for loop
		doMorePermuteAll(srcStr, used, result );
	}
	
	public static void doPermuteAll(String buildStr, String remainStr) {
		if(remainStr.length() == 0) {
			System.out.println(buildStr);
			return;
		}
		
		for(int i = 0; i < remainStr.length(); i++) {
			doPermuteAll(buildStr + remainStr.charAt(i), remainStr.substring(0, i) 
					+ remainStr.substring(i+1));
		}
	}
	
	public static void doMorePermuteAll(String srcStr, boolean[] used, StringBuffer result) {
		if(srcStr.length() == result.length()) {
			System.out.println(result.toString());
		}
		for(int i = 0; i < srcStr.length(); i++) {
			if(used[i]) {
				continue;
			}
			result.append(srcStr.charAt(i));
			used[i] = true;
			doMorePermuteAll(srcStr, used, result);
			used[i] = false;
			result.deleteCharAt(result.length()-1);
			
		}
	}
}
