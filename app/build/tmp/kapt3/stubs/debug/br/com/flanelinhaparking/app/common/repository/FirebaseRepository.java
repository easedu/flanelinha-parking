package br.com.flanelinhaparking.app.common.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lbr/com/flanelinhaparking/app/common/repository/FirebaseRepository;", "", "()V", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "createUserWithEmailAndPassword", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/auth/AuthResult;", "userAuth", "Lbr/com/flanelinhaparking/app/login/data/model/UserAuthModel;", "getCurrentUser", "Lcom/google/firebase/auth/FirebaseUser;", "saveAtRealTimeDatabase", "Ljava/lang/Void;", "user", "Lbr/com/flanelinhaparking/app/login/data/model/UserModel;", "sigInWithEmailAndPassword", "app_debug"})
public final class FirebaseRepository {
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    private final com.google.firebase.database.FirebaseDatabase firebaseDatabase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> sigInWithEmailAndPassword(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.login.data.model.UserAuthModel userAuth) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.auth.FirebaseUser getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> createUserWithEmailAndPassword(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.login.data.model.UserAuthModel userAuth) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<java.lang.Void> saveAtRealTimeDatabase(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.login.data.model.UserModel user) {
        return null;
    }
    
    public FirebaseRepository() {
        super();
    }
}