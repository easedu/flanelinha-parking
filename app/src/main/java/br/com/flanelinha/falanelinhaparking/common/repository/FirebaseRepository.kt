package br.com.flanelinha.falanelinhaparking.common.repository

import br.com.flanelinha.falanelinhaparking.login.data.model.UserAuthModel
import br.com.flanelinha.falanelinhaparking.login.data.model.UserModel

class FirebaseRepository {

    private val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    private val firebaseDatabase: FirebaseDatabase = FirebaseDatabase.getInstance()

    fun sigInWithEmailAndPassword(userAuth: UserAuthModel): Task<AuthResult> {
        return firebaseAuth.signInWithEmailAndPassword(userAuth.email, userAuth.password)
    }

    fun getCurrentUser(): FirebaseUser?{
        return firebaseAuth.currentUser
    }

    fun createUserWithEmailAndPassword(userAuth: UserAuthModel): Task<AuthResult>{
        return firebaseAuth.createUserWithEmailAndPassword(userAuth.email, userAuth.password)
    }

    fun saveAtRealTimeDatabase(user: UserModel): Task<Void>{
        return firebaseDatabase.getReference(REAL_TIME_DATABASE_USERS)
            .child(FirebaseAuth.getInstance().currentUser!!.uid)
            .setValue(user)
    }
}