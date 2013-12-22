package com.example.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.PushService;


/**
 * Created by arringtoncopeland on 12/13/13.
 */
public class FragmentOne extends Fragment {

    public static Fragment newInstance(Context context) {
        FragmentOne f = new FragmentOne();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_one, null);
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

        // Specify a Activity to handle all pushes by default.
        PushService.setDefaultPushCallback(getActivity(), MainActivity.class);

        // Save the current installation.
        ParseInstallation.getCurrentInstallation().saveInBackground();

        return root;
    }

}