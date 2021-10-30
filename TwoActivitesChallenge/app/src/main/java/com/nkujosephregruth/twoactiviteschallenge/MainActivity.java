package com.nkujosephregruth.twoactiviteschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.nkyjosephregruth.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTextOne(View view) {
        Log.d(LOG_TAG, "Button One Clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String displayText = "one";
        intent.putExtra(EXTRA_MESSAGE, displayText);
        startActivity(intent);
    }

    public void openTextTwo(View view) {
        Log.d(LOG_TAG, "Button Two Clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String displayText = "two";
        intent.putExtra(EXTRA_MESSAGE, displayText);
        startActivity(intent);
    }

    public void openTextThree(View view) {
        Log.d(LOG_TAG, "Button Three Clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String displayText = "three";
        intent.putExtra(EXTRA_MESSAGE, displayText);
        startActivity(intent);
    }
}