package com.example.mytest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b1 ;
EditText nom ;
TextView affich;
TextView choix ;
CheckBox  c1;
CheckBox c2;
CheckBox c3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.b1);
        nom = (EditText)findViewById(R.id.nom);
        affich = (TextView)findViewById(R.id.affich);
        choix = (TextView)findViewById(R.id.choix);
        c1= (CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
     // affich.setText("Welcom "+nom.getText().toString()+" "+" to our company ");
        Intent i1 = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i1);
    }
});
    }


    public void merci(View view) {
       // affich.setText("c' est noté par"+nom.getText().toString());
        Intent x = new Intent(this,MainActivity3.class);
        Bundle b = new Bundle();
        b.putString("nom",nom.getText().toString());
        x.putExtras(b);
        startActivity(x);

    }

    public void conf(View view) {
        String ch = " vous avez choisi : ";
        if(c1.isChecked()){
            ch= ((String)ch).concat("Java ");
        }
        if(c2.isChecked()){
            ch=((String)ch ).concat("C++");
        }if(c3.isChecked()){
            ch=((String) ch).concat("Python ");
        }
        choix.setText(ch.toString());
    }
}