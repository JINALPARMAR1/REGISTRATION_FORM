package com.example.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

import static com.example.registrationform.R.layout.second_main;

public class SecondActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.second_main);
    //txt11 and txt12 is a textview from second_main activity...
    TextView tv1=(TextView)findViewById(R.id.txt11);
    TextView tv2=(TextView)findViewById(R.id.txt12);
        Intent i=getIntent();
        //Firstname and Lastname... from MainActivity.java file....
        String str = i.getStringExtra("Firstname");
        String str1 = i.getStringExtra("Lastname");

        tv1.setText(str);
        tv2.setText(str1);
    }
}
