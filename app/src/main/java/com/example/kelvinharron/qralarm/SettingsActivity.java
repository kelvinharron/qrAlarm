package com.example.kelvinharron.qralarm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by kelvinharron on 04/04/2016.
 */
public class SettingsActivity extends Activity {

    protected void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.settings_fragment);

        String[] SETTINGS = {"Time Style", "Home Location", "Alarm Override","Alarm Volume", "Leaderboard Refresh", "About"};
        ListAdapter settingsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SETTINGS);
        ListView settingsListView = (ListView) findViewById(R.id.list);
        settingsListView.setAdapter(settingsAdapter);

        settingsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }
}