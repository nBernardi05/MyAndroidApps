package com.example.a20230126_bernardinicola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static boolean termini = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton g = (RadioButton) findViewById(R.id.giornaliera);
        g.setChecked(true);

    }
    public void logIn(View view){
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        RadioGroup rg = (RadioGroup) findViewById(R.id.fmail);
        RadioButton che = findViewById(rg.getCheckedRadioButtonId());
        Context context = getApplicationContext();
        CharSequence text = "Username: " + username.getText() + " password: " + password.getText() + " frequenza mail: " + che.getText() + " Accesso effettuato";
        int duration = Toast.LENGTH_SHORT;
        if(!termini){
            text = "Prima accetta i termini";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.fiore2);
        Intent i = new Intent();
        String usrname =  (username.getText()).toString();
        i.putExtra("username", usrname);
        i.setClass(this, activity_welcome.class);
        startActivity(i);

    }
    public void chiudiApp(View view){
        finish();
    }

    public void termini(View view){
        CheckBox c = (CheckBox) view;
        if(c.isChecked())
            termini = true;
        else
            termini = false;
    }

}