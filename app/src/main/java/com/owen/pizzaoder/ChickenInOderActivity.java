package com.owen.pizzaoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChickenInOderActivity extends AppCompatActivity {

    TextView tvChicken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_in_oder);

        ArrayList<KfcPiza> chickens = new ArrayList<>();

        chickens.add(new KfcPiza("chicken", "Kabarak"));
        chickens.add(new KfcPiza("pza", "Nakuru"));
        chickens.add(new KfcPiza("baristo", "Kiamunyi"));
        chickens.add(new KfcPiza("ceg", "Stage One"));

        chickens.add(new KfcPiza("chick", "Kabu"));
        chickens.add(new KfcPiza("legs", "high school"));

        chickens.add(new KfcPiza("smokie", "stud c"));
        chickens.add(new KfcPiza("sausage", "kfa"));

        chickens.add(new KfcPiza("oder", "anex"));
        chickens.add(new KfcPiza("pig", "kericho"));

        chickens.add(new KfcPiza("chips", "nakuru"));
        chickens.add(new KfcPiza("soda", "DCs"));

        chickens.add(new KfcPiza("bbear", "Rafiki"));
        chickens.add(new KfcPiza("space", "Kabugut"));

        chickens.add(new KfcPiza("chicken", "odan"));
        chickens.add(new KfcPiza("barissto", "jkaut"));

        chickens.add(new KfcPiza("nakuru", "chapchap"));
        chickens.add(new KfcPiza("stew", "nderkwa"));

        chickens.add(new KfcPiza("choma", "kambi"));
        chickens.add(new KfcPiza("chicken", "westgate"));




        KfcChickenAdapter kfcChickenAdapter = new KfcChickenAdapter(this, chickens);

        ListView listView = (ListView)findViewById(R.id.list_view_kfc_products);

        listView.setAdapter(kfcChickenAdapter);



    }
}
