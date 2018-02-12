package com.asadbaig.android.pikme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import me.anwarshahriar.calligrapher.Calligrapher;

public class CodeVerifiy extends AppCompatActivity {
ImageButton nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_verifiy);

        nextBtn=(ImageButton) findViewById(R.id.nextBtn);
        Calligrapher calligrapher=new Calligrapher(this);
        calligrapher.setFont(this,"Lato-Regular.ttf",true);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CodeVerifiy.this,tabbedActivity.class);
                startActivity(i);
            }
        });



    }
}
