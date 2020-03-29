package com.example.checkbox_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1, input2;
    private TextView result;
    private CheckBox sum , sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input_1);
        input2 = (EditText) findViewById(R.id.input_2);
        result = (TextView)findViewById(R.id.result_txt);
        sum = (CheckBox) findViewById(R.id.sum_check);
        sub = (CheckBox)findViewById(R.id.sub_check);
    }

    public void calculate (View view){
        int v1 = Integer.parseInt(input1.getText().toString());
        int v2 =Integer.parseInt(input1.getText().toString());
        String result2 = " ";

        if (sum.isChecked()){
            int suma = v1 + v2;
            result2 = "The result of the sum is " + suma + "/";
        }
        if (sub.isChecked()){
            int sub = v1 - v2;
            result2 = result2 + "The result of the substraction is " + sub;
        }

        result.setText(result2);
    }
}
