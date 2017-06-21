package com.romeotutorial.ex3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView textView;
    Spinner spinner;
    private static final String [] items = {"Ianuarie","Februarie","Martie","Aprilie","Mai","Iunie"
            ,"Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        textView = (TextView) findViewById(R.id.selection);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,items);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(arrayAdapter);
    }

   @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        textView.setText(items[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

        textView.setText("");
    }
}
