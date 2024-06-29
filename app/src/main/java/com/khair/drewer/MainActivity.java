package com.khair.drewer;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    FrameLayout frameLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawerlayout);
        materialToolbar=findViewById(R.id.Toolbar);
        frameLayout=findViewById(R.id.FrameLayout);
        navigationView=findViewById(R.id.NavigationView);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(
                MainActivity.this,drawerLayout,materialToolbar,R.string.CloseDrawer,R.string.openDrawer);
        drawerLayout.addDrawerListener(toggle);



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.home){
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();

                } else if (item.getItemId()==R.id.profile) {
                    Toast.makeText(MainActivity.this, "profile", Toast.LENGTH_SHORT).show();

                } else if (item.getItemId()==R.id.share) {
                    Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();

                } else if (item.getItemId()==R.id.Notification) {
                    Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();

                } else if (item.getItemId()==R.id.Setting) {
                    Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();

                }


                return true;
            }
        });





    }
}