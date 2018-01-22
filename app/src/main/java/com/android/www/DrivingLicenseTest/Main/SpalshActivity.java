package com.android.www.DrivingLicenseTest.Main;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;



import android.app.Activity;
import android.content.Intent;

import android.view.WindowManager;
import android.widget.VideoView;

import com.android.www.DrivingLicenseTest.R;



public class SpalshActivity extends Activity {

/*




    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


      super.onCreate(savedInstanceState);
        setContentView(com.android.www.DrivingLicenseTest.R.layout.activity_spalsh);
        new Handler().postDelayed(new Runnable() {

*/
/*
* Showing activity_spalsh screen with a timer. This will be useful when you
* want to show case your app logo / company
*//*


            @Override
            public void run() {
                Intent i = new Intent(SpalshActivity.this, MainActivity.class);
                startActivity(i);
                finish();


            }
        }, SPLASH_TIME_OUT);


    }


    }

*/

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_spalsh);


        videoView = (VideoView) findViewById(R.id.videoView);

        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);

        videoView.setVideoURI(video);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                if (isFinishing())
                    return;

                startActivity(new Intent(SpalshActivity.this, MainActivity.class));
                finish();
            }
        });

        videoView.start();
    }
}

