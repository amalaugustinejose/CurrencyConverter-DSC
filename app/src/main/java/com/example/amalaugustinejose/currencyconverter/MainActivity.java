package com.example.amalaugustinejose.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText et;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrencyUSD(View view) {
        EditText et = (EditText) findViewById(R.id.inputCurrency);
        TextView tv = (TextView) findViewById(R.id.outputCurrency);
        try {
            Float input = Float.parseFloat(et.getText().toString());
            tv.setText("" + (input * 65) + " INR");
        } catch (Exception e) {
            tv.setText("Enter Number");
        }
    }

    public void convertCurrencyINR(View view) {
        EditText et = (EditText) findViewById(R.id.inputCurrency);
        TextView tv = (TextView) findViewById(R.id.outputCurrency);
        try {
            Float input = Float.parseFloat(et.getText().toString());
            tv.setText("" + (input * 0.015346154) + " USD");
        } catch (Exception e) {
            tv.setText("Enter Number");
        }
    }
}
