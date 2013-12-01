package edu.rice.harger.ballworld;

import android.graphics.Color;

public class Ball {

	private Point myPosition;
	private int myRadius;
	private int myColor;
	
	public Ball(Point position, int radius) {
		this(position, radius, Color.RED);
	}
	
	public Ball(Point position, int radius, int color) {
		myPosition = position;
		myRadius = radius;
		myColor = color;
	}
	
	public void setPosition(Point position) {
		myPosition = position;
	}
	
	public Point getPosition() {
		return myPosition;
	}
	
	public int getRadius() {
		return myRadius;
	}

	public double distanceTo(Point point) {
		return myPosition.distanceTo(point);
	}
	
	public String toString() {
		return "Ball at position " + myPosition.toString();
	}

	public boolean contains(Point point) {
		if(point.distanceTo(myPosition) <= myRadius) {
			return true;
		}
		return false;
	}
}
