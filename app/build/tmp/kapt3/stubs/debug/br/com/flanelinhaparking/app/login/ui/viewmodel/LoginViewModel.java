package br.com.flanelinhaparking.app.login.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lbr/com/flanelinhaparking/app/login/ui/viewmodel/LoginViewModel;", "Landroid/arch/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "firebaseRepository", "Lbr/com/flanelinhaparking/app/common/repository/FirebaseRepository;", "loading", "Landroid/app/ProgressDialog;", "createUserWithEmailAndPassword", "", "userAuth", "Lbr/com/flanelinhaparking/app/login/data/model/UserAuthModel;", "user", "Lbr/com/flanelinhaparking/app/login/data/model/UserModel;", "isLoggedUser", "", "showMessageDialog", "message", "", "signInWithEmailAndPassword", "callback", "Lkotlin/Function0;", "app_debug"})
public final class LoginViewModel extends android.arch.lifecycle.ViewModel {
    private final br.com.flanelinhaparking.app.common.repository.FirebaseRepository firebaseRepository = null;
    private android.app.ProgressDialog loading;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final boolean isLoggedUser() {
        return false;
    }
    
    public final void signInWithEmailAndPassword(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.login.data.model.UserAuthModel userAuth, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public final void createUserWithEmailAndPassword(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.login.data.model.UserAuthModel userAuth, @org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.login.data.model.UserModel user) {
    }
    
    private final void showMessageDialog(java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}