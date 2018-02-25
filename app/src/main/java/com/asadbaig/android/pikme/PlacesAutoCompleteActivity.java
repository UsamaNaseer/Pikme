package com.asadbaig.android.pikme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.ui.PlaceAutocomplete;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import  com.asadbaig.android.pikme.listeners.RecyclerItemClickListener;
import java.util.ArrayList;
import java.util.List;

import com.asadbaig.android.pikme.Modules.SearchlocationData;
import me.anwarshahriar.calligrapher.Calligrapher;

import static android.R.attr.data;
import static android.os.Build.VERSION_CODES.M;


public class PlacesAutoCompleteActivity extends BaseActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, View.OnClickListener {
    protected GoogleApiClient mGoogleApiClient;

    private static final LatLngBounds BOUNDS_INDIA = new LatLngBounds(
            new LatLng(-0, 0), new LatLng(0, 0));
    private EditText mAutocompleteView;
    //private EditText dropoff;
    private RecyclerView mRecyclerView;
    private RecyclerView favRecycler;
    private RecyclerView.Adapter adapt;
   // private List<favListitem> listitem;
    private LinearLayoutManager mLinearLayoutManager;
    private PlacesAutoCompleteAdapter mAutoCompleteAdapter;
    ImageView delete;
    String searchFor;
    ImageButton favbtn;
    String favPlace="University Of Karachi";
Button selectLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildGoogleApiClient();
        setContentView(R.layout.activity_search);






        Intent in = getIntent();
        if(in.getExtras()!=null) {
            searchFor = in.getStringExtra("searchFor");

          /*  if(searchFor.equalsIgnoreCase("origin")) {
                mAutocompleteView.setHint("Enter Pickup Location");
            }else {
                mAutocompleteView.setHint("Enter Destination");
            }*/
        }
        //favbtn=(ImageButton) findViewById(R.id.favbtn);
        mAutocompleteView = (EditText) findViewById(R.id.autocomplete_places);
//dropoff=(EditText) findViewById(R.id.dropoff);
        //selectLoc=(Button) findViewById(R.id.LocS);
//dropoff=(EditText) findViewById(R.id.dropoff);
//        selectLoc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(PlacesAutoCompleteActivity.this,draggableMap.class);
//                intent.putExtra("searchFor",searchFor);
//                //startActivity(intent);
//                startActivityForResult(intent   , 1);
//
//            }
//        });





        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "Lato-Black.ttf", true);

        AutocompleteFilter autocompleteFilter = new AutocompleteFilter.Builder()
                .setTypeFilter(Place.TYPE_COUNTRY)
                .setCountry("PK")
                .build();
        try {
            Intent intent = new PlaceAutocomplete.IntentBuilder(PlaceAutocomplete.MODE_FULLSCREEN)
                    .setFilter(autocompleteFilter)
                    .build(this);
        } catch (GooglePlayServicesRepairableException e) {
            e.printStackTrace();
        } catch (GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        }
        //   delete=(ImageView)findViewById(R.id.cross);

        mAutoCompleteAdapter = new PlacesAutoCompleteAdapter(this, R.layout.searchview_adapter,
                mGoogleApiClient, BOUNDS_INDIA, autocompleteFilter);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(mAutoCompleteAdapter);




//        favRecycler=(RecyclerView) findViewById(R.id.favRecycler);
//        favRecycler.setHasFixedSize(true);
//        favRecycler.setLayoutManager(new LinearLayoutManager(this));
//
//        listitem=new ArrayList<>();
//
//        for(int i=0;i<10;i++)
//        {
//            favListitem listitems=new favListitem(favPlace+i+1,"2.4km, Gulshan_town, Karachi");
//            listitem.add(listitems);
//
//        }
//





//
//        adapt = new FavlistAdapter(listitem,this);
//
//adapt.notifyDataSetChanged();
//        favRecycler.setAdapter(adapt);

//        favRecycler.addOnItemTouchListener(
//                new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(final View view, int position) {
//
//
//LatLng ltlg=new LatLng(24.8615, 67.0099);
//                        SearchlocationData data= new SearchlocationData();
//                        data.setId("1");
//                       data.setLatLng(ltlg);
//                        data.setName( listitem.get(position).getPlName());
//                        data.setC_address( listitem.get(position).getPlName());
//
//
//                        if(searchFor.equalsIgnoreCase("origin")) {
//                            BaseActivity.search_data.put("origin", data);
//                        }
//                        else
//                        {
//                            BaseActivity.search_data.put("destination", data);
//                        }
//
//                        finish();
//
//                    }
//
//                    }));



//        delete.setOnClickListener(this);
        mAutocompleteView.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                if (!s.toString().equals("") && mGoogleApiClient.isConnected()) {
                    mAutoCompleteAdapter.getFilter().filter(s.toString());

                     if (count==0){
                        mRecyclerView.setVisibility(View.GONE);
                    }

                    else if(count>0)
                    {

                        mRecyclerView.setVisibility(View.VISIBLE);

                    }
                } else if (!mGoogleApiClient.isConnected()) {
                    //    Toast.makeText(getApplicationContext(), Constants.API_NOT_CONNECTED, Toast.LENGTH_SHORT).show();
                    // Log.e(Constants.PlacesTag,Constants.API_NOT_CONNECTED);

                }

            }

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            public void afterTextChanged(Editable s) {

            }
        });
//        dropoff.addTextChangedListener(new TextWatcher() {
//
//            public void onTextChanged(CharSequence s, int start, int before,
//                                      int count) {
//                if (!s.toString().equals("") && mGoogleApiClient.isConnected()) {
//                    mAutoCompleteAdapter.getFilter().filter(s.toString());
//
//                }else if(!mGoogleApiClient.isConnected()){
//                    //Toast.makeText(getApplicationContext(), Constants.API_NOT_CONNECTED, Toast.LENGTH_SHORT).show();
//                    // Log.e(Constants.PlacesTag,Constants.API_NOT_CONNECTED);
//                }
//
//            }
//
//            public void beforeTextChanged(CharSequence s, int start, int count,
//                                          int after) {
//
//            }
//
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(final View view, int position) {
                        final PlacesAutoCompleteAdapter.PlaceAutocomplete item = mAutoCompleteAdapter.getItem(position);
                        final String placeId = String.valueOf(item.placeId);

                        Log.i("TAG", "Autocomplete item selected: " + item.description);


                        /*
                             Issue a request to the Places Geo Data API to retrieve a Place object with additional details about the place.
                         */

                        PendingResult<PlaceBuffer> placeResult = Places.GeoDataApi
                                .getPlaceById(mGoogleApiClient, placeId);
                        placeResult.setResultCallback(new ResultCallback<PlaceBuffer>() {
                            @Override
                            public void onResult(PlaceBuffer places) {
                                if (places.getCount() == 1) {
                                   //Do the things here on Click.....
                                   mAutocompleteView.setText((places.get(0).getName()));

//                                    SearchlocationData data= new SearchlocationData();
//                                    data.setId(places.get(0).getId());
//                                    data.setLatLng(places.get(0).getLatLng());
//                                    data.setName(places.get(0).getName());
                                    if(places.get(0).getAddress().toString().contains(places.get(0).getName().toString())) {
                                 //       data.setC_address(places.get(0).getAddress());
                                    }
                                    else
                                    {
                                    //    data.setC_address(places.get(0).getName()+", "+places.get(0).getAddress());
                                    }

                                    Log.i("","Search DATA: "+places.get(0).getAttributions());
                                    if(searchFor.equalsIgnoreCase("origin")) {
                                      //  BaseActivity.search_data.put("origin", data);
                                    }
                                    else
                                    {
                                        //BaseActivity.search_data.put("destination", data);
                                    }

                                    finish();



                                    mRecyclerView.setVisibility(View.GONE);

                                    // dropoff.setText((places.get(0).getName()));
                                    //   Toast.makeText(getApplicationContext(), String.valueOf(places.get(0).getLatLng()), Toast.LENGTH_SHORT).show();} else {
                                    //  Toast.makeText(getApplicationContext(),Constants.SOMETHING_WENT_WRONG, Toast.LENGTH_SHORT).show();
                                }
                            }
                        });


                    }
                })
        );


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
              //  String result = data.getStringExtra("result");
            finish();
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .addApi(Places.GEO_DATA_API)
                .build();
    }

    @Override
    public void onConnected(Bundle bundle) {
        Log.v("Google API Callback", "Connection Done");

    }

    @Override
    public void onConnectionSuspended(int i) {
        Log.v("Google API Callback", "Connection Suspended");
        Log.v("Code", String.valueOf(i));
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
        Log.v("Google API Callback","Connection Failed");
        Log.v("Error Code", String.valueOf(connectionResult.getErrorCode()));
      //  Toast.makeText(this, Constants.API_NOT_CONNECTED, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if(v==delete){
            mAutocompleteView.setText("");
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!mGoogleApiClient.isConnected() && !mGoogleApiClient.isConnecting()){
            Log.v("Google API","Connecting");
            mGoogleApiClient.connect();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if(mGoogleApiClient.isConnected()){
            Log.v("Google API","Dis-Connecting");
            mGoogleApiClient.disconnect();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
