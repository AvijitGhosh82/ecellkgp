package com.ecellkgp.updates;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class Announcements extends ActionBarActivity {
    TextView msgET, usertitleET;

    private CustomCursorAdapter customAdapter;
    private PersonDatabaseHelper databaseHelper;
    private static final int ENTER_DATA_REQUEST_CODE = 1;
    private ListView listView;

    private final static int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private String str;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);

        toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(new SpannableString("Announcements"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }

        // Intent Message sent from Broadcast Receiver
        str = getIntent().getStringExtra("msg");

        // Get Email ID from Shared preferences
        SharedPreferences prefs = getSharedPreferences("UserDetails",
                Context.MODE_PRIVATE);
        String eMailId = prefs.getString("eMailId", "");
        // Set Title
        //usertitleET = (TextView) findViewById(R.id.usertitle);

        // Check if Google Play Service is installed in Device
        // Play services is needed to handle GCM stuffs
        if (!checkPlayServices()) {
            Toast.makeText(
                    getApplicationContext(),
                    "This device doesn't support Play services, App will not work normally",
                    Toast.LENGTH_LONG).show();
        }

        databaseHelper = new PersonDatabaseHelper(this);

        listView = (ListView) findViewById(R.id.list_data);

        //usertitleET.setText("Notifications for " + eMailId);
        // When Message sent from Broadcase Receiver is not empty
        /*if (str != null) {
            // Set the message
            msgET = (TextView) findViewById(R.id.message);
            msgET.setText(str);

            
            
        }*/

        


        // Database query can be a time consuming task ..
        // so its safe to call database query in another thread
        // Handler, will handle this stuff for you <img src="http://s0.wp.com/wp-includes/images/smilies/icon_smile.gif?m=1129645325g" alt=":)" class="wp-smiley">

        new Handler().post(new Runnable() {
            @Override
            public void run() {
                customAdapter = new CustomCursorAdapter(Announcements.this, databaseHelper.getAllData());
                listView.setAdapter(customAdapter);

            }
        });
    }




    // Check if Google Playservices is installed in Device or not
    private boolean checkPlayServices() {
        int resultCode = GooglePlayServicesUtil
                .isGooglePlayServicesAvailable(this);
        // When Play services not found in device
        if (resultCode != ConnectionResult.SUCCESS) {
            if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
                // Show Error dialog to install Play services
                GooglePlayServicesUtil.getErrorDialog(resultCode, this,
                        PLAY_SERVICES_RESOLUTION_REQUEST).show();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "This device doesn't support Play services, App will not work normally",
                        Toast.LENGTH_LONG).show();
                finish();
            }
            return false;
        } else {
            //Toast.makeText(
              //      getApplicationContext(),
                //    "This device supports Play services, App will work normally",
                  //  Toast.LENGTH_LONG).show();
        }
        return true;
    }

    // When Application is resumed, check for Play services support to make sure
    // app will be running normally
    @Override
    protected void onResume() {
        super.onResume();
        checkPlayServices();
    }
}