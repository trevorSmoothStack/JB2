/**
 * 
 */
package com.ss.jb2.as3;

/**
 * @author trevor
 *
 */
public class Triangle implements Shape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		float area = tri.calculateArea(triLength, triHeight);
		tri.display(area);
		
	}
	
	public void display(float area) {
		System.out.println("I am a triangle");
		System.out.println("My area is " + area + " units^2");
	}
	
	static int triHeight = 4;
	static int triLength = 3;
	
	public float calculateArea(int length, int height) {
		float triArea = (length * height) / 2;
		return triArea;
	}

}
