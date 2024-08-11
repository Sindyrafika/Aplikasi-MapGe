package com.example.geothermalversi20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class Settings extends AppCompatActivity {
    DrawerLayout drawerLayout;
    DrawerLayout rightdrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        drawerLayout = findViewById(R.id.drawer_layout);
        rightdrawer = findViewById(R.id.drawer_layout);

    }

    public static void openRightDrawer(DrawerLayout rightdrawer) {
        rightdrawer.openDrawer(Gravity.RIGHT);
    }

    public static void closeRightDrawer(DrawerLayout rightdrawer) {

        if (rightdrawer.isDrawerOpen(Gravity.RIGHT)) {
            rightdrawer.closeDrawer(Gravity.RIGHT);
        }
    }

    public void ClickLogo(View view){
        MainActivity.closeDrawer(drawerLayout);
    }


    public void ClickMenu(View view){
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickRightMenu(View view){
        //Buka Drawer
        openRightDrawer(rightdrawer);
    }

    public void ClickHome(View view){
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickMaps(View view) {
        MainActivity.redirectActivity(this, MapsActivity.class);
    }

    public void ClickDashboard(View view){
        recreate();
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

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
        closeRightDrawer(rightdrawer);
    }

}