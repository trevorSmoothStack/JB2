/**
 * 
 */
package com.ss.jb2.as3;

/**
 * @author trevor
 *
 */
public class Rectangle implements Shape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		float area = rect.calculateArea(rectLength, rectHeight);
		rect.display(area);
	}
	
	public void display(float area) {
		System.out.println("I am a rectangle,");
		System.out.println("My area is " + area + " units^2");
	}
	
	static int rectHeight = 4;
	static int rectLength = 6;
	
	public float calculateArea(int length, int height) {
		float rectArea = length * height;
		return rectArea;
	}

}
