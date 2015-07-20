package com.example.mikhail.cubike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mikhail.cubike.adapters.TrackAdapter;
import com.example.mikhail.cubike.model.Track;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Track> tracks = new ArrayList<Track>();

        Track ranevsckiyTrack = new Track("Таганрог Раневской", "Отличный маршрут для тех, кто хочет узнать больше о жизни актрисы", 2, 15);
        Track ranevsckiyTrack2 = new Track("Таганрог Чехова", "Места, где А.П. Чехов провел молодость и зрелую часть жизни", 1, 1);
        tracks.add(ranevsckiyTrack);
        tracks.add(ranevsckiyTrack2);
        ListView listView = (ListView) this.findViewById(R.id.track_list);
        TrackAdapter trackAdapter = new TrackAdapter(this, tracks);
        listView.setAdapter(trackAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });
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
}
