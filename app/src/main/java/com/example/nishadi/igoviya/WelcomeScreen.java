package com.example.nishadi.igoviya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {

    Button signin,signup,forum,aboutus;

    public void signinaction(){
        signin = (Button)findViewById(R.id.btnSignin);
        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent t = new Intent(WelcomeScreen.this,SignIn.class);
                startActivity(t);
            }
        });
    }

    public void signupaction(){
        signup = (Button)findViewById(R.id.btnSignup);
        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent t = new Intent(WelcomeScreen.this,Signup.class);
                startActivity(t);
            }
        });
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        signinaction();
        signupaction();
    }

}
