package com.example.a20230126_bernardinicola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        TextView us = (TextView) findViewById(R.id.user);
        us.setText(us.getText() + " " + username);
    }

    public void logout(View view){
        finish();
    }
}