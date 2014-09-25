package com.example.dz1.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
        setContentView(R.layout.mylauout);
        }






    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("MENU 1");
        getMenuInflater().inflate(R.menu.layoutmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onMenuItemSelected(int featuredId, MenuItem item) {
        final RelativeLayout rl = (RelativeLayout)findViewById(R.id.relative);
        final RelativeLayout rl1 = (RelativeLayout)findViewById(R.id.relative2);
        final RelativeLayout rl3 = (RelativeLayout)findViewById(R.id.reletive3);
        final RelativeLayout rl4 = (RelativeLayout)findViewById(R.id.relative4);
        final RelativeLayout rl5 = (RelativeLayout)findViewById(R.id.reletive5);
        final RelativeLayout rl6 = (RelativeLayout)findViewById(R.id.reletive6);
        Random random = new Random();
        int r = random.nextInt();
        int g = random.nextInt();
        int b = random.nextInt();
        int r1 = random.nextInt();
        int g1 = random.nextInt();
        int b1 = random.nextInt();
        int r3 = random.nextInt();
        int g3 = random.nextInt();
        int b3 = random.nextInt();
        int r4 = random.nextInt();
        int g4 = random.nextInt();
        int b4 = random.nextInt();
        int r5 = random.nextInt();
        int g5 = random.nextInt();
        int b5 = random.nextInt();
        int r6 = random.nextInt();
        int g6 = random.nextInt();
        int b6 = random.nextInt();
        rl.setBackgroundColor(Color.rgb(r,g,b));
        rl1.setBackgroundColor(Color.rgb(r1,g1,b1));
        rl3.setBackgroundColor(Color.rgb(r3,g3,b3));
        rl4.setBackgroundColor(Color.rgb(r4,g4,b4));
        rl5.setBackgroundColor(Color.rgb(r5,g5,b5));
        rl6.setBackgroundColor(Color.rgb(r6,g6,b6));
        switch (item.getItemId()){
            case R.id.menu1:
                break;

        }
        return super.onMenuItemSelected(featuredId, item);
    }
}