package com.banterchannel.arrowoftime;

import android.annotation.TargetApi;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.RelativeLayout;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout mainActivityLayout = getRelativeLayout();

        this.setContentView(mainActivityLayout);
        //setContentView(R.layout.activity_main);
    }

    @NonNull @TargetApi(17)
    private RelativeLayout getRelativeLayout() {
        RelativeLayout mainActivityLayout = new RelativeLayout(this);
        theClockViz notCheekyClock = new theClockViz(this);
        mainActivityLayout.addView(notCheekyClock);
        return mainActivityLayout;
    }
}
