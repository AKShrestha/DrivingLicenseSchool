package com.android.www.DrivingLicenseTest.Main;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.android.www.DrivingLicenseTest.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class About extends AppCompatActivity {

        InterstitialAd mInterstitialAd;
        private InterstitialAd interstitial;


    Button b;
    Button c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.android.www.DrivingLicenseTest.R.layout.activity_about);
        AdRequest adRequest = new AdRequest.Builder().build();


        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(About.this);
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

        b = (Button) findViewById(R.id.visit_website);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Use when user trigger on  visit website
                String url = "https://www.doubleasoft.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                Intent chooser = Intent.createChooser(intent, "Open with");
                startActivity(chooser);

            }
        });
        c = (Button) findViewById(R.id.visit_facebook);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Use when user trigger on  visit website
                String url = "https://www.facebook.com/doubleasoft17/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                Intent chooser = Intent.createChooser(intent, "Open with");
                startActivity(chooser);

            }
        });

    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
