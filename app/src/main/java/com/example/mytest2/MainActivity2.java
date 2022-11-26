package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
EditText aff ;
TextView  ch;
RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      aff = (EditText)findViewById(R.id.aff);
      ch = (TextView)findViewById(R.id.ch);
      r1= (RadioButton) findViewById(R.id.r1);
        r2= (RadioButton) findViewById(R.id.r2);
        r3= (RadioButton) findViewById(R.id.r3);
    }

    public void salut(View view) {
        aff.setText("welcome niss");
    }

    public void ok(View view) {
        String msg= "";
        if(r1.isChecked()){
            msg = (String)msg.concat(" vous etes celibataire");
        }
        if(r2.isChecked()){
            msg = (String)msg.concat(" vous etes mariée");
        }
        if(r3.isChecked()){
            msg = (String)msg.concat(" vous etes divorcée");
        }

        ch.setText(msg);
    }

    public void retour(View view) {
        Intent x = new Intent(this,MainActivity.class);
        startActivity(x);
    }
}