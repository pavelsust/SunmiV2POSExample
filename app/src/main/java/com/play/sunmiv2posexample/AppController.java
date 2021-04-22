package com.play.sunmiv2posexample;

import android.app.Application;

import com.play.sunmiv2posexample.utils.SunmiPrintHelper;

public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SunmiPrintHelper.getInstance().initSunmiPrinterService(this);
    }
}
