package thpark.pies.ch06arrays_strings;

public class GenerateAllPicksArray {

	public static void main(String[] args) {
		int [][] nArray= { {2,5,3,6,1,6},
						   {3,8,2,4},
						   {7,4,6,3,4,2,1} };
		
		generateAllPicks(nArray);
	}
	
	public static void generateAllPicks(int[][] array) {
		if(array == null) { return; }
		StringBuffer picks = new StringBuffer();
		int currentN = 0;
		
		doGenerateAllPicks(array, picks, currentN);
	}
	
	public static void doGenerateAllPicks(int[][] array, StringBuffer picks, int currentN) {
		if(currentN == array.length) {
			System.out.println(picks);
		} else {
			for(int i=0; i < array[currentN].length; i++) {
				picks.append(array[currentN][i]);
				doGenerateAllPicks(array, picks, currentN+1);
				picks.deleteCharAt(picks.length()-1);
			}//for loop
		} //else
		
	}

}
