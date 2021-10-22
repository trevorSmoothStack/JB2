/**
 * 
 */
package com.ss.jb2.as3;

/**
 * @author trevor
 *
 */
public class Circle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle cir = new Circle();
		float area = cir.calculateArea(cirLength, cirHeight);
		cir.display(area);
	}
	
	public void display(float area) {
		System.out.println("I am a circle,");
		System.out.println("My area is " + area + " units^2");
	}
	
	static int cirHeight = 5;
	static int cirLength = 5;
	
	public float calculateArea(int length, int height) {
		float circumference = length;
		float radius = circumference / 2;
		float cirArea = (float) (Math.PI * (Math.pow(radius, 2)));
		return cirArea;
	}

}
