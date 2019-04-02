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

        chickens.add(new KfcPiza("chicken", "Kabarak", R.drawable.family_daughter));
        chickens.add(new KfcPiza("pza", "Nakuru", R.drawable.family_father));
        chickens.add(new KfcPiza("baristo", "Kiamunyi", R.drawable.color_black));
        chickens.add(new KfcPiza("ceg", "Stage One", R.drawable.color_brown));

        chickens.add(new KfcPiza("chick", "Kabu", R.drawable.family_older_sister));
        chickens.add(new KfcPiza("legs", "high school", R.drawable.family_daughter));

        chickens.add(new KfcPiza("smokie", "stud c", R.drawable.family_older_sister));
        chickens.add(new KfcPiza("sausage", "kfa", R.drawable.family_daughter));

        chickens.add(new KfcPiza("oder", "anex", R.drawable.color_gray));
        chickens.add(new KfcPiza("pig", "kericho", R.drawable.family_younger_brother));

        chickens.add(new KfcPiza("chips", "nakuru", R.drawable.family_older_sister));
        chickens.add(new KfcPiza("soda", "DCs", R.drawable.family_daughter));

        chickens.add(new KfcPiza("bbear", "Rafiki", R.drawable.family_daughter));
        chickens.add(new KfcPiza("space", "Kabugut", R.drawable.family_younger_sister));

        chickens.add(new KfcPiza("chicken", "odan", R.drawable.family_daughter));
        chickens.add(new KfcPiza("barissto", "jkaut", R.drawable.family_older_sister));

        chickens.add(new KfcPiza("nakuru", "chapchap", R.drawable.number_eight));
        chickens.add(new KfcPiza("stew", "nderkwa", R.drawable.family_daughter));

        chickens.add(new KfcPiza("choma", "kambi", R.drawable.family_daughter));
        chickens.add(new KfcPiza("chicken", "westgate", R.drawable.number_four));




        KfcChickenAdapter kfcChickenAdapter = new KfcChickenAdapter(this, chickens);

        ListView listView = (ListView)findViewById(R.id.list_view_kfc_products);

        listView.setAdapter(kfcChickenAdapter);



    }
}
