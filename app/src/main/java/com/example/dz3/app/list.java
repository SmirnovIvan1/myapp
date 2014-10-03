package com.example.dz3.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ivan on 30.09.14.
 */
public class list extends Activity {
String[] names = {"сыр","арбуз","банан","огурец","дыня","морковь",};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listMain = (ListView) findViewById(R.id.listMain);
        final EditText editText = (EditText) findViewById(R.id.editText);
        Button massageButton2 = (Button) findViewById(R.id.button);
        final ArrayList<String> list = new ArrayList<String>(Arrays.asList(names));
       final   ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,
               android.R.layout.simple_list_item_1, list);
        listMain.setAdapter(adapter);
        listMain.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                adapter.remove(adapter.getItem(position));

                adapter.notifyDataSetChanged();
                return false;
            }
        });

        massageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(0,editText.getText().toString());
                adapter.notifyDataSetChanged();
                editText.setText("");
            }
        });


    }

}
