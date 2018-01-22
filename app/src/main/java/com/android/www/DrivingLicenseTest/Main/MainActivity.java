package com.android.www.DrivingLicenseTest.Main;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.www.DrivingLicenseTest.R;

import com.android.www.DrivingLicenseTest.online.Car;
import com.android.www.DrivingLicenseTest.question.QuestionActivity;
import com.android.www.DrivingLicenseTest.question.QuestionActivity1;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {

        InterstitialAd mInterstitialAd;
        private InterstitialAd interstitial;
    Button  btnsimple, btntime, btnuntime;
    Button btn;
    String uriString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  setContentView(R.layout.optionsmenu);



        AdRequest adRequest = new AdRequest.Builder().build();

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
// Call displayInterstitial() function
                displayInterstitial();
            }
        });
     /*   AdView mAdView = (AdView) findViewById(com.android.www.DrivingLicenseTest.R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/
     //   btn = (Button) findViewById(R.id.idbtn);
       // btnsimple = (Button) findViewById(com.android.www.DrivingLicenseTest.R.id.btnsimple);
  //      btntime = (Button) findViewById(com.android.www.DrivingLicenseTest.R.id.btntime);
//        btnuntime = (Button) findViewById(com.android.www.DrivingLicenseTest.R.id.btnuntime);


    }
/*
    public void b8(View view) {
        startActivity(new Intent(this, Rules.class));
    }

    public void b7(View view) {
        startActivity(new Intent(this, Online.class));
    }*/



    public void b1(View view) {
        startActivity(new Intent(this, QuestionActivity1.class));
    }
    public void b2(View view) {
        startActivity(new Intent(this, QuestionActivity.class));
    }
    public void b3(View view) {
        startActivity(new Intent(this, Car.class));
    }
    public void b4(View view) {
        startActivity(new Intent(this, Random.class));
    }
    public void b5(View view) {
        startActivity(new Intent(this, Facebook.class));
    }
    public void b6 (View view) {
        startActivity(new Intent(this, signals.class));
    }
    public void b7(View view) {
        startActivity(new Intent(this, Rules.class));
    }
    public void b8(View view) {
        startActivity(new Intent(this, Online.class));
    }
    public void b9(View v){
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            //Give any url in uriString
            uriString = "https://play.google.com/store/apps/details?id=com.androidwebviewapp.www.drivinglicensetest";
            sharingIntent.putExtra(Intent.EXTRA_TEXT,uriString );
            sharingIntent.setPackage("com.facebook.katana");
            startActivity(sharingIntent);
        }
    public void b10(View view) {
        startActivity(new Intent(this, About.class));
    }





    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
    }




