package com.banterchannel.arrowoftime;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;

import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.widget.AnalogClock;
import android.util.Log;

public class theClockViz extends AnalogClock {
    private static final String TAG = "timeVis";

    public theClockViz(Context context) {
        super(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i(TAG, "onDraw Called");
        VectorDrawable theVector = new VectorDrawable();
    }
}
