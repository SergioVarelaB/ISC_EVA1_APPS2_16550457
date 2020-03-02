package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FrameLayout fl;
    Intent intento;
    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onMessageFromFragToMain(){
        fl = findViewById(R.id.frameLay1);
        if(fl != null){//landscape
            // se crea fragmento
            Toast.makeText(this,"landscape",Toast.LENGTH_SHORT).show();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            TwoFragment two = new TwoFragment();
            two.setParam("que tranzita banda");
            ft.replace(R.id.frameLay1,two);

            ft.commit();
        }else{//Portrait
            //Aqui se crea la segunda actividad
            Toast.makeText(this,"Portrait",Toast.LENGTH_SHORT).show();
            intento = new  Intent(this,Segunda.class);
            intento.putExtra("mensaje", "esta es secundaria");
            startActivity(intento);
        }
    }

    public void cambiar(){

    }
}
