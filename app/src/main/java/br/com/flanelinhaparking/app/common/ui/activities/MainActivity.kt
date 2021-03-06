package br.com.flanelinhaparking.app.common.ui.activities

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import br.com.flanelinhaparking.app.R
import br.com.flanelinhaparking.app.about.AboutFragment
import br.com.flanelinhaparking.app.parkings.ui.fragments.ParkingListFragment
import br.com.flanelinhaparking.app.contact.ui.ContactFragment
import br.com.flanelinhaparking.app.map.MapsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fragments = listOf(
            MapsFragment(),
            AboutFragment(),
            ParkingListFragment(),
            ContactFragment()
    )

    lateinit var transaction: FragmentTransaction

    var displayedFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragment(fragments[0])

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_map -> {
                replaceFragment(fragments[0])
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_about -> {
                replaceFragment(fragments[1])
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_car_list -> {
                replaceFragment(fragments[2])
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_contact -> {
                replaceFragment(fragments[3])
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun initFragment(fragment: Fragment) {
        transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        displayedFragment = fragment
    }

    private fun replaceFragment(fragment: Fragment) {
        if(displayedFragment != fragment) {
            initFragment(fragment)
        }
    }
}
