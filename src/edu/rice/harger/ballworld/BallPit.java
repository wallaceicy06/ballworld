package edu.rice.harger.ballworld;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;

public class BallPit {

	private int myWidth;
	private int myHeight;
	
	private ArrayList<Ball> myBalls;
	
	public BallPit() {
		myBalls = new ArrayList<Ball>();
		myBalls.add(new Ball(new Point(200,200), 100, Color.GREEN));
	}
	
	public ArrayList<Ball> getAllBalls() {
		return myBalls;
	}
	
	public void setBounds(int width, int height) {
		myWidth = width;
		myHeight = height;
	}

	public Ball getBallAtPosition(Point point) {
		for(Ball b: myBalls) {
			if(b.contains(point)) {
				return b;
			}
		}
		return null;
	}
}
