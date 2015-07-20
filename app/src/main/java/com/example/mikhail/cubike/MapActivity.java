package com.example.mikhail.cubike;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.mikhail.cubike.adapters.PlacesAdapter;
import com.example.mikhail.cubike.model.Place;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;


public class MapActivity extends ActionBarActivity {

    private final ThreadLocal<GoogleMap> map_ = new ThreadLocal<>(); // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        setUpMapIfNeeded();


        List<Place> places= new ArrayList<Place>();

        Place place1 = new Place("Октябрьская площадь", "Старинная площадь города");
        Place place2 = new Place("Памятник Раневской Ф.Г", "Памятник известной актрисе");
        Place place3 = new Place("Дом Кобылина", "Дом известного купца");
        Place place4 = new Place("Дом Ладохина", "Старинная площадь города");
        Place place5 = new Place("Театр им А.П.Чехова", "Места, где А.П. Чехов провел молодость и зрелую часть жизни");
        Place place6 = new Place("Библиотека им А.П.Чехова", "Старинная библиотека");
        places.add(place1);
        places.add(place2);
        places.add(place3);
        places.add(place4);
        places.add(place5);
        places.add(place6);

        ListView listView = (ListView) this.findViewById(R.id.places_list);
        PlacesAdapter trackAdapter = new PlacesAdapter(this, places);
        listView.setAdapter(trackAdapter);

    }

    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (map_.get() == null) {
            // Try to obtain the map from the SupportMapFragment.
            map_.set(((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap());
            // Check if we were successful in obtaining the map.
            if (map_.get() != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(47.2092003, 38.9334364));
        CameraUpdate zoom = CameraUpdateFactory.zoomTo(14);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_map, menu);
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
