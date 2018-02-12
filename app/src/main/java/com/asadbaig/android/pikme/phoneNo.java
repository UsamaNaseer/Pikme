package com.asadbaig.android.pikme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import me.anwarshahriar.calligrapher.Calligrapher;

public class phoneNo extends AppCompatActivity {

    ImageButton nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_no);
        Calligrapher calligrapher=new Calligrapher(this);
        calligrapher.setFont(this,"Lato-Regular.ttf",true);

        nextBtn=(ImageButton) findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(phoneNo.this,CodeVerifiy.class);
                startActivity(i);
            }
        });
    }
}
