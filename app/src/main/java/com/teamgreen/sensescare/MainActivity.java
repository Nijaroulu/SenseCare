package com.teamgreen.sensescare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.main_constraint_layout);

        setGradients("#BA5370", "#F4E2D8", GradientDrawable.Orientation.TOP_BOTTOM , constraintLayout);
    }


    public void setGradients(String firstColor, String secondColor, GradientDrawable.Orientation orientation, View view) {

        GradientDrawable gd = new GradientDrawable(
                orientation,
                new int[]{Color.parseColor(firstColor), Color.parseColor(secondColor)});
        gd.setCornerRadius(0f);
        gd.setGradientCenter(0.75f, 0.0f);
        view.setBackground(gd);
    }

}
