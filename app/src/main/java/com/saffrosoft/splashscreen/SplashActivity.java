package com.saffrosoft.splashscreen;

/*
 *Created by Bhuvaneshwaran on 16/9/2021
 *https://www.saffrosoft.ml
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Don't use setContentView(...);

        //Moving to MainActivity as soon as the app loads
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        //finish the SplashActivity
        finish();
    }
}
