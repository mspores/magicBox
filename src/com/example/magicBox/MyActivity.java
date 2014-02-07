package com.example.magicBox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    public void sendMessage(View view){
        setContentView(R.layout.help);
    }

    public void sendMessage2(View view){
        setContentView(R.layout.main);
    }
}

