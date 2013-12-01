package edu.rice.harger.ballworld;

public class Point {
	private float myX;
	private float myY;
	
	public Point(float x, float y) {
		myX = x;
		myY = y;
	}
	
	public float getX() {
		return myX;
	}
	
	public float getY() {
		return myY;
	}
	
	public double distanceTo(Point otherPoint) {
		return Math.sqrt(Math.pow(myX - otherPoint.getX(), 2) + Math.pow(myY - otherPoint.getY(), 2));
	}
	
	public String toString() {
		return "(" + myX + "," + myY + ")";
	}
}
