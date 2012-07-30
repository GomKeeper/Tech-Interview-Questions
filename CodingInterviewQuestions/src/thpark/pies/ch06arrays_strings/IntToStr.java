package thpark.pies.ch06arrays_strings;


public class IntToStr {
	public static void main (String[] args) {
		
		for(int i = -10; i <= 10; i++) {
			String str = convertToStr(i);
			System.out.println("integer is " + str);
		}
	}
/*	
	public static String convertIntToStr(int i) {
		if(i == 0) { return "0"; }
		StringBuffer resultStr = new StringBuffer();
		Stack<Character> charStack = new Stack<Character>();
		if(i < 0) { 
			resultStr.append("-"); 
			i = Math.abs(i);
		}
		while(i > 0) {
			int digit = i % 10;
			charStack.push(Character.forDigit(digit, 10));
			i /= 10;
		}
		
		while(!charStack.isEmpty()) {
			resultStr.append(charStack.pop());
		}
		
		return resultStr.toString();
		
	}
*/
	public static String convertToStr(int n) {
		if(n == 0) { return "0"; }
		StringBuffer resultStr = new StringBuffer();
		char[] charArr = new char[10];
		int maxIndex = 0;
		
		if(n < 0) { 
			resultStr.append("-");
			n = Math.abs(n);
		}//if statement
		
		while(n > 0) {
			charArr[maxIndex] = (char)((int)'0'+(n % 10));
			n /= 10;
			maxIndex++;
		}
		
		for(int i = maxIndex-1; i >= 0; i--) {
			resultStr.append(charArr[i]);
		}
		
		return resultStr.toString();
	}

}	

