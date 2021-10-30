package com.nkujosephregruth.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import lifecycleandstate.R;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.nkujosephregruth.lifecycleandstate.extra.REPLY";
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public void returnOtherFormOfBread(View view) {
        String reply = "OtherBread";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnPoptarts(View view) {
        String reply = "Poptarts";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnIceCream(View view) {
        String reply = "Ice Cream";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnPizza(View view) {
        String reply = "Pizza";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnPineapple(View view) {
        String reply = "Pineapple";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnBananas(View view) {
        String reply = "Bananas";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnBread(View view) {
        String reply = "Bread";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnApples(View view) {
        String reply = "Apples";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnRice(View view) {
        String reply = "Rice";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }

    public void returnCheese(View view) {
        String reply = "Cheese";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }
}