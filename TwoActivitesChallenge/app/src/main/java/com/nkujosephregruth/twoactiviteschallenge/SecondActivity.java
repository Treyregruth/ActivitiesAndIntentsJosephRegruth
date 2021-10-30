package com.nkujosephregruth.twoactiviteschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    private TextView mTextTitle;
    private TextView mTextArticle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mTextTitle = findViewById(R.id.text_title);
        mTextArticle = findViewById(R.id.text_body);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Log.d(LOG_TAG, message);
        switch(message) {
            case "one":
                mTextTitle.setText(R.string.text_one_title);
                mTextArticle.setText(R.string.text_one);
                break;

            case "two":
                mTextTitle.setText(R.string.text_two_title);
                mTextArticle.setText(R.string.text_two);
                break;

            case "three":
                mTextTitle.setText(R.string.text_three_title);
                mTextArticle.setText(R.string.text_three);
                break;
        }
    }
}