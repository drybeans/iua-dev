package com.qiyi.tp.cinema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public native String hellofantasy();
    static
    {
        System.loadLibrary("fantasy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str = hellofantasy();
        Log.i("fantasy: ", str);

    }
}
