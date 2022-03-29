package com.arun.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class homePage extends AppCompatActivity {

    String listOfStars[]={"Sirius","Canopus","Arcturus","Alpha","Centauri","Vega","Rigel","Procyon","Acherna"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ListView lv =(ListView) findViewById(R.id.listView);
        ArrayAdapter adapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,listOfStars);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "you selected "+listOfStars[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}