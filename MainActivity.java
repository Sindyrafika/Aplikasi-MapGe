package com.example.geothermalversi20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    DrawerLayout rightdrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        rightdrawer = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view){
        //Buka Drawer
        openDrawer(drawerLayout);
    }
    public void ClickRightMenu(View view){
        //Buka Drawer
        openRightDrawer(rightdrawer);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void openRightDrawer(DrawerLayout rightdrawer) {
        rightdrawer.openDrawer(Gravity.RIGHT);
    }

    public void ClickLogo(View view){
        //Tutup Drawer
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public static void closeRightDrawer(DrawerLayout rightdrawer) {

        if(rightdrawer.isDrawerOpen(Gravity.RIGHT)){
            rightdrawer.closeDrawer(Gravity.RIGHT);
        }
    }

    public void ClickHome(View view){
        //recreate Activity
        recreate();
    }

    public void ClickDashboard(View view){
        //Redirect antovoty to dashboard
        redirectActivity(this, Dashboard.class );
    }

    public void ClickAboutUs(View view){
        redirectActivity(this, AboutUs.class);
    }

    public void ClickMaps(View view) {
        redirectActivity(this, MapsActivity.class);
    }

    public void ClickSetting(View view) {
        redirectActivity(this, Settings.class);
    }

    public void ClickLogOut(View view){
        logout(this);
    }

    public void startmap(View view) { redirectActivity(this, MapsActivity.class);}



    public static void logout(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("LogOut");
        builder.setMessage("Are You Sure Want To LogOut ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                //finish activity
                activity.finishAffinity();
                //exit
                System.exit(0);

            }
        });

        //Negative Button
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //dismiss dialog
                dialog.dismiss();
            }
        });
        //show dialog
        builder.show();

    }

    public static void redirectActivity(Activity activity,Class aClass) {
        //initialize intent
        Intent intent = new Intent(activity, aClass);
        //set flag
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //start activity
        activity.startActivity(intent);

    }

    @Override
    protected void onPause() {
        super.onPause();
        //close drawer
        closeDrawer(drawerLayout);
        closeRightDrawer(rightdrawer);
    }

}