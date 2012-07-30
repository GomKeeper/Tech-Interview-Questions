package thpark.pies.ch06arrays_strings;

public class ReverseString {
	
	public static void main(String[] arg) {
		String srcStr = "This is Thomas Park";

		System.out.println(srcStr);
		
		char[] charArr = srcStr.toCharArray();
		int lastIndex = charArr.length - 1;
		
		for (int i = 0; i <= (charArr.length/2); i++) {
			char temp = charArr[i];
			charArr[i] = charArr[lastIndex-i];
			charArr[lastIndex-i] = temp;
		}
		
		System.out.println(charArr);

	
	}

}
