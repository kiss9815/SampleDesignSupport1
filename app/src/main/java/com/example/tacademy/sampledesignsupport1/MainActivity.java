package com.example.tacademy.sampledesignsupport1;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = (NavigationView)findViewById(R.id.navigation);
        View view = navigationView.getHeaderView(0);
        TextView textView = (TextView)view.findViewById(R.id.text_title);
        textView.setText("My Menu");

        navigationView.setNavigationItemSelectedListener(this);
        Button btn = (Button)findViewById(R.id.btn_show_menu);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left);
                navigationView.setVisibility(View.VISIBLE);
                navigationView.startAnimation(animation);
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_1:
            case R.id.menu_2:
            case R.id.menu_3:
                item.setChecked(true);
                break;
            case R.id.menu_tablayout:
                startActivity(new Intent(this, TabLayoutActivity.class));
                break;
             }

            Toast.makeText(this, "Menu Item Selected : " + item.getTitle(), Toast.LENGTH_SHORT).show();
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_out_right);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                navigationView.setVisibility(View.GONE); //애니메이션 끝나면 없어지도록

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        navigationView.startAnimation(animation);
        return true;
    }


}
