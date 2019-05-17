package br.com.flanelinha.falanelinhaparking.common.ui.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils

class SplashActivity : AppCompatActivity() {

    private lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        preferences = getSharedPreferences(USER_PREFERENCES_KEY, Context.MODE_PRIVATE)
        val isFirstOpen = preferences.getBoolean("open_first", true)

        if(isFirstOpen) {
            markAppAlreadyOpen()
            load()
        } else {
            showLogin()
        }
    }

    private fun markAppAlreadyOpen() {
        val editor = preferences.edit()
        editor.putBoolean("open_first", false)
        editor.apply()
    }

    private fun load() {
        val animation = AnimationUtils.loadAnimation(this, R.anim.splash)
        animation.reset()
        ivLogo.startAnimation(animation)

        Handler().postDelayed({
            showLogin()
        }, 3200L)
    }

    private fun showLogin() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}