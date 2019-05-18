package br.com.flanelinha.falanelinhaparking.common.preferences

import android.content.Context
import android.content.SharedPreferences
import br.com.flanelinha.falanelinhaparking.common.constants.USER_PREFERENCES_KEY

class MyPreferences(context: Context) {

    val preferences: SharedPreferences = context.getSharedPreferences(USER_PREFERENCES_KEY, Context.MODE_PRIVATE)
}