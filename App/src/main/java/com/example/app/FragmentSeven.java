package com.example.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by arringtoncopeland on 12/14/13.
 */
public class FragmentSeven extends Fragment {

    private WebView webView;

    public static FragmentSeven newInstance(Context context) {
        FragmentSeven f = new FragmentSeven();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.webview_fragment, null);

        webView = (WebView) root.findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.youtube.com/watch?feature=player_embedded&v=LCDhYi2LuIE");



        return root;

    }
}
