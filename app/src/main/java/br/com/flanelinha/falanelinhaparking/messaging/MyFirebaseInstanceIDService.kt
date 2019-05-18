package br.com.flanelinha.falanelinhaparking.messaging

import android.util.Log

const val TAG = "Flanelinha Notification"

class MyFirebaseInstanceIDService : FirebaseInstanceIdService(){

    override fun onTokenRefresh() {
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d(TAG, "Token: " + refreshedToken!!)
    }

}