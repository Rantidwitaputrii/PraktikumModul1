package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.studycase.R.id.textView12;

public class StudyCase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_case);
        Intent intent =getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        TextView textView = (TextView) findViewById(R.id.textView14);
        TextView textView1 = (TextView) findViewById(R.id.textView16);


        textView.setText(getIntent().getExtras().getString("TextView"));
        textView1.setText(getIntent().getExtras().getString("TextView1"));

     textView.setText(message);



    }
}
