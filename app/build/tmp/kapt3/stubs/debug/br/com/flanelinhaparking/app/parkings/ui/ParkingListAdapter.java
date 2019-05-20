package br.com.flanelinhaparking.app.parkings.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\nH\u0016J\u001c\u0010\u0012\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lbr/com/flanelinhaparking/app/parkings/ui/ParkingListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lbr/com/flanelinhaparking/app/parkings/ui/ParkingListAdapter$ParkingViewHolder;", "context", "Landroid/content/Context;", "parkings", "", "Lbr/com/flanelinhaparking/app/parkings/model/Parking;", "onDeleteListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "adapterPosition", "", "onUpdateListener", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ParkingViewHolder", "app_debug"})
public final class ParkingListAdapter extends android.support.v7.widget.RecyclerView.Adapter<br.com.flanelinhaparking.app.parkings.ui.ParkingListAdapter.ParkingViewHolder> {
    private final android.content.Context context = null;
    private final java.util.List<br.com.flanelinhaparking.app.parkings.model.Parking> parkings = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onDeleteListener = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onUpdateListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.flanelinhaparking.app.parkings.ui.ParkingListAdapter.ParkingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    br.com.flanelinhaparking.app.parkings.ui.ParkingListAdapter.ParkingViewHolder holder, int position) {
    }
    
    public ParkingListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.List<br.com.flanelinhaparking.app.parkings.model.Parking> parkings, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDeleteListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onUpdateListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"Lbr/com/flanelinhaparking/app/parkings/ui/ParkingListAdapter$ParkingViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lbr/com/flanelinhaparking/app/parkings/ui/ParkingListAdapter;Landroid/view/View;)V", "bindView", "", "parking", "Lbr/com/flanelinhaparking/app/parkings/model/Parking;", "app_debug"})
    public final class ParkingViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void bindView(@org.jetbrains.annotations.Nullable()
        br.com.flanelinhaparking.app.parkings.model.Parking parking) {
        }
        
        public ParkingViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}