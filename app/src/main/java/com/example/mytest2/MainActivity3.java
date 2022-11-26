package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
EditText nom1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
         nom1 = (EditText) findViewById(R.id.nom1);
    }

    public void recup(View view) {
        Bundle b = getIntent().getExtras();
        nom1.setText(b.getString("nom"));
    }
}