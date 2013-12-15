package com.example.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by arringtoncopeland on 12/14/13.
 */
public class FragmentFour extends Fragment {

    public static FragmentFour newInstance(Context context) {
        FragmentFour f = new FragmentFour();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_four, null);
        return root;

    }
}
