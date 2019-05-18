package br.com.flanelinha.falanelinhaparking.registration.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.flanelinha.falanelinhaparking.R
import br.com.flanelinha.falanelinhaparking.login.data.model.UserAuthModel
import br.com.flanelinha.falanelinhaparking.login.data.model.UserModel
import br.com.flanelinha.falanelinhaparking.login.ui.viewmodel.LoginViewModel

class SignUpActivity : AppCompatActivity() {

    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        loginViewModel = LoginViewModel(this)

        btnRegister.setOnClickListener({
            createUserWithEmailAndPassword()
        })

    }

    fun createUserWithEmailAndPassword(){
        loginViewModel.createUserWithEmailAndPassword(
            UserAuthModel(tietPasswordSignUp.text.toString(), tietUserSignUp.text.toString()),
            UserModel(tietNameSignUp.text.toString(), tietUserSignUp.text.toString())
        )
    }



}
