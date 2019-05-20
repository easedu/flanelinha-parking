package br.com.flanelinhaparking.app.parkings.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\t\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lbr/com/flanelinhaparking/app/parkings/ui/viewmodel/ParkingViewModel;", "Landroid/arch/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "dbUtil", "Lbr/com/flanelinhaparking/app/data/local/util/DbUtil;", "dispose", "Lio/reactivex/disposables/Disposable;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "parkings", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lbr/com/flanelinhaparking/app/parkings/model/Parking;", "getParkings", "()Landroid/arch/lifecycle/MutableLiveData;", "setParkings", "(Landroid/arch/lifecycle/MutableLiveData;)V", "deleteParking", "", "parking", "insertParkings", "loadParkings", "updateParking", "app_debug"})
public final class ParkingViewModel extends android.arch.lifecycle.ViewModel {
    private final br.com.flanelinhaparking.app.data.local.util.DbUtil dbUtil = null;
    private final java.util.concurrent.ExecutorService executor = null;
    private io.reactivex.disposables.Disposable dispose;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.util.List<br.com.flanelinhaparking.app.parkings.model.Parking>> parkings;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<br.com.flanelinhaparking.app.parkings.model.Parking>> getParkings() {
        return null;
    }
    
    public final void setParkings(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.util.List<br.com.flanelinhaparking.app.parkings.model.Parking>> p0) {
    }
    
    public final void loadParkings() {
    }
    
    public final void insertParkings(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.parkings.model.Parking parking) {
    }
    
    public final void updateParking(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.parkings.model.Parking parking) {
    }
    
    public final void deleteParking(@org.jetbrains.annotations.Nullable()
    br.com.flanelinhaparking.app.parkings.model.Parking parking) {
    }
    
    public final void dispose() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public ParkingViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}