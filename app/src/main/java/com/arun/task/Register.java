package com.arun.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Register extends AppCompatActivity {

    String pass;
    String usser;
    String states[]={"kerala","tn","ap","mp","hp","up"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button regbtn =(Button) findViewById(R.id.regBtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText use =(EditText) findViewById(R.id.userName);
                EditText pas =(EditText)findViewById(R.id.passWord);
                pass=use.getText().toString();
                usser=pas.getText().toString();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                i.putExtra("username",usser);
                i.putExtra("password",pass);
                startActivity(i);
            }
        });

        Spinner sp=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,states);
        sp.setAdapter(adapter);
    }
}