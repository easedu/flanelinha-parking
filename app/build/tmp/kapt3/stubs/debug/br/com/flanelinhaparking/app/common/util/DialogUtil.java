package br.com.flanelinhaparking.app.common.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lbr/com/flanelinhaparking/app/common/util/DialogUtil;", "", "()V", "Companion", "app_debug"})
public final class DialogUtil {
    @org.jetbrains.annotations.NotNull()
    public static android.app.ProgressDialog dialog;
    public static final br.com.flanelinhaparking.app.common.util.DialogUtil.Companion Companion = null;
    
    public DialogUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011JC\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\r0\u0016J\u0016\u0010\u0019\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lbr/com/flanelinhaparking/app/common/util/DialogUtil$Companion;", "", "()V", "dialog", "Landroid/app/ProgressDialog;", "getDialog", "()Landroid/app/ProgressDialog;", "setDialog", "(Landroid/app/ProgressDialog;)V", "getLoading", "context", "Landroid/content/Context;", "showDeleteDialog", "", "car", "Lbr/com/flanelinhaparking/app/cars/model/Car;", "deleteAction", "Lkotlin/Function0;", "showInsertUpdateDialog", "buttonLabel", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "showMessageDialog", "message", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.ProgressDialog getDialog() {
            return null;
        }
        
        public final void setDialog(@org.jetbrains.annotations.NotNull()
        android.app.ProgressDialog p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.ProgressDialog getLoading(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void showMessageDialog(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void showDeleteDialog(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        br.com.flanelinhaparking.app.cars.model.Car car, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> deleteAction) {
        }
        
        public final void showInsertUpdateDialog(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        br.com.flanelinhaparking.app.cars.model.Car car, @org.jetbrains.annotations.NotNull()
        java.lang.String buttonLabel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super br.com.flanelinhaparking.app.cars.model.Car, kotlin.Unit> action) {
        }
        
        private Companion() {
            super();
        }
    }
}