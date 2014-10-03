package com.example.dz3.app;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;



/**
 * Created by ivan on 30.09.14.
 */
public class List_Activity extends Activity {
    String[] names = { "Каша", "Сыр", "Масло", "Каша", "Каша", "Каша"};
    ArrayAdapter<String> adapter;
    ArrayList<String> adapter1;
  // private String selectedItem;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, names);
        ListView lvMain = (ListView) findViewById(R.id.listMain);




        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //  OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        lvMain.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

           @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //selectedItem = parent.getItemAtPosition(position).toString();
                // adapter.remove(selectedItem);
                // adapter.notifyDataSetChanged();
                adapter1.remove(adapter1.get(position));
                return false;
            }
        });
      /* @Override
            public  boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id){
            selectedItem = parent.getItemAtPosition(position).toString();
            adapter.remove(selectedItem);
            adapter.notifyDataSetChanged();
           // names.remove(position);
          //  adapter.notifyDataSetChanged();
         //   adapter.remove(adapter.getItem(position));
            return true;
        }
    });*/
        //   ArrayList<String> List = new ArrayList<String>(Array.asList(names));
        //    adapter = new ArrayAdapter<String>(this,
        //           android.R.layout.simple_list_item_1, list);
        //   setList(adapter);
        //  getListView().setOnItemClik


      //  adapter1 = new ArrayList<string>();
        lvMain.setAdapter(adapter);
    }
}
