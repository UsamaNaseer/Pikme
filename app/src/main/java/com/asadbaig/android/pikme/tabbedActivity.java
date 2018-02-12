package com.asadbaig.android.pikme;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import me.anwarshahriar.calligrapher.Calligrapher;

public class tabbedActivity extends AppCompatActivity {
    FragmentManager fm;
RelativeLayout rlProfile,rlOffer,rlInbox,rlRides,rlSearch,rlFooter;
ImageView burger;
    ImageButton ridesBtn;
    FragInbox fInbox;
    FragSearches fSearches;
    FragProfile fProfile;
    FragOffer fOffer;
    FragRides fRides;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        rlFooter=findViewById(R.id.footer);
  //      Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
//        setSupportActionBar(toolbar);

      //  fm = getSupportFragmentManager();



        rlRides=(RelativeLayout)findViewById(R.id.rlRides);
        rlInbox=(RelativeLayout) findViewById(R.id.rlInbox);
rlProfile=(RelativeLayout) findViewById(R.id.rlProfile);
        rlOffer=(RelativeLayout) findViewById(R.id.rlOffer);
        rlSearch=(RelativeLayout) findViewById(R.id.rlSearch);


        ridesBtn=(ImageButton) findViewById(R.id.ride) ;

        Calligrapher calligrapher=new Calligrapher(this);
        calligrapher.setFont(this,"Lato-Semibold.ttf",true);
       burger=(ImageView) findViewById(R.id.burger);

        // toolbar.setTitle("Your FragRides");


     burger.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
       // Toast.makeText(tabbedActivity.this,"rl rides p click kya gya hai",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(tabbedActivity.this,navigationDrawer.class);
        startActivityForResult(intent,0);
        tabbedActivity.this.overridePendingTransition( R.anim.righttoleft, R.anim.stable );
         }
});



        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      //  getMenuInflater().inflate(R.menu.menu_tabbed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter( FragmentManager fm) {
            super(fm);

//             transaction = getSupportFragmentManager().beginTransaction();
//            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
//            ft=fm.beginTransaction();

            rlRides.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rlFooter.setBackgroundResource(R.drawable.tabs_bg);

                    FragRides fragment = new FragRides();
                    transaction=getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.main_content, fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();


                }
            });

            rlInbox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rlFooter.setBackgroundResource(R.drawable.tabs_bg);
                    transaction=getSupportFragmentManager().beginTransaction();
                    FragInbox fragment = new FragInbox();

                    transaction.replace(R.id.main_content, fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            });
            rlSearch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rlFooter.setBackgroundResource(R.drawable.tabs_bg);
                    FragSearches fragment = new FragSearches();
                   transaction=getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.main_content, fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            });
            rlProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rlFooter.setBackgroundResource(R.drawable.tabs_bg);
                    FragProfile fragment = new FragProfile();
                    transaction=getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.main_content, fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            });


            rlOffer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
rlFooter.setBackgroundResource(R.drawable.tabs_bg_sel);
                    FragOffer fragment = new FragOffer();
                    transaction=getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.main_content, fragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            });


        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    Current tab1 = new Current();
                    return tab1;
                case 1:
                    History tab2 = new History();
                    return tab2;

                default:
                    return null;

            }


         //   return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Current";
                case 1:
                    return "History";
//                case 2:
//                    return "SECTION 3";
            }
            return null;
        }
    }
}
