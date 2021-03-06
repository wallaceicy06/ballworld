package edu.rice.harger.ballworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;

public class BallPitView extends View {

	private BallPit myBallPit;
	private Ball selectedBall;
	private Paint myPaint = new Paint();
	
	public BallPitView(Context context) {
		super(context);
		myBallPit = new BallPit();
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		myPaint.setColor(Color.GREEN);
		myPaint.setStyle(Paint.Style.FILL);
		myPaint.setStrokeWidth(3);
		
		for(Ball ball: myBallPit.getAllBalls()) {
			canvas.drawCircle(ball.getPosition().getX(), ball.getPosition().getY(), ball.getRadius(), myPaint);
		}
		
		//draw selected outline
		myPaint.setStyle(Paint.Style.STROKE);
		myPaint.setColor(Color.RED);
		if(selectedBall != null) {
			canvas.drawCircle(selectedBall.getPosition().getX(), selectedBall.getPosition().getY(), selectedBall.getRadius(), myPaint);
		}
	}
	
	public void selectObject(float x, float y) {
		selectedBall = myBallPit.getBallAtPosition(x, y);
		invalidate();
	}
	
	public void moveObject(float x, float y) {
		if(selectedBall != null) {
			selectedBall.setPosition(x, y);
			invalidate();
		}
	}
}
