package com.examples.sumanth.sunshine.app;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            ArrayList<String> fakeData = new ArrayList<String>(7);
            fakeData.add("Today - Sunny - 88/63");
            fakeData.add("Tomorrow - Foggy - 70/46");
            fakeData.add("Wed - Cloudy - 72/63");
            fakeData.add("Thu - Rainy - 64/51");
            fakeData.add("Fri - Foggy - 70/46");
            fakeData.add("Sat - Sunny - 76/68");
            fakeData.add("Sun - Sunny - 88/63");
            fakeData.add("Wed - Cloudy - 72/63");
            fakeData.add("Thu - Rainy - 64/51");

            fakeData.add("Fri - Foggy - 70/46");
            fakeData.add("Sat - Sunny - 76/68");
            fakeData.add("Sun - Sunny - 88/63");

            ArrayAdapter<String> forecastListAdapter = new ArrayAdapter<String>(getActivity(),
                    R.layout.list_item_forecast, R.id.list_item_forecast_textview, fakeData);

            ListView listview_forecast = (ListView) rootView.findViewById(R.id.listview_forecast);
            listview_forecast.setAdapter(forecastListAdapter);

            return rootView;
        }
    }
}
