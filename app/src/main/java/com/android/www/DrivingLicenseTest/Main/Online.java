package com.android.www.DrivingLicenseTest.Main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.www.DrivingLicenseTest.R;
import com.android.www.DrivingLicenseTest.online.Faq;
import com.android.www.DrivingLicenseTest.online.Registration;
import com.android.www.DrivingLicenseTest.online.Status;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Online extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        AdView mAdView = (AdView) findViewById(com.android.www.DrivingLicenseTest.R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void b11(View view) {
        startActivity(new Intent(this, Status.class));
    }

    public void b12(View view) {
        startActivity(new Intent(this, Registration.class));
    }
}