package br.com.flanelinhaparking.app.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u0016H\u0016J\u0012\u0010.\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u0019H\u0016J\b\u00102\u001a\u00020\u0019H\u0016J\u0010\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u001cH\u0002J\b\u00105\u001a\u00020\u0019H\u0002J\b\u00106\u001a\u00020\u0019H\u0002J\b\u00107\u001a\u00020\u0019H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lbr/com/flanelinhaparking/app/map/MapsFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "addressText", "", "getAddressText", "()Ljava/lang/String;", "setAddressText", "(Ljava/lang/String;)V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "lastLocation", "Landroid/location/Location;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "locationUpdateState", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "mapAlreadyLoaded", "createLocationRequest", "", "getAddress", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMapReady", "googleMap", "onMarkerClick", "p0", "Lcom/google/android/gms/maps/model/Marker;", "onPause", "onResume", "placeMarkerOnMap", "location", "setUpMap", "shareAddressText", "startLocationUpdates", "Companion", "app_debug"})
public final class MapsFragment extends android.support.v4.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    private com.google.android.gms.maps.GoogleMap map;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private android.location.Location lastLocation;
    private com.google.android.gms.location.LocationCallback locationCallback;
    private com.google.android.gms.location.LocationRequest locationRequest;
    private boolean locationUpdateState;
    private boolean mapAlreadyLoaded;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addressText;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private static final int REQUEST_CHECK_SETTINGS = 2;
    public static final br.com.flanelinhaparking.app.map.MapsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressText() {
        return null;
    }
    
    public final void setAddressText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void shareAddressText() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
        return false;
    }
    
    private final void setUpMap() {
    }
    
    private final void placeMarkerOnMap(com.google.android.gms.maps.model.LatLng location) {
    }
    
    private final java.lang.String getAddress(com.google.android.gms.maps.model.LatLng latLng) {
        return null;
    }
    
    private final void startLocationUpdates() {
    }
    
    private final void createLocationRequest() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public MapsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lbr/com/flanelinhaparking/app/map/MapsFragment$Companion;", "", "()V", "LOCATION_PERMISSION_REQUEST_CODE", "", "REQUEST_CHECK_SETTINGS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}