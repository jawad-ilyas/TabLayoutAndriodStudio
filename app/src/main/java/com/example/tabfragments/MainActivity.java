package com.example.tabfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {



    TabLayout tabLayoutMain;
    ViewPager viewPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  this funciton is used for the call the all the ids and make the hooks
        init();

        ViewpageMessengeAdaptor adaptor  = new ViewpageMessengeAdaptor(getSupportFragmentManager());
        viewPage.setAdapter(adaptor);
        tabLayoutMain.setupWithViewPager(viewPage);

    }


    void init(){
        tabLayoutMain = findViewById(R.id.tabLayoutMain);
        viewPage = findViewById(R.id.viewPage);
    }
}