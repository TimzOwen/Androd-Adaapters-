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

        chickens.add(new KfcPiza("Nakuru", "Kenya",R.drawable.color_gray));
        chickens.add(new KfcPiza("pza", "Nakuru",R.drawable.family_grandmother));
        chickens.add(new KfcPiza("Nakuru", "Kenya",R.drawable.family_father));
        chickens.add(new KfcPiza("ceg", "Stage uhuru",R.drawable.color_gray));

        chickens.add(new KfcPiza("chick", "Kabu",R.drawable.family_father));
        chickens.add(new KfcPiza("Nakuru", "Kenya Kenya",R.drawable.color_white));

        chickens.add(new KfcPiza("smokie", "Kenya c",R.drawable.family_father));
        chickens.add(new KfcPiza("v", "kfa",R.drawable.color_dusty_yellow));

        chickens.add(new KfcPiza("oder", "anex",R.drawable.family_father));
        chickens.add(new KfcPiza("Nakuru", "kericho",R.drawable.color_mustard_yellow));

        chickens.add(new KfcPiza("chips", "nakuru",R.drawable.number_nine));
        chickens.add(new KfcPiza("Nakuru", "Kenya",R.drawable.family_father));

        chickens.add(new KfcPiza("bbear", "Rafiki",R.drawable.family_father));
        chickens.add(new KfcPiza("Nakuru", "Kenya",R.drawable.number_four));

        chickens.add(new KfcPiza("chicken", "odan",R.drawable.family_father));
        chickens.add(new KfcPiza("Nakuru", "jkaut",R.drawable.color_black));

        chickens.add(new KfcPiza("nakuru", "Kenya",R.drawable.family_father));
        chickens.add(new KfcPiza("Nakuru", "nderkwa",R.drawable.family_daughter));

        chickens.add(new KfcPiza("choma", "kambi",R.drawable.family_father));
        chickens.add(new KfcPiza("Nakuru", "Kenya",R.drawable.color_gray));


        KfcChickenAdapter kfcChickenAdapter = new KfcChickenAdapter(this, chickens);

        ListView listView = (ListView) findViewById(R.id.list_view_kfc_products);

        listView.setAdapter(kfcChickenAdapter);

    }
}
