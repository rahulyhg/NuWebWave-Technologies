package com.kjsce.slidingexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CareerActivity extends NavigationDrawer {

    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_career, contentFrameLayout);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.career_list);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Sales & Marketing",
                "Graphics",
                "SEO",
                "Magento , Wordpress & PHP",
                "Internship"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
               /* Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();*/

                Intent in_career = new Intent(getBaseContext(),career_details.class);
                in_career.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                in_career.putExtra("field",itemValue);
                startActivity(in_career);

            }

        });
    }
    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        Intent n = new Intent(this , HomePage.class);
        startActivity(n);
    }


}