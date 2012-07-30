package thpark.interview.amazon;

public class interview01_sol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] intArray = {1,1,1,1,2,2,3,3,6,6,6,7,7,8,8}; 
		int[] intArray = {1,1};
		
		System.out.println("odd number occurance = " + oddOccurance(intArray));
	}

	public static int oddOccurance(int[] srcArray) {
		if(srcArray == null) { return -1; }
		if(srcArray.length == 1) { return srcArray[0]; }
		
		int prevNum = -1, occurance = 0, oddness = 0;
		for(int i = 0; i < srcArray.length; i++) {
			if(srcArray[i] == prevNum) {
				occurance++;
			} else {
				oddness = occurance % 2;
				if((prevNum != -1) && (oddness == 1)) {
					return prevNum;
				}
				occurance = 1;
				prevNum = srcArray[i];
			}
		}
		
		return -2;
	}
	
}
