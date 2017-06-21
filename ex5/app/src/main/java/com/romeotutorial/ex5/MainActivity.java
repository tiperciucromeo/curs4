package com.romeotutorial.ex5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    private AutoCompleteTextView edit;
    private TextView textView;
    private static final String [] items = {"Ianuarie","Februarie","Martie","Aprilie","Mai","Iunie","Iulie",
            "August","Septembrie","Octombrie","Noiembrie","Decembrie"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.selection);
        edit = (AutoCompleteTextView) findViewById(R.id.edit);

        edit.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,items));
        edit.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        textView.setText(edit.getText());

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
