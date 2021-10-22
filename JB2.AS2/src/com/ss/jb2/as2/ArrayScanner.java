/**
 * 
 */
package com.ss.jb2.as2;

import java.util.Arrays;
import java.util.Random;

/**
 * @author trevor
 *
 */
public class ArrayScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayScanner aS = new ArrayScanner();
		aS.createArray();
		aS.scanArray();
	}
	
	int[][] twoDimArr = new int[8][2];
	
	public void createArray() {
		for (int i = 0; i < 8; i++) {
			Random rand = new Random();
			final int upperbound = 200;
			int num = rand.nextInt(upperbound) + 1;
			twoDimArr[i][0] = num;
		}
		for (int i = 0; i < 8; i++) {
			Random rand = new Random();
			final int upperbound = 200;
			int num = rand.nextInt(upperbound) + 1;
			twoDimArr[i][1] = num;
		}
		for (int[] row : twoDimArr)
			System.out.println(Arrays.toString(row));		
	}
	
	public void scanArray() {
		System.out.println("Scanning...");
		int maxNum = 0;
		int colLoc = 0;
		int rowLoc = 0;
		for (int i = 0; i < twoDimArr.length; i++) {
			for (int j = 0; j < twoDimArr[i].length; j++) {
				if (maxNum < twoDimArr[i][j]) {
					maxNum = twoDimArr[i][j];
					rowLoc = i + 1;
					colLoc = j + 1;
				}
			}
		}
		System.out.println("This is the maximum: " + maxNum);
		System.out.println("It is located in column #" + colLoc);
		System.out.println("And row #" + rowLoc);
	}
	
	

}
