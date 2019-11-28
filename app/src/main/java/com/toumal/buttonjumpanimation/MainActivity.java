package com.toumal.buttonjumpanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_view);

        Button buttonAnimate = findViewById(R.id.button_animate);
        Button buttonAnimate2 = findViewById(R.id.button_animate2);
        Button buttonAnimate3 = findViewById(R.id.button_animate3);
        Button buttonAnimate4 = findViewById(R.id.button_animate4);
        Button buttonAnimate5 = findViewById(R.id.button_animate5);
        Button buttonAnimate6 = findViewById(R.id.button_animate6);
        Button buttonAnimate7 = findViewById(R.id.button_animate7);
        Button buttonAnimate8 = findViewById(R.id.button_animate8);
        Button buttonAnimate9 = findViewById(R.id.button_animate9);
        Button buttonAnimate10 = findViewById(R.id.button_animate10);
        Button buttonAnimate11 = findViewById(R.id.button_animate11);
        Button buttonAnimate12 = findViewById(R.id.button_animate12);
        Button buttonAnimate13 = findViewById(R.id.button_animate13);
        Button buttonAnimate14 = findViewById(R.id.button_animate14);
        Button buttonAnimate15 = findViewById(R.id.button_animate15);

        //Tada
        buttonAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        //RubberBand
        buttonAnimate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RubberBand)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        //RollOut
        buttonAnimate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RollOut)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        //Bounce
        buttonAnimate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Bounce)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        //Flash
        buttonAnimate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Flash)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });

        buttonAnimate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipInX)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FlipInY)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Hinge)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.DropOut)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeIn)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Landing)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Pulse)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Shake)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Wave)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });
        buttonAnimate15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.TakingOff)
                        .duration(700)
                        .repeat(1)
                        .playOn(mTextView);
            }
        });





    }
}
