package com.example.martabeveridge.rps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        answerTextView = findViewById(R.id.answerTextView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");

        answerTextView.setText(result);
    }
}
