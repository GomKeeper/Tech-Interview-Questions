package thpark.ccis.ch09recursion;

import thpark.library.Tower;

public class TowersOfHanoi {

	public static void main(String[] args) {
		int numOfTowers = 3;
		int numOfDisks = 5;
		Tower[] towers = new Tower[numOfTowers];
		for(int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
		for(int i = numOfDisks-1; i >=0; i--) {
			towers[0].add(i);
		}
		towers[0].moveDisks(numOfDisks, towers[2], towers[1]);
		
	}


}
