package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtHello;
    EditText edtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.editTextName);
        txtHello = findViewById(R.id.textMessage);
    }

    public void onBtnClickHere(View view) {
        String name = edtName.getText().toString();
        txtHello.setText("Hello, " + name);
    }
}