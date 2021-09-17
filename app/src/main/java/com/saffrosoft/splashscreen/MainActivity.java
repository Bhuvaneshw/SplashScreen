package com.saffrosoft.splashscreen;

/*
 *Created by Bhuvaneshwaran on 16/9/2021
 *https://www.saffrosoft.ml
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        github = findViewById(R.id.github);

        github.setOnClickListener(new OnClickListener(){

                @Override
                public void onClick(View p1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://github.com/Bhuvaneshw/SplashScreen"));
                    startActivity(intent);
                }
            });
    }
}
