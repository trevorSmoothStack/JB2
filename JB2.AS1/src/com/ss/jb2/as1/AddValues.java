/**
 * 
 */
package com.ss.jb2.as1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author trevor
 *
 */
public class AddValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AddValues aV = new AddValues();
		aV.getValues();
	}

	public void getValues() {
		int n[] = new int[10];
		Scanner valObj = new Scanner(System.in);
		System.out.println("Please enter up to 10 values to be added together. Remember, I can only add integers! Start now..");
		for (int i=0; i<10; i++) {
			String inpValStr = valObj.nextLine();
			if ("n".equals(inpValStr)) {
				break;
			}
			try {
				int inpVal = Integer.parseInt(inpValStr);
				n[i] = inpVal;
			} catch (Exception e) {
				System.out.println("The value you entered is not an integer.");
			}
			System.out.println("You may enter another value now. If you are finished, please enter 'n'.");
		}
		valObj.close();
		System.out.println(Arrays.toString(n));
		int sum = 0;
		for (int i : n)
			sum += i;
		System.out.println(sum);
	}
}
