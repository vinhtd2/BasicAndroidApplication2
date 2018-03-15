package org.o7planning.androidbasic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Example2Activity extends AppCompatActivity {
    private TextView textEvt1;
    private TextView textEvt2;

    private static final String TAG = "TestGesture";

    // The set of gesture of user
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example2);

        this.textEvt1 = (TextView) this.findViewById(R.id.my_text_evt1);
        this.textEvt2 = (TextView) this.findViewById(R.id.my_text_evt2);

        GestureDetector.OnGestureListener gestureListener = new MyOnGestureListener();
        GestureDetector.OnDoubleTapListener doubleTapListener = new MyOnDoubleTapListener();

        // GestureDetectorCompat(Context context, OnGestureListener listener)
        this.gestureDetector = new GestureDetector(this, gestureListener);

        this.gestureDetector.setOnDoubleTapListener(doubleTapListener);

        // get original Variable View (full screen)
        View rootView = this.findViewById(android.R.id.content).getRootView();

        // set listener for touch interface
        rootView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        Log.e(TAG, "Running...");
    }

    class MyOnGestureListener implements GestureDetector.OnGestureListener {
        @Override
        public boolean onDown(MotionEvent motionEvent) {
            textEvt1.setText("onDown");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY());
            Log.e(TAG, "onDown");
            return true;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {
            textEvt1.setText("onShowPress");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY());
            Log.e(TAG, "onShowPress");
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            textEvt1.setText("onSingleTapUp");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY());
            Log.e(TAG, "onSingleTapUp");
            return true;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            textEvt1.setText("Scroll");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY() + " " + motionEvent1.getX() + motionEvent1.getY());
            Log.e(TAG, "onScroll");
            return true;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
            textEvt1.setText("onLongPress");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY());
            Log.e(TAG, "onLongPress");
        }

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            textEvt1.setText("onFling");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY() + " " + motionEvent1.getX() + motionEvent1.getY());
            Log.e(TAG, "onFling");
            return true;
        }
    }

    class MyOnDoubleTapListener implements GestureDetector.OnDoubleTapListener {
        @Override
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            textEvt1.setText("onSingleTapConfirmed");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY());
            Log.e(TAG, "onSingleTabComfirmed");
            return true;
        }

        @Override
        public boolean onDoubleTap(MotionEvent motionEvent) {
            textEvt1.setText("onDoubleTap");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY());
            Log.e(TAG, "onDoubleTap");
            return true;
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            textEvt1.setText("onDoubleTapEvent");
            textEvt2.setText(motionEvent.getX() + ":" + motionEvent.getY());
            Log.e(TAG, "onDoubleTapEvent");
            return true;
        }
    }
}