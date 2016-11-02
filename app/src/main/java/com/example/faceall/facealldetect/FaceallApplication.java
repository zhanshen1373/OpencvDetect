package com.example.faceall.facealldetect;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;

import com.example.faceall_lib.FaceallHandler;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by guoyu24k on 16/6/14.
 */
public class FaceallApplication extends Application {
    public static FaceallHandler ageHandler;
    public static FaceallHandler genderHandler;
    public static FaceallHandler qualityHandler;
    public static FaceallHandler poseHandler;
    public static ContentResolver mContentResolver;
    public static FaceallHandler getGenderHandler() {return genderHandler;}
    public static FaceallHandler getFaceQualityHandler() {return qualityHandler;}
    public static FaceallHandler getFacePoseHandler() {return poseHandler;}

    private static FaceallApplication appContext = null;

    public final String TAG = "faceall_predict";
    static byte[] genderSymbol;
    static byte[] qualitySymbol;
    static byte[] poseSymbol;

    @Override
    public void onCreate() {
        super.onCreate();
        long startTime = System.currentTimeMillis();
        genderSymbol = readRawFile(getApplicationContext(),R.raw.gender60);
        qualitySymbol = readRawFile(getApplicationContext(),R.raw.face_quality);
        poseSymbol = readRawFile(getApplicationContext(), R.raw.pose);

        Log.i(TAG, "The length of gender model: " + genderSymbol.length);
        mContentResolver = getContentResolver();
        genderHandler = new FaceallHandler(genderSymbol);
        qualityHandler = new FaceallHandler(qualitySymbol);
        poseHandler = new FaceallHandler(poseSymbol);
        long endTime = System.currentTimeMillis();
        Log.i(TAG, "Load raw file eclipsed: " + Long.toString(endTime - startTime) + " ms");
        appContext = this;
    }

    public static byte[] readRawFile(Context ctx, int resId)
    {
        int size = 0;
        byte[] result = null;

        int pos = 0;

        // while read file
        InputStream ins = ctx.getResources().openRawResource(resId);
        int rawSize = 0;
        try {
            rawSize = ins.available();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.i("test", rawSize + "  -----");
        result = new byte[rawSize + 1024];
        try {
            while((size=ins.read(result,pos,1024))>=0){
                pos+=size;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static FaceallApplication getInstance() {
        return appContext;
    }
}
