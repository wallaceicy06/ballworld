package edu.rice.harger.ballworld;

import android.os.Bundle;
import android.app.Activity;
import android.app.DialogFragment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity implements OnTouchListener {

    private BallPitView myBallPitView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myBallPitView = new BallPitView(this);
        myBallPitView.setOnTouchListener(this);

        setContentView(myBallPitView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.action_newball:
            System.out.println("new ball selected");
            DialogFragment newBallFragment = new NewBallDialogFragment();
            newBallFragment.show(getFragmentManager(), "missiles");
            return true;
        case R.id.action_settings:
            System.out.println("settings selected");
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
        case MotionEvent.ACTION_UP:
            break;

        case MotionEvent.ACTION_DOWN:
            myBallPitView.selectObject(new Point(event.getX(), event.getY()));
            break;

        case MotionEvent.ACTION_MOVE:
            System.out.println("Action move");
            myBallPitView.moveObject(new Point(event.getX(), event.getY()));
            break;
        }
        return true;
    }

}
