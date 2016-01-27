package com.example.tacademy.sampledesignsupport1;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TabPagerActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_pager);

        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.pager);
        mAdapter = new MyPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(mAdapter);

        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.setTabsFromPagerAdapter(mAdapter); // 안해도 된다고 함 ,,,

        // 탭 spec을 커스터마이징 하는 법
        tabLayout.removeAllTabs();

        for (int i = 0 ; i < 10; i++) {
            tabLayout.addTab(tabLayout.newTab().setText("TTT" + i));    // 탭 spec을 커스터마이징 하는 법
        }
    }
}
