package com.example.addsubresult;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputN1,inputN2;
    Button btnAdd, btnSub;
    TextView txtResult;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputN1=(EditText)findViewById(R.id.editTextN1);
        inputN2=(EditText) findViewById(R.id.editTextN2);
        btnAdd=(Button)findViewById(R.id.buttonAdd);
        btnSub=(Button)findViewById(R.id.buttonSub);
        txtResult= (TextView) findViewById(R.id.textResult);

    }
    public void handleAdd(View view){
         result= Integer.parseInt(inputN1.getText().toString())+
                Integer.parseInt(inputN2.getText().toString());
        txtResult.setText("Result(+): "+result);
    }
    public void handleSub(View view){
        result=Integer.parseInt(inputN1.getText().toString())-
                Integer.parseInt(inputN2.getText().toString());
        txtResult.setText("Result(-): "+result);
    }
}