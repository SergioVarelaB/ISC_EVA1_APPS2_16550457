package com.example.eva1_8_transisiones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.botonsito);
        final ImageView iv = findViewById(R.id.imageView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Segunda.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,iv,
                        ViewCompat.getTransitionName(iv));
                    startActivity(intento, options.toBundle());

            }
        });
    }

}
