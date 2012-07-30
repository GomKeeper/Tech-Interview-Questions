package thpark.ccis.ch09recursion;

public class StringValidity {

	public static void main(String[] args) {
		String srcStr = "facbooke";
		String tarStr = "fa**b*ke";
		
		System.out.println(checkStrValidity(srcStr,tarStr));
	}
	
	public static boolean checkStrValidity(String fStr, String sStr) {
		if(fStr == null || sStr == null) {
			return false;
		}
		return doCheckStrValid(fStr.toLowerCase(), sStr.toLowerCase());
	}
	
	public static boolean doCheckStrValid(String fStr, String sStr) {
		while(!fStr.isEmpty() && !sStr.isEmpty()) {
			if(sStr.equals("*")) {
				return true;
			}
			if(sStr.charAt(0) == '*') {
				sStr = sStr.substring(1);
				for(int i = 0; i <= fStr.length(); i++) {
					if(doCheckStrValid(fStr.substring(i,fStr.length()), sStr)) {
						return true;
					}
				}
				return false;
			} else {
				if((fStr.charAt(0) != sStr.charAt(0))) {
					return false;
				} else {
					if(fStr.equals(sStr)) {
						return true;
					}
					fStr = fStr.substring(1);
					sStr = sStr.substring(1);
				}
			}
		}
		if(fStr.isEmpty() && sStr.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
