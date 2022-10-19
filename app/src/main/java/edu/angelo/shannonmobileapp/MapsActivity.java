package edu.angelo.shannonmobileapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.MapStyleOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used..
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
        LatLng sanAngelo = new LatLng(31.4438, -100.4570);
        LatLng urgCareWest = new LatLng(31.432821559604545, -100.50079488336165);
        mMap.addMarker(new MarkerOptions().position(urgCareWest).title("Shannon Urgent Care West"));
        LatLng urgCareSouth = new LatLng(31.420223796797778, -100.4706743586537);
        mMap.addMarker(new MarkerOptions().position(urgCareSouth).title("Shannon Urgent Care South"));
        LatLng urgCareNorth = new LatLng(31.483659042183, -100.4592737671183);
        mMap.addMarker(new MarkerOptions().position(urgCareNorth).title("Shannon Urgent Care North"));
        LatLng urgCareJackson = new LatLng(31.43668294128335, -100.45717348558979);
        mMap.addMarker(new MarkerOptions().position(urgCareJackson).title("Shannon Clinic Jackson"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sanAngelo, 12));
    }
}
