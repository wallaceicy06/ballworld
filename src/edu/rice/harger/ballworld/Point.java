package edu.rice.harger.ballworld;

public class Point {
	private float myX;
	private float myY;
	
	public Point(float x, float y) {
		myX = x;
		myY = y;
	}
	
	public void setX(float x) {
	    myX = x;
	}
	
	public void setY(float y) {
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
	
	public static double distance(double x1, double y1, double x2, double y2) {
	    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	
	public String toString() {
		return "(" + myX + "," + myY + ")";
	}
}
