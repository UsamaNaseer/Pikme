package com.asadbaig.android.pikme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import me.anwarshahriar.calligrapher.Calligrapher;

public class FindRide extends AppCompatActivity {
Button btn_find;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ride);

        Calligrapher calligrapher=new Calligrapher(this);
        calligrapher.setFont(this,"Lato-Semibold.ttf",true);

btn_find=(Button) findViewById(R.id.btn_findNow);

    btn_find.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(FindRide.this,MapsActivity.class);
            startActivity(i);

        }
    });
    }
}
