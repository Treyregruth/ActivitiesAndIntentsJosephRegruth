package com.nkujosephregruth.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import lifecycleandstate.R;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private ArrayList<TextView> mList = new ArrayList<>(10);
    private static ArrayList<String> saveList = new ArrayList<>(10);

    public static final String EXTRA_MESSAGE = "com.nkujosephregruth.lifecycleandstate.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList.add(findViewById(R.id.textView1));
        mList.add(findViewById(R.id.textView2));
        mList.add(findViewById(R.id.textView3));
        mList.add(findViewById(R.id.textView4));
        mList.add(findViewById(R.id.textView5));
        mList.add(findViewById(R.id.textView6));
        mList.add(findViewById(R.id.textView7));
        mList.add(findViewById(R.id.textView8));
        mList.add(findViewById(R.id.textView9));
        mList.add(findViewById(R.id.textView10));
        if(savedInstanceState != null) {
            saveList = savedInstanceState.getStringArrayList("list");
            for(int y = 0; y < mList.size(); y++) {
                if(!saveList.get(y).equals("")) {
                    mList.get(y).setText(saveList.get(y));
                }
            }
        }
        else {
            for (int x = 0; x < 10; x++) {
                saveList.add("");
            }
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST) {
            if(resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                for(int x = 0; x < saveList.size(); x++) {
                    if(saveList.get(x).equals("")) {
                        reply = "1 " + reply;
                        mList.get(x).setText(reply);
                        saveList.set(x, reply);
                        return;
                    }
                    else if(saveList.get(x).contains(reply)) {
                        int nextNum = Integer.parseInt(saveList.get(x).substring(0, saveList.get(x).indexOf(" "))) + 1;
                        reply = nextNum + " " + reply;
                        saveList.set(x, reply);
                        mList.get(x).setText(reply);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArrayList("list", saveList);
    }


    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}