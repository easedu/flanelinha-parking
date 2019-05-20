package br.com.flanelinhaparking.app.data.local.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\nJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/flanelinhaparking/app/data/local/util/DbUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "carDao", "Lbr/com/flanelinhaparking/app/data/local/dao/CarDAO;", "database", "Lbr/com/flanelinhaparking/app/data/local/MyDatabase;", "deleteCar", "Lio/reactivex/Observable;", "", "car", "Lbr/com/flanelinhaparking/app/cars/model/Car;", "insertCar", "loadCars", "", "updateCar", "app_debug"})
public final class DbUtil {
    private final br.com.flanelinhaparking.app.data.local.MyDatabase database = null;
    private final br.com.flanelinhaparking.app.data.local.dao.CarDAO carDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> insertCar(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.cars.model.Car car) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> deleteCar(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.cars.model.Car car) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> updateCar(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.cars.model.Car car) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<br.com.flanelinhaparking.app.cars.model.Car>> loadCars() {
        return null;
    }
    
    public DbUtil(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}