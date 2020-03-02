package com.example.eva1_7_transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeClipBounds;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Intent intento;
    Context cntx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(new Slide().setDuration(1000));
        getWindow().setExitTransition(new ChangeClipBounds().setDuration(1000));
        setContentView(R.layout.activity_main);
        intento = new Intent(getApplicationContext(), Segunda.class);
    }
    public void onClick(View v){
            startActivity(intento,
                    ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        }
    }

