package com.bussiness.weplant;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentProfile extends Fragment {
    Toolbar profile;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
view=inflater.inflate(R.layout.fragment_profile, container, false);
profile=view.findViewById(R.id.setting_toolbar);
        profile.setTitleTextAppearance(getContext(), R.style.ToolBarTextStyle);
        // Inflate the layout for this fragment
        return view;
    }
}