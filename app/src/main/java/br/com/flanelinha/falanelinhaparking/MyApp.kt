package br.com.flanelinha.falanelinhaparking

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }

}
