package br.com.flanelinhaparking.app

import com.facebook.stetho.Stetho
import android.app.Application


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }

}