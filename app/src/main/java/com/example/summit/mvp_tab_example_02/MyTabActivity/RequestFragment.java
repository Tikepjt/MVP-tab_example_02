package com.example.summit.mvp_tab_example_02.MyTabActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.summit.mvp_tab_example_02.R;



public class RequestFragment extends Fragment {


    private RecyclerView mRecyclerView;


    public RequestFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {


        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_request, container, false);

        mRecyclerView = rootView.findViewById(R.id.request_rv);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        return rootView;

    }
}