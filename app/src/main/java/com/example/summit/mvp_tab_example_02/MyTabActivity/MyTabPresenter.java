package com.example.summit.mvp_tab_example_02.MyTabActivity;

import android.content.Context;

public class MyTabPresenter implements MyTabContractor.Presentor {

    private Context mContext;
    private MyTabContractor.View mView;

    MyTabPresenter(Context ct, MyTabContractor.View view) {

        mContext = ct;
        mView = view;

    }

}
