package com.example.dpatas;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.example.dpatas.fragments.ProfileFragment;

public class Home extends AppCompatActivity {

    BottomNavigationView menuHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        menuHome = (BottomNavigationView) findViewById(R.id.homeBNV_Menu);
        menuHome.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.menu_Home){

                }if (menuItem.getItemId() == R.id.menu_Pet){

                }if (menuItem.getItemId() == R.id.menu_Vet){

                }if (menuItem.getItemId() == R.id.menu_Profile){
                    showSelectedFragment(new ProfileFragment());
                }
                return true;
            }
        });
    }


    private void showSelectedFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
}