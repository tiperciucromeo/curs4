package com.romeotutorial.ex4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private static final String [] items = {"Ianuarie","Februarie","Martie","Aprilie","Mai","Iunie"
            ,"Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView)findViewById(R.id.grid);
        grid.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items));
    }
}
