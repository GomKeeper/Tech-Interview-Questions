package thpark.pies.ch06arrays_strings;

public class RotatedArrayFindN {

	public static void main(String[] args) {
		int[] array = {3,4,5,6,7,8,9,10,11,12,1,2};
		
		int n = 8;
		int i = findN(array, n);
		
		System.out.println(n + " is in " + (i+1) + " th place.");
	}

	public static int findN(int[] array, int n) {
		if(array == null) { return -2; }
		if(n < 0) { return -3; }
		
		int start = 0, end = array.length -1;
		return doFindN(array, n, start, end	);
	}
	
	public static int doFindN(int[] array, int n, int start, int end) {
		if(start == end) {
			if(array[start] == n) {
				return start;
			} else {
				return 0;
			}
		}
		
		int mid = (start + end) >>> 1;
		if(array[mid] == n) { return mid; }
		if(array[start] < array[mid]) { //bottom half is sorted
			if(array[start] <= n && n < array[mid]) {
				return doFindN(array, n, start, mid-1);
			} else {
				return doFindN(array, n, mid+1, end);
			}
		} else { //upper half is sorted
			if(array[mid] < n && n <= array[end]) {
				return doFindN(array, n, mid+1, end);
			} else {
				return doFindN(array, n, start, mid-1);
			}
			
		}
	}
}
