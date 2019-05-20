package br.com.flanelinhaparking.app.common.extensions

import android.support.v4.app.Fragment
import br.com.flanelinhaparking.app.R

fun Fragment.openFragment(fragment: Fragment) {
    val transaction = fragment.fragmentManager!!.beginTransaction()
    transaction.replace(R.id.container, fragment)
    transaction.addToBackStack(null)
    transaction.commit()
}