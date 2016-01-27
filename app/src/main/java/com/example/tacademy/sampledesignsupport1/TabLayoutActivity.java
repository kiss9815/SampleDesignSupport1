package com.example.tacademy.sampledesignsupport1;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TabLayoutActivity extends AppCompatActivity {

    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        for(int i = 0; i<10; i++){
            tabLayout.addTab(tabLayout.newTab().setText("tab" + i)); // 탭 생성
        }
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                TabFragment f = TabFragment.newInstance(tab.getText().toString());
                getSupportFragmentManager().beginTransaction().replace(R.id.container, f).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        TabFragment f = TabFragment.newInstance("tab0");
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, f)
                .commit();
    }
}
