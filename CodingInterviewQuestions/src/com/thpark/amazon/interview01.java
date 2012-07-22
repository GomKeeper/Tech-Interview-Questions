package com.thpark.amazon;

public class interview01 {



	  public static int getOddOne(int[] intArr, int length) {
	//      intArr = sort(intArr);
	      int occurance = 1;
	      int currNum = intArr[0];
	      
	      if(length == 0) {return -1;}
	      
	      for(int i = 1; i < length; i++) {
	          if(intArr[i-1] == intArr[i]) {
	              occurance += 1;
	          } else if(intArr[i-1] != intArr[i]) {
	              if((occurance%2) == 1) {
	                  return intArr[i-1];
	              } else {
	                  occurance = 1;
	              }
	          }
	      
	      }
	      
	      return -2;
	  }    

}