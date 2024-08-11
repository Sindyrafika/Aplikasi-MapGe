package com.example.geothermalversi20;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;

import com.example.geothermalversi20.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.w3c.dom.Text;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    DrawerLayout drawerLayout;
    TextView button;
    TextView button2;
    TextView button3;

    Button button4;
    Button button5;
    DrawerLayout rightdrawer;
    DrawerLayout listpotensidrawer;

    LinearLayout linearLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        drawerLayout = findViewById(R.id.drawer_layout);
        rightdrawer = findViewById(R.id.drawer_layout);
        linearLayout = findViewById(R.id.dashboardsemua);
        //listpotensidrawer = findViewById(R.id.drawer_layout2);


        button = findViewById(R.id.normalstyle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                MapsActivity.closeRightDrawer(drawerLayout);
            }
        });

        button2 = findViewById(R.id.satellitestyle);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                MapsActivity.closeRightDrawer(drawerLayout);
            }
        });

        button3 = findViewById(R.id.hybridstyle);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                MapsActivity.closeRightDrawer(rightdrawer);
            }
        });





    }

        public static void openRightDrawer (DrawerLayout rightdrawer){
            rightdrawer.openDrawer(Gravity.RIGHT);
        }

        public static void openListDrawer (DrawerLayout listpotensidrawer){
            listpotensidrawer.openDrawer(Gravity.RIGHT);
         }

        public static void closeDrawer (DrawerLayout drawerLayout){

            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        }

        public static void closeRightDrawer (DrawerLayout rightdrawer){

            if (rightdrawer.isDrawerOpen(Gravity.RIGHT)) {
                rightdrawer.closeDrawer(Gravity.RIGHT);
            }
        }

    public static void closeListDrawer (DrawerLayout listpotensidrawer) {

        if (listpotensidrawer.isDrawerOpen(GravityCompat.START)) {
            listpotensidrawer.closeDrawer(GravityCompat.START);
        }
    }

    public void popupbutton(View view) {
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View viewpopup = layoutInflater.inflate(R.layout.popup_windows, null);
        PopupWindow popupWindow = new PopupWindow(viewpopup, 1000, 1250, true);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
        closeRightDrawer(rightdrawer);
        viewpopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });
    }

    public void popupgeo01(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-6.90245, 106.48181), 11));
    }

    public void popupgeo02(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(5.80511, 95.32593), 11));
    }

    public void popupgeo03(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-6.75963, 107.60978), 11));
    }

    public void popupgeo04(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-0.72576, 127.65519), 11));
    }

    public void popupgeo05(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-8.43495, 123.46782), 11));
    }

    public void popupgeo06(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-6.76472, 107.96), 11));
    }

    public void popupgeo07(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-4.38951, 122.58426), 11));
    }

    public void popupgeo08(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(0.50959, 123.13796), 11));
    }

    public void popupgeo09(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(0.61713, 123.00839), 11));
    }

    public void popupgeo11(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.26666, 108.07166), 11));
    }

    public void popupgeo12(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.81395, 111.76), 11));
    }

    public void popupgeo13(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.32846, 109.22875), 11));
    }

    public void popupgeo14(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.41233, 97.38407), 11));
    }

    public void popupgeo15(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(2.07438, 98.94231), 11));
    }

    public void popupgeo16(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(2.58669, 117.57306), 11));
    }

    public void popupgeo17(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-1.05452, 119.94514), 11));
    }

    public void popupgeo18(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-2.97676, 119.67254), 11));
    }

    public void popupgeo19(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(1.06176, 127.46798), 11));
    }

    public void popupgeo20(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-3.22052, 129.0867), 11));
    }

    public void popupgeo21(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-8.67535, 121.3084), 11));
    }

    public void popupgeo22(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-8.36598, 116.53615), 11));
    }

    public void popupgeo23(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-8.24012, 115.37749), 11));
    }

    public void popupgeo24(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-6.89333, 108.40666), 11));
    }

    public void popupgeo25(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.31932, 107.73104), 11));
    }

    public void popupgeo26(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(6.62027, 106.36222), 11));
    }

    public void popupgeo27(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-0.56713, 119.80629), 11));
    }

    public void popupgeo28(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(0.72437, 124.31993), 11));
    }

    public void popupgeo29(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-2.56359, 119.9681), 11));
    }

    public void popupgeo30(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-8.30184, 125.11587), 11));
    }

    public void popupgeo31(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-8.30184, 125.11587), 11));
    }

    public void popupgeo32(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-1.19533, 120.12284), 11));
    }

    public void popupgeo33(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-3.18918, 119.1972), 11));
    }

    public void popupgeo34(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.91666, 112.45), 11));
    }

    public void popupgeo35(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.18944, 109.85222), 11));
    }

    public void popupgeo36(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.24144, 109.75011), 11));
    }

    public void popupgeo37(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-1.72916, 101.18138), 11));
    }

    public void popupgeo38(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-1.84961, 101.20138), 11));
    }

    public void popupgeo39(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(5.4475, 95.65527), 11));
    }

    public void popupgeo40(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.17241, 107.37666), 11));
    }

    public void popupgeo41(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-6.78777, 106.98194), 11));
    }

    public void popupgeo42(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-6.70361, 107.64283), 11));
    }

    public void popupgeo43(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-3.59122, 128.30603), 11));
    }

    public void popupgeo44(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-5.05263, 104.30877), 11));
    }

    public void popupgeo45(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-7.45222, 111.78611), 11));
    }

    public void popupgeo46(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.99039, 97.11546), 11));
    }

    public void popupgeo47(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-3.613, 102.66755), 11));
    }

    public void popupgeo48(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-4.85102, 103.9376), 11));
    }

    public void popupgeo49(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-4.13311, 103.03774), 11));
    }

    public void popupgeo50(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(1.63333, 127.81666), 11));
    }

    public void popupgeo51(View view){
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-1.21361, 100.38722), 11));
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
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);


        LatLng pltp01 = new LatLng(-34, 151);
        Marker marker01 = mMap.addMarker(new MarkerOptions().position(pltp01));













        Intent i = getIntent();
        LatLng ll = i.getParcelableExtra("longLat_dataProvider");

        if (i != null && ll != null)
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(ll.latitude, ll.longitude), 11));

            LatLng defaultLoc = new LatLng(ll.latitude, ll.longitude);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(defaultLoc));
        }



        Circle circle01 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-6.90245, 106.48181))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle02 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(5.80511, 95.32593))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle03 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-6.75963, 107.60978))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle04 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-0.72576, 127.65519))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle05 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-8.43495, 123.46782))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle06 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-6.76472, 107.96))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle07 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-4.38951, 122.58426))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle08 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(0.50959, 123.13796))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle09 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(0.61713, 123.00839))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle10 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.21955, 109.17016))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle11 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.26666, 108.07166))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle12 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.81395, 111.76))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle13 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.32846, 109.22875))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle14 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(4.41233, 97.38407))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle15 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(2.07438, 98.94231))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle16 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(2.58669, 117.57306))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle17 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-1.05452, 119.94514))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle18 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-2.97676, 119.67254))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle19 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(1.06176, 127.46798))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle20 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-3.22052, 129.0867))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle21 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-8.67535, 121.3084))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle22 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-8.36598, 116.53615))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle23 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-8.24012, 115.37749))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle24 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-6.89333, 108.40666))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle25 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.31932, 107.73104))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle26 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(6.62027, 106.36222))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle27 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-0.56713, 119.80629))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle28 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(0.72437, 124.31993))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle29 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-2.56359, 119.9681))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle30 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-8.30184, 125.11587))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle31 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-8.5199, 124.10594))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle32 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-1.19533, 120.12284))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle33 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-3.18918, 119.1972))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle34 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.91666, 112.45))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle35 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.18944, 109.85222))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle36 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.24144, 109.75011))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle37 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-1.72916, 101.18138))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle38 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-1.84961, 101.20138))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle39 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(5.4475, 95.65527))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle40 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.17241, 107.37666))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle41 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-6.78777, 106.98194))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle42 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-6.70361, 107.64283))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle43 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-3.59122, 128.30603))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle44 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-5.05263, 104.30877))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle45 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-7.45222, 111.78611))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle46 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(4.99039, 97.11546))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle47 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-3.613, 102.66755))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle48 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-4.85102, 103.9376))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle49 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-4.13311, 103.03774))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle50 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(1.63333, 127.81666))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

        Circle circle51 = mMap.addCircle(new CircleOptions()
                .center(new LatLng(-1.21361, 100.38722))
                .radius(7000)
                .strokeColor(Color.parseColor("#5FE53333"))
                .fillColor(Color.parseColor("#5FE53333"))
        );

    }

    public void ClickMenu(View view){
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickRightMenu(View view){
        //Buka Drawer
        openRightDrawer(rightdrawer);
    }

    public void ClickListPotensi(View view){
        //Buka Drawer
        openListDrawer(listpotensidrawer);
    }

    public void ClickLogo(View view){
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickMaps(View view) {
        recreate();
    }

    public void ClickHome(View view){
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickDashboard(View view){
        MainActivity.redirectActivity(this, Dashboard.class);
    }

    public void ClickAboutUs(View view){
        MainActivity.redirectActivity(this, AboutUs.class);
    }

    public void ClickSetting(View view) {
        MainActivity.redirectActivity(this, Settings.class);
    }

    public void ClickLogOut(View view){
        MainActivity.logout(this);
    }

    public void expedisistyle(View view){
        MainActivity.redirectActivity(this, MapsActivity2.class);;
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
        closeRightDrawer(rightdrawer);
    }

    /* public void ListPotensi(View view){
        TextView txtclose;
        listpotensi = findViewById(R.id.listpotensi);
        txtclose = findViewById(R.id.close);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    } */


}