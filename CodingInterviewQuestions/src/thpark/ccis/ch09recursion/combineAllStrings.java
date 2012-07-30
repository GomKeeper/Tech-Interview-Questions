package thpark.ccis.ch09recursion;

public class combineAllStrings {


	public static void main(String[] args) {
		String str = "1234";
		
		combineString(str);
	}
	
	public static void combineString(String str) {
		if(str == null || str.length() == 0) { return; }
		if(str.length() == 1) {
			System.out.println("String = " + str);
			return;
		} //if statement
		StringBuffer printStr = new StringBuffer();
		int start = 0;
		doCombineString(str, printStr, start);
		System.out.println("--------------------------------");
		//doPartCombineString(str, printStr, start);
	}
	
	public static void doCombineString(String str, StringBuffer printStr,
			int start) {
		for(int i = start; i < str.length(); i++) {
			printStr.append(str.charAt(i));
			System.out.println("String = " + printStr.toString());
			if(i < str.length()-1) {
				doCombineString(str, printStr, i+1);
			}
			printStr.deleteCharAt(printStr.length()-1);
		}
	}

	/*
	public static void doPartCombineString(String str, StringBuffer printStr,
			int start) {
		for(int i = start; i < str.length()-1; i++) {
			printStr.append(str.charAt(i));
			System.out.println("String = " + printStr.toString());
			doCombineString(str, printStr, i+1);
			printStr.deleteCharAt(printStr.length()-1);
		}
		printStr.append(str.charAt(str.length()-1));
		System.out.println("String = " + printStr.toString());
		
	}
	*/
}
