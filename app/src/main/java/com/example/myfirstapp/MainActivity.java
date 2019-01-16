package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText)findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
