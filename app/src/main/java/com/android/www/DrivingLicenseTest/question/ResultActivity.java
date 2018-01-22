package com.android.www.DrivingLicenseTest.question;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.www.DrivingLicenseTest.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class ResultActivity extends Activity {



    TextView correct, incorrect, attempted, marks;
    int cor = 0, incorr = 0, attempt = 20,  mark = 0;
    InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
       /* AdRequest adRequest = new AdRequest.Builder().build();


        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(ResultActivity.this);
// Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(com.android.www.DrivingLicenseTest.R.string.admob_interstitial_id));

        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
// Call displayInterstitial() function
                displayInterstitial();

            }
        });*/
        super.onCreate(savedInstanceState);
        setContentView(com.android.www.DrivingLicenseTest.R.layout.activity_result);
        AdView mAdView = (AdView) findViewById(com.android.www.DrivingLicenseTest.R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(ResultActivity.this);
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
/*

   TextView textResult = (TextView) findViewById(com.android.www.DrivingLicenseTest.R.id.textResult);
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");

        if (score < 10) {
            textResult.setText("तपाइको  कुल आंक \n" + "  " + " " + score + "/20 \n FAIL थप अभ्यास आवश्यक You Need Improvement");
        }
        else if (score < 15)
                textResult.setText("You are an average Quizzer");
        else
            textResult.setText("तपाइको  कुल आंक \n" + "\" +\"  \" + \" \" + score + \"/20 \\n Pass तपाई परीक्षा दिन सक्नुहुन्छ\"");
*/
        TextView textResult = (TextView) findViewById(com.android.www.DrivingLicenseTest.R.id.textResult);
        Intent intent = getIntent();
        cor = intent.getIntExtra("correct", 0);
        attempt = intent.getIntExtra("attemp", 20);

        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");

        incorr = 20 - score;
        mark = 5 * score;
        attempted = (TextView) findViewById(R.id.attempted);
        correct = (TextView) findViewById(R.id.correct);
        incorrect = (TextView) findViewById(R.id.incorrect);
        attempted = (TextView) findViewById(R.id.attempted);
        marks = (TextView) findViewById(R.id.marks);
        attempted.setText("  " + attempt);
        correct.setText("  " + score);
        incorrect.setText("  " + incorr);
       marks.setText("    " + mark);


        float x1 = score ;
        if (x1 < 10)
            textResult.setText("FAIL थप अभ्यास आवश्यक \n You Need Improvement");

        else if (x1 < 15)
            textResult.setText("Pass तपाई परीक्षा दिन सक्नुहुन्छ \n You are an above average.");
        else
            textResult.setText("Pass तपाई परीक्षा दिन सक्नुहुन्छ \n You are a brilliant  Quizzer. ");
      //  score = (TextView) findViewById(R.id.score);



/*
    public void playagain(View o) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/
/*
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }*/
    }
    public void displayInterstitial() {
// If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}



