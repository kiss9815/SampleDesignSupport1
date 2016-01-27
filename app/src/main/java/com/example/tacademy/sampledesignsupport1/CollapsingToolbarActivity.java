package com.example.tacademy.sampledesignsupport1;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class CollapsingToolbarActivity extends AppCompatActivity {

    RecyclerView rvList;
    MyAdapter mAdapter;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Title");

        rvList = (RecyclerView)findViewById(R.id.recycler);
        mAdapter = new MyAdapter();
        rvList.setAdapter(mAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvList.setLayoutManager(layoutManager);

        initData();
    }

    private void initData() {
        for (int i = 0 ; i < 40; i++) {
            mAdapter.add("item " + i);
        }
    }

}
