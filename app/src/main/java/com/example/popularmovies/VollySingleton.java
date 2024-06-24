package com.example.popularmovies;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VollySingleton {
    private RequestQueue requestQueue;
    private static VollySingleton instance;

    private VollySingleton(Context context){
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }
    public  static  synchronized  VollySingleton getInstance(Context context){
        if (instance == null){
            instance = new VollySingleton(context);
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
