package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ed1 to 5 is a edittext id...
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        e3=(EditText)findViewById(R.id.ed3);
        e4=(EditText)findViewById(R.id.ed4);
        e5=(EditText)findViewById(R.id.ed5);
        b1=(Button) findViewById(R.id.bt1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=e1.getText().toString();
                String lname=e2.getText().toString();
                if(e1.getText().toString().length()==0) {
                    e1.setError("FIRST NAME IS REQUIRED!!");
                   
                }
                else {
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    //some data put on second activity....
                    i.putExtra("Firstname", name);
                    i.putExtra("Lastname", lname);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "REGISTERED..." + name + lname, Toast.LENGTH_LONG).show();
                }
            }


        });

    }
}