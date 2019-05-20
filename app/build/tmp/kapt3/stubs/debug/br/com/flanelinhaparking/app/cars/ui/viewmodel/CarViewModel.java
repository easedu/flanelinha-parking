package br.com.flanelinhaparking.app.cars.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0011\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\u0017J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lbr/com/flanelinhaparking/app/cars/ui/viewmodel/CarViewModel;", "Landroid/arch/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cars", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lbr/com/flanelinhaparking/app/cars/model/Car;", "getCars", "()Landroid/arch/lifecycle/MutableLiveData;", "setCars", "(Landroid/arch/lifecycle/MutableLiveData;)V", "getContext", "()Landroid/content/Context;", "dbUtil", "Lbr/com/flanelinhaparking/app/data/local/util/DbUtil;", "dispose", "Lio/reactivex/disposables/Disposable;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "deleteCar", "", "car", "insertCar", "loadCars", "setLoading", "value", "", "updateCar", "app_debug"})
public final class CarViewModel extends android.arch.lifecycle.ViewModel {
    private final br.com.flanelinhaparking.app.data.local.util.DbUtil dbUtil = null;
    private final java.util.concurrent.ExecutorService executor = null;
    private io.reactivex.disposables.Disposable dispose;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.util.List<br.com.flanelinhaparking.app.cars.model.Car>> cars;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<br.com.flanelinhaparking.app.cars.model.Car>> getCars() {
        return null;
    }
    
    public final void setCars(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.util.List<br.com.flanelinhaparking.app.cars.model.Car>> p0) {
    }
    
    public final void loadCars() {
    }
    
    public final void insertCar(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.cars.model.Car car) {
    }
    
    public final void updateCar(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.cars.model.Car car) {
    }
    
    public final void deleteCar(@org.jetbrains.annotations.Nullable()
    br.com.flanelinhaparking.app.cars.model.Car car) {
    }
    
    private final void setLoading(boolean value) {
    }
    
    public final void dispose() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public CarViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}