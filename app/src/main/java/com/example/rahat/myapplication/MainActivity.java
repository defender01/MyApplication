package com.example.rahat.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText emailEditText,passEditText;
    private Button loginButton,signinButton,loginGoogleButton,loginFacebookButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText =(EditText) findViewById(R.id.emailLoginId);
        passEditText =(EditText) findViewById(R.id.passwordLoginId);
        loginButton =(Button) findViewById(R.id.loginButtonId);
        loginGoogleButton =(Button) findViewById(R.id.loginGoogleId);
        loginFacebookButton =(Button) findViewById(R.id.loginFacebookId);
        signinButton =(Button) findViewById(R.id.signupButtonId);

        emailEditText.setOnClickListener(this);
        passEditText.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        loginGoogleButton.setOnClickListener(this);
        loginFacebookButton.setOnClickListener(this);
        
        signinButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.emailLoginId){

        }
        if(v.getId()==R.id.passwordLoginId){

        }
        if(v.getId()==R.id.loginButtonId){

        }
        if (v.getId()==R.id.signupButtonId){
            startActivity(new Intent(this,signupActivity.class));
        }
    }
}
