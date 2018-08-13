package com.example.summit.mvp_tab_example_02.MyTabActivity;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.summit.mvp_tab_example_02.R;
import com.example.summit.mvp_tab_example_02.databinding.FragmentRequestBinding;

public class RequestFragment extends Fragment {

    FragmentRequestBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedIntanceState) {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_request, container, true);

        return mBinding.getRoot();

    }

}
