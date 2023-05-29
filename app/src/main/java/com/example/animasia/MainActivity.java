package com.example.animasia;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ObjectAnimator mAnimator1;
    ObjectAnimator mAnimator2;
    ObjectAnimator mAnimator3;
    ObjectAnimator mAnimator4;
    ObjectAnimator mAnimator5;
    ObjectAnimator mAnimator6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgView = findViewById(R.id.img);
        Button btn = findViewById(R.id.start_btn);
        AnimatorSet animatorSet1 = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = new AnimatorSet();
        AnimatorSet bouncer = new AnimatorSet();

        mAnimator1 = ObjectAnimator.ofFloat(imgView, "y", 900);
        mAnimator2 = ObjectAnimator.ofFloat(imgView, "x", 700);
        mAnimator3 = ObjectAnimator.ofFloat(imgView, "y", 600);
        mAnimator4 = ObjectAnimator.ofFloat(imgView, "x", 100);
        mAnimator5 = ObjectAnimator.ofFloat(imgView, "y", 200);
        mAnimator6 = ObjectAnimator.ofFloat(imgView, "x", 410);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimator1.setDuration(1000);
                mAnimator2.setDuration(1000);
                animatorSet1.playTogether(mAnimator1, mAnimator2);

                mAnimator3.setDuration(1000);
                mAnimator4.setDuration(1000);
                animatorSet2.playTogether(mAnimator3, mAnimator4);

                mAnimator5.setDuration(1000);
                mAnimator6.setDuration(1000);
                animatorSet3.playTogether(mAnimator5, mAnimator6);

                bouncer.playSequentially(animatorSet1, animatorSet2, animatorSet3);
                bouncer.start();
            }
        });
    }
}