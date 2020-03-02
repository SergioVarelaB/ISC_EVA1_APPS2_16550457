package com.example.eva1_3_frag_din;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

    }

    public void click1(View v){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment_Azul azul = new Fragment_Azul();
        ft.replace(R.id.fragmento,azul);
        ft.commit();
    }
    public void click2(View v){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment_Verde verde = new Fragment_Verde();
        ft.replace(R.id.fragmento,verde);
        ft.commit();
    }


}
