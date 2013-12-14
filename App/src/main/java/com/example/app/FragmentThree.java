package com.example.app;

import android.annotation.TargetApi;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by arringtoncopeland on 12/13/13.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FragmentThree extends Fragment {

    public static FragmentThree newInstance(Context context) {
        FragmentThree f = new FragmentThree();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_one, null);
        return root;

    }
}