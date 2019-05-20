package br.com.flanelinhaparking.app

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

const val TAG = "Flanelinha Notification"

class MyFirebaseInstanceIDService : FirebaseInstanceIdService(){

    override fun onTokenRefresh() {
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d(TAG, "Token: " + refreshedToken!!)
    }

}