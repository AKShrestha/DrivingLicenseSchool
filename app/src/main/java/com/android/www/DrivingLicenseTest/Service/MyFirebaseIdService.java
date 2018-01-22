package com.android.www.DrivingLicenseTest.Service;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by ashokumarshrestha on 1/11/18.
 */

public class  MyFirebaseIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        sendToService(token);
    }

    private void sendToService(String token) {
    }
}
