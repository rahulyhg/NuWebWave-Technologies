package com.kjsce.slidingexample;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;


public class Contact_Us extends NavigationDrawer {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_contact_us, contentFrameLayout);
        //setContentView(R.layout.activity_contact_us);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.contact_us_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(getApplicationContext(), Contact_Form.class);
                startActivity(intent);
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
