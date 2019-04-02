package com.owen.pizzaoder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class KfcChickenAdapter extends ArrayAdapter<KfcPiza> {


    public KfcChickenAdapter(Activity context, ArrayList<KfcPiza> chickens)
    {
        super(context,0,chickens);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        KfcPiza currentKfcPiza = getItem(position);

        View listItemView = convertView;

        if (listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_pizza, parent,false);
        }

            TextView tvpizaName = (TextView) listItemView.findViewById(R.id.tv_pizza_name);

            tvpizaName.setText(currentKfcPiza.getPizaName());

            TextView tvpizaPlace = (TextView) listItemView.findViewById(R.id.tv_place_oder);

            tvpizaPlace.setText(currentKfcPiza.getPlaceOder());

           ImageView imageView = (ImageView) listItemView.findViewById(R.id.iv_imagePizzaView);

          imageView.setImageResource(currentKfcPiza.getImageResourceIdPizza());


        return listItemView;

    }
}
