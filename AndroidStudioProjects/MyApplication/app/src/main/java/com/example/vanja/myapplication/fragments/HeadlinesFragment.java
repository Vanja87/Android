package com.example.vanja.myapplication.fragments;

/**
 * Created by Vanja on 11/20/2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vanja.myapplication.R;

public class HeadlinesFragment extends Fragment {

    public static HeadlinesFragment newInstance() {

        Bundle args = new Bundle();

        HeadlinesFragment fragment = new HeadlinesFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.news_articles, container, false);
    }
}
