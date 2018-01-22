package com.android.www.DrivingLicenseTest.Service;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import com.android.www.DrivingLicenseTest.Config;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by ashokumarshrestha on 1/11/18.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        handelMessage(remoteMessage.getData().get(Config.STR_KEY));
    }

    private void handelMessage(String message) {
        Intent pushNotification = new Intent(Config.STR_PUSH);
        pushNotification.putExtra(Config.STR_MESSAGE,message);
        LocalBroadcastManager.getInstance(this).sendBroadcast(pushNotification);



    }
}
