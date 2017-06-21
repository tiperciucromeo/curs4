package com.romeotutorial.ex2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    private static final String[] items = {"Ianuarie","Februarie","Martie","Aprilie","Mai","Iunie",
            "Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.list);

        lista.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));



    }
}
