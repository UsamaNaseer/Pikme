package com.asadbaig.android.pikme;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import me.anwarshahriar.calligrapher.Calligrapher;

import static android.R.attr.fragment;

public class navigationDrawer extends AppCompatActivity {

    ImageButton cancel;
TextView tvNotify,tvPolicy,tvLogout,tvEditcar,tvTerms,tvSettings,tvTransaction;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        tvNotify=(TextView) findViewById(R.id.tvNotify);
        tvEditcar=(TextView) findViewById(R.id.tvEditCar);
        tvLogout=(TextView) findViewById(R.id.tvLogout);
tvPolicy=(TextView) findViewById(R.id.tvPolicy);
        tvTerms=(TextView) findViewById(R.id.tvTerms);
tvSettings=(TextView)findViewById(R.id.tvSettings);
        tvTransaction=(TextView)findViewById(R.id.tvTransaction);


onClicklistener();

        Calligrapher calligrapher=new Calligrapher(this);
        calligrapher.setFont(this,"Lato-Regular.ttf",true);

    cancel=(ImageButton) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
public void onClicklistener(){

    tvNotify.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            navFragNotify fragment = new navFragNotify();
            transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.navDrawer, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    });
    tvPolicy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            navFragPolicy fragment = new navFragPolicy();
            transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.navDrawer, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }); tvEditcar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            navFragEditCar fragment = new navFragEditCar();
            transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.navDrawer, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }); tvLogout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            navFragLogout fragment = new navFragLogout();
            transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.navDrawer, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }); tvTransaction.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            navFragTrasaction fragment = new navFragTrasaction();
            transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.navDrawer, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }); tvTerms.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            navFragTerms fragment = new navFragTerms();
            transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.navDrawer, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }); tvSettings.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            navFragSettings fragment = new navFragSettings();
            transaction=getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.navDrawer, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    });

}


}
