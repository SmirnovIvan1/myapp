package com.example.dz1.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Random;

/**
 * Created by ivan on 23.09.14.
 */
public class layoutActivity extends Activity {
    Random rand;
    int[] layouts = {R.id.linear1, R.id.linear2, R.id.linear, R.id.linear3,R.id.linear4, R.id.linear5};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylauout2);
        rand = new Random();
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("MENU 1");
        getMenuInflater().inflate(R.menu.layoutmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void updateColors() {

        for(int layoutId : layouts){
         findViewById(layoutId).setBackgroundColor(generateColor());
        }
    }

    int generateColor(){
        return Color.rgb(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }
    @Override
    public boolean onMenuItemSelected(int featuredId, MenuItem item) {
        updateColors();

        return super.onMenuItemSelected(featuredId, item);
    }


}