package com.example.loginregisterationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signup extends AppCompatActivity{
    Button b;
    EditText etName;
    EditText etEmail;
    EditText etPass;

    RadioButton r1;
    RadioButton r2;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        b = findViewById(R.id.btn_signup);
        etEmail = (EditText) findViewById(R.id.input_email);
        etPass = (EditText) findViewById(R.id.input_password);
        etName = (EditText) findViewById(R.id.input_name);

        r1 = (RadioButton) findViewById(R.id.f);
        r1 = (RadioButton) findViewById(R.id.f);

        rg = (RadioGroup) findViewById(R.id.radioGroup);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String salute= "";
                if(r1.isChecked())
                {
                    salute = "Ms.";
                }
                else
                {
                    salute = "Mr.";
                }
                final String name = etName.getText().toString();
                final String email = etEmail.getText().toString();
                final String pass = etPass.getText().toString();
                Toast.makeText(signup.this,"Name "+ salute + name + "\n Email " + email + " \n pass"+ pass,Toast.LENGTH_LONG).show();
                //System.out.println("Name "+ salute + name + "\n Email " + email + " \n pass"+ pass);
            }
        });
    }
}