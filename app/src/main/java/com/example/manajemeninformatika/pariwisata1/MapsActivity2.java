package com.example.manajemeninformatika.pariwisata1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        mMap.addMarker(new MarkerOptions().position(new LatLng(-0.4226587,116.9958329)).title("Pulau kumala"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-0.3911683,116.9755608)).title("Ladaya"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-0.4133248,116.9904417)).title("Mulawarman"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-0.4059986,116.9713112)).title("Museum kayu"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-0.4123609,116.9903247)).title("Planetarium"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-0.4124534,116.9693563)).title("Waduk"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-0.4124253,116.9910464),25));
    }
}
