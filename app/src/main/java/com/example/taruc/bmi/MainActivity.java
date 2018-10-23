package com.example.taruc.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editWeight;
    private EditText editHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editWeight = findViewById(R.id.editWeight);
        editHeight = findViewById(R.id.editHeight);
    }

    public void Weight(View view){
        String stringMessage1;
        double w;
        if(TextUtils.isEmpty(editWeight.getText())){
            editWeight.setError("Please enter a value");
            return;
        }
        else{
             w = Double.parseDouble(String.valueOf(editWeight));
        }
        stringMessage1 = editWeight.getText().toString();

    }

    public void Height(View view){
        String stringMessage2;
        double h;
        if(TextUtils.isEmpty(editWeight.getText())){
            editWeight.setError("Please enter a value");
            return;
        }
        else{
            h = Double.parseDouble(String.valueOf(editHeight));
        }
    }

    double result = (Double.parseDouble(String.valueOf(editHeight)))/((D));
}
