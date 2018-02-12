package com.asadbaig.android.pikme;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mukesh.countrypicker.CountryPicker;
import com.mukesh.countrypicker.CountryPickerListener;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity {
ImageButton nextBtn;
TextView country;
    CountryPicker picker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
nextBtn=(ImageButton) findViewById(R.id.nextBtn);
country=(TextView) findViewById(R.id.country);

        Calligrapher calligrapher=new Calligrapher(this);
        calligrapher.setFont(this,"Lato-Bold.ttf",true);

         picker = CountryPicker.newInstance("Choose Your Country ");  // dialog title

        picker.setListener(new CountryPickerListener() {
            @Override
            public void onSelectCountry(String name, String code, String dialCode, int flagDrawableResID) {
                // Implement your code here
country.setText(name);
                country.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);
                country.setCompoundDrawablePadding(10);
                Drawable img = country.getResources().getDrawable( flagDrawableResID );

                img.setBounds( 0, 0,  img.getIntrinsicWidth() * country.getMeasuredHeight() / img.getIntrinsicHeight(), country.getMeasuredHeight() );
                country.setCompoundDrawablesWithIntrinsicBounds( img, null, null, null);

                picker.dismiss();
            }
        });

       // picker.setArguments(getWindow.);
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picker.show(getSupportFragmentManager(), "COUNTRY_PICKER");
            }
        });


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,LoginActivity.class);
           startActivity(i);

            }
        });
    }
}
