package com.owen.pizzaoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class DeliveryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_in_oder);

        ArrayList<KfcPiza> chickens = new ArrayList<>();

        chickens.add(new KfcPiza("Nakuru", "Kenya"));
        chickens.add(new KfcPiza("pza", "Nakuru"));
        chickens.add(new KfcPiza("Nakuru", "Kenya"));
        chickens.add(new KfcPiza("ceg", "Stage uhuru"));

        chickens.add(new KfcPiza("chick", "Kabu"));
        chickens.add(new KfcPiza("Nakuru", "Kenya Kenya"));

        chickens.add(new KfcPiza("smokie", "Kenya c"));
        chickens.add(new KfcPiza("v", "kfa"));

        chickens.add(new KfcPiza("oder", "anex"));
        chickens.add(new KfcPiza("Nakuru", "kericho"));

        chickens.add(new KfcPiza("chips", "nakuru"));
        chickens.add(new KfcPiza("Nakuru", "Kenya"));

        chickens.add(new KfcPiza("bbear", "Rafiki"));
        chickens.add(new KfcPiza("Nakuru", "Kenya"));

        chickens.add(new KfcPiza("chicken", "odan"));
        chickens.add(new KfcPiza("Nakuru", "jkaut"));

        chickens.add(new KfcPiza("nakuru", "Kenya"));
        chickens.add(new KfcPiza("Nakuru", "nderkwa"));

        chickens.add(new KfcPiza("choma", "kambi"));
        chickens.add(new KfcPiza("Nakuru", "Kenya"));


        KfcChickenAdapter kfcChickenAdapter = new KfcChickenAdapter(this, chickens);

        ListView listView = (ListView) findViewById(R.id.list_view_kfc_products);

        listView.setAdapter(kfcChickenAdapter);

    }
}
