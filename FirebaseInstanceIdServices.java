package com.example.admin.newdemo.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIdServices extends FirebaseInstanceIdService {
    public static final String TAG="NOTICIA";
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token= FirebaseInstanceId.getInstance().getToken();
        Log.d("token==","Notify"+token);
    }
}
