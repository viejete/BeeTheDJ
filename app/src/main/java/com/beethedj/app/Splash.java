package com.beethedj.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.facebook.AccessToken;
import com.squareup.picasso.Picasso;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        AccessToken token = AccessToken.getCurrentAccessToken();

        ImageView logo = (ImageView) findViewById(R.id.logo_app);
        //Picasso.with(getApplicationContext()).load(R.drawable.icon_app).into(logo);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (token != null) {
            Intent i = new Intent(this , FindDisco.class);
            startActivity(i);
        } else {
            Intent i = new Intent(this , Login.class);
            startActivity(i);
        }


    }
}
