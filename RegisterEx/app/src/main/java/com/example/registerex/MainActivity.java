package com.example.registerex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleSubmit(View view) {
        EditText addTextName = findViewById(R.id.edtName);
        EditText addTextSurname = findViewById(R.id.edtSurname);
        EditText addTextEmail = findViewById(R.id.edtEmail);

        TextView viewName = findViewById(R.id.txtViewName);
        TextView viewSurname = findViewById(R.id.txtViewSurname);
        TextView viewEmail = findViewById(R.id.txtViewMail);
        viewName.setText("First Name: "+addTextName.getText());
        viewSurname.setText("Last Name: "+addTextSurname.getText());
        viewEmail.setText("Email Address: "+addTextEmail.getText());

    }
}