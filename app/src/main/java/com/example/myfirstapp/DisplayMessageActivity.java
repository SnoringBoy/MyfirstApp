package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private static final String TAG = "DisplayMessageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "information log");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "error log");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "debug log");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w(TAG, "waring log");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "verbose log");
    }
}
