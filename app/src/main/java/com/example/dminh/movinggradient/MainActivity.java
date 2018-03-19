package com.example.dminh.movinggradient;

import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    AnimationDrawable animationDrawable ;
    TextView textView;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.main_tv_hello);
        constraintLayout = (ConstraintLayout) findViewById(R.id.main_cl_mainactivity);

        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();

        animationDrawable.setEnterFadeDuration(2500);

        animationDrawable.setExitFadeDuration(4500);

        animationDrawable.start();
    }
}
