package br.com.flanelinha.falanelinhaparking.login.ui.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.view.View
import br.com.flanelinha.falanelinhaparking.R
import br.com.flanelinha.falanelinhaparking.common.ui.activities.MainActivity
import br.com.flanelinha.falanelinhaparking.login.data.model.UserAuthModel
import br.com.flanelinha.falanelinhaparking.login.ui.viewmodel.LoginViewModel
import br.com.flanelinha.falanelinhaparking.registration.ui.activities.SignUpActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sign_up_alert.text = SpannableString("Não tem uma conta? Cadastre-se").toString()
        sign_up_alert.setOnClickListener(View.OnClickListener {
            showSignUpScreen()
        })

        loginViewModel = LoginViewModel(this)

        authenticate()
    }

    fun authenticate(){
        if(loginViewModel.isLoggedUser()){
            showMainScreen()
        } else{
            btnLogin.setOnClickListener({
                signInWithEmailAndPassword()
            })
        }

    }

    fun signInWithEmailAndPassword(){
        loginViewModel.signInWithEmailAndPassword(
            UserAuthModel(tietPassword.text.toString(), tietUser.text.toString()),
            {
                showMainScreen()
            }
        )
    }

    private fun showMainScreen() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    private fun showSignUpScreen() {
        startActivity(Intent(this, SignUpActivity::class.java))
    }

}
