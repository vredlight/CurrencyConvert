package com.example.ved.currencyconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void Convert(View view){

        EditText dollarAmountEditText= (EditText) findViewById(R.id.dollarEditText);

        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());

        Double RupeeAmount = dollarAmountDouble * 71.45 ;

        Toast.makeText(MainActivity.this,"Rs. " + String.format("%.2f",RupeeAmount).toString(),Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
