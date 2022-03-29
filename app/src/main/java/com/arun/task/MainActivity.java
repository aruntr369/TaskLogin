package com.arun.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent data =getIntent();
        String us= data.getStringExtra("username");
        String pw=data.getStringExtra("password");

        EditText user =(EditText) findViewById(R.id.userLog);
        EditText pass =(EditText) findViewById(R.id.passLog);
        user.setText(us);
        pass.setText(pw);

        Button login =(Button) findViewById(R.id.logBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u=user.getText().toString();
                String p=pass.getText().toString();
                if(u.equals(us) && p.equals(pw)){
                    Intent i=new Intent(getApplicationContext(),homePage.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(),"wrong input",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void register(View view) {
        Intent i =new Intent(getApplicationContext(),Register.class);
        startActivity(i);
    }
}