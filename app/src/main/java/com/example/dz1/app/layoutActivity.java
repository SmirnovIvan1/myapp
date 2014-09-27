package com.example.dz1.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by ivan on 23.09.14.
 */
public class layoutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylauout2);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("MENU 1");
        getMenuInflater().inflate(R.menu.layoutmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onMenuItemSelected(int featuredId, MenuItem item) {
      LinearLayout rl = (LinearLayout) findViewById(R.id.linear);
      LinearLayout rl1 = (LinearLayout) findViewById(R.id.linear1);
      LinearLayout rl3 = (LinearLayout) findViewById(R.id.linear2);
      LinearLayout rl4 = (LinearLayout) findViewById(R.id.linear3);
      LinearLayout rl5 = (LinearLayout) findViewById(R.id.linear4);
      LinearLayout rl6 = (LinearLayout) findViewById(R.id.linear5);
        rl.setBackgroundColor(Color.rgb((int) (Math.random() * 256),(int) (Math.random() * 256),(int) (Math.random() * 256)));
        rl1.setBackgroundColor(Color.rgb((int) (Math.random() * 256),(int) (Math.random() * 256),(int) (Math.random() * 256)));
        rl3.setBackgroundColor(Color.rgb((int) (Math.random() * 256),(int) (Math.random() * 256),(int) (Math.random() * 256)));
        rl4.setBackgroundColor(Color.rgb((int) (Math.random() * 256),(int) (Math.random() * 256),(int) (Math.random() * 256)));
        rl5.setBackgroundColor(Color.rgb((int) (Math.random() * 256),(int) (Math.random() * 256),(int) (Math.random() * 256)));
        rl6.setBackgroundColor(Color.rgb((int) (Math.random() * 256),(int) (Math.random() * 256),(int) (Math.random() * 256)));
        return super.onMenuItemSelected(featuredId, item);

    }
}