package com.owen.pizzaoder;


public class KfcPiza  {

    private String mPizzaName;

    private String mPlaceOder;


   public KfcPiza(String pizaName, String placeOder)
   {
       mPizzaName = pizaName;
       mPlaceOder = placeOder;
   }


   public String getPizaName()
   {
       return mPizzaName;
   }

   public String getPlaceOder()
   {
       return mPlaceOder;
   }
}
