package com.example.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

/**
 * Created by arringtoncopeland on 12/14/13.
 */
public class FragmentFive extends Fragment implements
        AdapterView.OnItemSelectedListener, ViewSwitcher.ViewFactory  {

    private Integer[] mThumbIds = {
            R.drawable.photo_1, R.drawable.photo_2,
            R.drawable.photo_3, R.drawable.photo_4, R.drawable.photo_5};

    private Integer[] mImageIds = {
            R.drawable.photo_1, R.drawable.photo_2, R.drawable.photo_3,
            R.drawable.photo_4, R.drawable.photo_5};

    public static FragmentFive newInstance(Context context) {
        FragmentFive f = new FragmentFive();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_five, null);

        mSwitcher = (ImageSwitcher) root.findViewById(R.id.switcher);
        mSwitcher.setFactory(this);
        mSwitcher.setInAnimation(AnimationUtils.loadAnimation(getActivity(),
                android.R.anim.fade_in));
        mSwitcher.setOutAnimation(AnimationUtils.loadAnimation(getActivity(),
                android.R.anim.fade_out));

        Gallery g = (Gallery) root.findViewById(R.id.gallery);
        g.setAdapter(new ImageAdapter(getActivity()));
        g.setOnItemSelectedListener(this);


        return root;

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        mSwitcher.setImageResource(mImageIds[i]);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public View makeView() {
        ImageView i = new ImageView(getActivity());
        i.setBackgroundColor(0xFF000000);
        i.setScaleType(ImageView.ScaleType.FIT_CENTER);
        i.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        return i;
    }

    private ImageSwitcher mSwitcher;

    public class ImageAdapter extends BaseAdapter {
        public ImageAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return mThumbIds.length;
        }
        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView i = new ImageView(mContext);

            i.setImageResource(mThumbIds[position]);
            i.setAdjustViewBounds(true);
            i.setLayoutParams(new Gallery.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            return i;
        }

        private Context mContext;

    }





}
