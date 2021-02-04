package com.mo.gifdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    LinearLayout mContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContainer = findViewById(R.id.ll_container);

        addViews();
    }

    private void addViews() {
        for (int i = 0; i < 10; ++i) {
//            ImageView iv = new ImageView(this);
            GifImageView iv = new GifImageView(this);
            try {
                GifDrawable gifDrawable = new GifDrawable(getResources(), R.mipmap.gif4);
                iv.setImageDrawable(gifDrawable);
            } catch (IOException e) {
                e.printStackTrace();
            }
            mContainer.addView(iv);
        }
    }
}