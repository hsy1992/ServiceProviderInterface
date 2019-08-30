package com.endless.serviceproviderinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.endless.aninterface.Display;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadModule(View view) {

        ServiceLoader<Display> loader = ServiceLoader.load(Display.class);
        Iterator<Display> iterator = loader.iterator();
        while (iterator.hasNext()) {
            Log.e("test", iterator.next().display());
        }
    }
}
