package com.example.luxchat.UI;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.luxchat.R;

public class Splash_Activity extends AppCompatActivity {
    private  static  int SPLASH_TIME_OUT =3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent
                        = new Intent(Splash_Activity.this,LoginActivity.class);
                startActivity(intent);

            }
        },SPLASH_TIME_OUT);
    }
}
