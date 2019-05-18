package br.com.flanelinha.falanelinhaparking.contact.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.flanelinha.falanelinhaparking.R

class ContactFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        makeCall()
    }

    fun makeCall(){
        btnMakeCall.setOnClickListener({
            val uri: String = "tel:" + tietPhoneNumber.text.toString().trim();
            val intent = Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(uri));
            startActivity(intent);
        })
    }
}
