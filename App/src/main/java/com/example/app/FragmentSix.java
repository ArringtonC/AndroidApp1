package com.example.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

/**
 * Created by arringtoncopeland on 12/14/13.
 */
public class FragmentSix extends Fragment {

    CalendarView calendar;

    public static FragmentSix newInstance(Context context) {
        FragmentSix f = new FragmentSix();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.calendar_fragment, null);
        calendar = (CalendarView) root.findViewById(R.id.calendar);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int dayOfMonth) {
//
                Toast.makeText(getActivity(),dayOfMonth +"/"+month+"/"+ year,Toast.LENGTH_LONG).show();

            }
        });

        return root;

    }

}
