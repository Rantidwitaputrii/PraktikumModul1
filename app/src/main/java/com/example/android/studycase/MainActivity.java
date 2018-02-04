package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mMessageEditText;
    private EditText mMessageEditText1;


    public  static final  String EXTRA_MESSAGE = "com.example.android.studycase.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText = (EditText) findViewById(R.id.editText);
        mMessageEditText1 = (EditText) findViewById(R.id.editText2);


    }


    public void TempatMakan(View view) {


        Intent intent =  new Intent(this,StudyCase.class);
        String message = mMessageEditText.getText().toString();
        String message1 = mMessageEditText1.getText().toString();


        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);

        Toast toast = null;
        toast = Toast.makeText(getApplicationContext(), "Aku Ramal kamu akan makan disini", Toast.LENGTH_LONG);
        toast.show();
    }

    public void TempatMakan2(View view) {
        Intent intent = new Intent(this, StudyCase.class);
        String message = mMessageEditText.getText().toString();
        String message1 = mMessageEditText1.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        int harga = 50000;
        Toast toast = null;
            toast = Toast.makeText(getApplicationContext(), "Aku Ramal kamu tidak sanggup makan disini", Toast.LENGTH_LONG);
            toast.show();

        intent.putExtra("Abnormal","Eatbus");
        int StudyCase=1;
        startActivityForResult(intent,StudyCase);

    }



}
