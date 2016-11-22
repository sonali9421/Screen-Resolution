package com.example.mysqlconnect;


import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
/**
 * Created by Sonali on 3/25/2016.
 */
public class ScreenResolution {
    public static int getHeightResolution(Activity context, int resolution){
        Display display = context.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int height = (size.y*resolution)/100;
        return height;
    }
    public static int getWidthResolution(Activity context,int resolution){
        Display display = context.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = (size.x*resolution)/100;
        return width;
    }
}
