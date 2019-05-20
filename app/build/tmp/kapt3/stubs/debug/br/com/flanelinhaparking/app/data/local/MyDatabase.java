package br.com.flanelinhaparking.app.data.local;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {br.com.flanelinhaparking.app.cars.model.Car.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lbr/com/flanelinhaparking/app/data/local/MyDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "carDao", "Lbr/com/flanelinhaparking/app/data/local/dao/CarDAO;", "Companion", "app_debug"})
public abstract class MyDatabase extends android.arch.persistence.room.RoomDatabase {
    private static volatile br.com.flanelinhaparking.app.data.local.MyDatabase instance;
    public static final br.com.flanelinhaparking.app.data.local.MyDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.flanelinhaparking.app.data.local.dao.CarDAO carDao();
    
    public MyDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lbr/com/flanelinhaparking/app/data/local/MyDatabase$Companion;", "", "()V", "instance", "Lbr/com/flanelinhaparking/app/data/local/MyDatabase;", "getInstance", "()Lbr/com/flanelinhaparking/app/data/local/MyDatabase;", "setInstance", "(Lbr/com/flanelinhaparking/app/data/local/MyDatabase;)V", "create", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private final br.com.flanelinhaparking.app.data.local.MyDatabase getInstance() {
            return null;
        }
        
        private final void setInstance(br.com.flanelinhaparking.app.data.local.MyDatabase p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final synchronized br.com.flanelinhaparking.app.data.local.MyDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final br.com.flanelinhaparking.app.data.local.MyDatabase create(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}