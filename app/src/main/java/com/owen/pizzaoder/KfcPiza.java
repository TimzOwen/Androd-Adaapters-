package com.owen.pizzaoder;


public class KfcPiza  {

    private String mPizzaName;

    private String mPlaceOder;

    private int mImageResourceId;


   public KfcPiza(String pizaName, String placeOder, int imageResourceId)
   {
       this.mPizzaName = pizaName;
       this.mPlaceOder = placeOder;
       mImageResourceId = imageResourceId;
   }


   public String getPizaName()
   {
       return mPizzaName;
   }

   public String getPlaceOder()
   {
       return mPlaceOder;
   }

   public int getImageResourceIdPizza()
   {
       return mImageResourceId;
   }
}
