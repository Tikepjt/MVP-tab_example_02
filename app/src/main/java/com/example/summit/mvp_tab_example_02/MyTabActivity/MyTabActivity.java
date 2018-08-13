package com.example.summit.mvp_tab_example_02.MyTabActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.summit.mvp_tab_example_02.R;
import com.example.summit.mvp_tab_example_02.databinding.ActivityMyTabBinding;

import java.util.ArrayList;

public class MyTabActivity extends AppCompatActivity implements MyTabContractor.View {

    ActivityMyTabBinding mBinding;
    MyTabPresenter mPresenter;
    MyReCyclerViewAdapter mAdapter;
    ArrayList<RequestItem> mArrFriendsRequestItem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_tab);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_my_tab);





        mBinding.tabRequestLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        mBinding.tabFriendsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });


        viewPager = findViewById(R.id.friends_view_pager);
        adapter = new MyAdapter(getFileStreamPath());
        viewPager.setAdapter(new MyAdapter(getFragmentManager()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                switch (position) {
                    case 0:
                        mBinding.effectRequestView.setBackgroundColor(0xffffffff);
                        mBinding.effectFriendsView.setBackgroundColor(0x00000000);
                        break;
                    case 1:
                        mBinding.effectRequestView.setBackgroundColor(0x00000000);
                        mBinding.effectFriendsView.setBackgroundColor(0xffffffff);
                        break;
                }

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        setDefaultTab();

    }



    MyAdapter adapter;

    ViewPager viewPager;


    private void setDefaultTab(){
        viewPager.setCurrentItem(0);
        mBinding.effectRequestView.setBackgroundColor(0xffffffff);
        mBinding.effectFriendsView.setBackgroundColor(0x00000000);
    }




    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new RequestFragment();
                    break;
                case 1:
                    fragment = new FriendsFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
