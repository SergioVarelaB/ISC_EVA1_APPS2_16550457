package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Segunda extends AppCompatActivity {
    TwoFragment two = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        //Toast.makeText(this,getIntent().getStringExtra("mensaje"),Toast.LENGTH_SHORT).show();
        //two.onMessageFromMainToFrag(getIntent().getStringExtra("mensaje"));
        Log.wtf("primis","primis");

    }
    @Override
    public void onAttachFragment(androidx.fragment.app.Fragment fragment) {
        super.onAttachFragment(fragment);
        two = (TwoFragment)fragment;
        Log.wtf("primis","secons");




    }
}
