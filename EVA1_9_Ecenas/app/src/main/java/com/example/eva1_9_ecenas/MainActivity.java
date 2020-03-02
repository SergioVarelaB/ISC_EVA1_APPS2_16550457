package com.example.eva1_9_ecenas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    Scene escena1, escena2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup reemp = findViewById(R.id.innerLayout);
        escena1 = Scene.getSceneForLayout(reemp,R.layout.escena, this);
        escena2 = Scene.getSceneForLayout(reemp,R.layout.ecena, this);
        Transition fade = new Fade();
        TransitionManager.go(escena1, fade);
    }

    public void click(View v){
        Transition slide = new Slide();
        TransitionManager.go(escena2, slide);
    }
}
