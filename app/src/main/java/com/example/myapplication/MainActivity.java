package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mResultado;
    private EditText mNumero1;
    private EditText mNumero2;
    private EditText mNumero3;
    private EditText mNumero4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        mResultado = (TextView)findViewById(R.id.tvResultado);
        mNumero1 = (EditText)findViewById(R.id.edNumero1);
        mNumero2 = (EditText)findViewById(R.id.edNumero2);
        mNumero3 = (EditText)findViewById(R.id.edNumero3);
        mNumero4 = (EditText)findViewById(R.id.edNumero4);
    }
}
