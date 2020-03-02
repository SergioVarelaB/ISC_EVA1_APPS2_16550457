package com.example.eva1_5_frag_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Fragment frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FragBoton bf = new FragBoton();
        bf.setmClickL(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui se remplaza el fragmento del 1 al 2
                FragmentTransaction fc = getSupportFragmentManager().beginTransaction();
                fc.setCustomAnimations(R.anim.anim_enter, R.anim.anim_out , android.R.anim.fade_in,android.R.anim.fade_out);
                FragColor fcol =  new FragColor();
                fc.replace(R.id.fragment,fcol);
                fc.addToBackStack("holas");
                fc.commit();
            }
        });
        ft.replace(R.id.fragment,bf);
        ft.addToBackStack("hii");
        ft.commit();
    }
}
