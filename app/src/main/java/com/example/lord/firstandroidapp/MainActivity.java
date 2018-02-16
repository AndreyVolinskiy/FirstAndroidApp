package com.example.lord.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "FirstAndroidApp";
    private Button btnOk;
    private TextView txtHello;
    private EditText txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk = findViewById(R.id.btn_ok);
        txtHello = findViewById(R.id.txt_hello);
        txtEmail = findViewById(R.id.txt_email);
        v(txtHello.getText().toString());
    }

    public void sayHello(View view) {

        System.out.println("Hello");
        String s = txtEmail.getText().toString();
        txtHello.setText(s);
    }

    public static void v(String msg) {
        android.util.Log.v(TAG, msg);
    }
}