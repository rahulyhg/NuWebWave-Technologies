package com.kjsce.slidingexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class Services extends NavigationDrawer {

    private LinkedHashMap<String, GroupInfo> subjects = new LinkedHashMap<String, GroupInfo>();
    private ArrayList<GroupInfo> deptList = new ArrayList<GroupInfo>();

    private CustomAdapter listAdapter;
    private ExpandableListView simpleExpandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_services);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_services, contentFrameLayout);
        // add data for displaying in expandable list view
        loadData();

        //get reference of the ExpandableListView
        simpleExpandableListView = (ExpandableListView) findViewById(R.id.simpleExpandableListView);
        // create the adapter by passing your ArrayList data
        listAdapter = new CustomAdapter(Services.this, deptList);
        // attach the adapter to the expandable list view
        simpleExpandableListView.setAdapter(listAdapter);
        //expand all the Groups
        //expandAll();

        // setOnChildClickListener listener for child row click
        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //get the group header
                GroupInfo headerInfo = deptList.get(groupPosition);
                //get the child info
                ChildInfo detailInfo =  headerInfo.getProductList().get(childPosition);
                //display it or do something with it

                Intent in = new Intent(getBaseContext(),service_details.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                in.putExtra("Group",headerInfo.getName());
                in.putExtra("Topic",detailInfo.getName());
                startActivity(in);
                //finish();
                /*Toast.makeText(getBaseContext(), " Clicked on :: " + headerInfo.getName()
                        + "/" + detailInfo.getName(), Toast.LENGTH_LONG).show();*/
                return false;
            }
        });
        // setOnGroupClickListener listener for group heading click
        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header
                GroupInfo headerInfo = deptList.get(groupPosition);
                //display it or do something with it
                /*Toast.makeText(getBaseContext(), " Header is :: " + headerInfo.getName(),
                        Toast.LENGTH_LONG).show();*/

                return false;
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

    //method to expand all groups
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){
            simpleExpandableListView.expandGroup(i);
        }
    }

    //method to collapse all groups
    public void collapseAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++){

            simpleExpandableListView.collapseGroup(i);
        }
    }

    //load some initial data into out list
    private void loadData(){


        addProduct("Website Developments","Website Designing");
        addProduct("Website Developments","Static Website Designing");
        addProduct("Website Developments","Dynamic Website Designing");
        addProduct("Website Developments","CMS Website Designing");
        addProduct("Website Developments","Joomla Website Designing");
        addProduct("Website Developments","PHP Website Designing");
        addProduct("Website Developments","Responsive Website Designing");
        addProduct("Website Developments","Industries Website Designing");
        addProduct("Website Developments","Real Estate Website Designing");
        addProduct("Website Developments","Wordpress Website Designing");

        addProduct("Graphic Designing","What is graphic designing");
        addProduct("Graphic Designing","Corporate Logo Designing");
        addProduct("Graphic Designing","Brochure Designing");
        addProduct("Graphic Designing","Letterhead Designing");
        addProduct("Graphic Designing","Envelope Designing");
        addProduct("Graphic Designing","Visiting Cards Designing");
        addProduct("Graphic Designing","Flyers Designing");
        addProduct("Graphic Designing","PPT Presentations");
        addProduct("Graphic Designing","Flex & Banner Designing");

        addProduct("Search Engine Optimization","SEO");
        addProduct("Search Engine Optimization","About SEO");
        addProduct("Search Engine Optimization","SEO Process");
        addProduct("Search Engine Optimization","Content Writing");
        addProduct("Search Engine Optimization","On Page Optimisation");
        addProduct("Search Engine Optimization","Off Page Optimisation");
        addProduct("Search Engine Optimization","1st Page Google Ranking");
        addProduct("Search Engine Optimization","Guaranteed SEO");
        addProduct("Search Engine Optimization","Google SEO");
        addProduct("Search Engine Optimization","Small Business SEO");
        addProduct("Search Engine Optimization","Real Estate SEO");
        addProduct("Search Engine Optimization","Metal Companies SEO");
        addProduct("Search Engine Optimization","SEO by Countries");

        addProduct("Social Media Optimization","What is SMO");
        addProduct("Social Media Optimization","Why is SMO important");
        addProduct("Social Media Optimization","Facebook marketing");
        addProduct("Social Media Optimization","Twitter Marketing");
        addProduct("Social Media Optimization","Google+ Marketing");
        addProduct("Social Media Optimization","Linkedin Marketing");
        addProduct("Social Media Optimization","Instagram Marketing");
        addProduct("Social Media Optimization","E-Commerce SMO");

        addProduct("Real Estate Marketing","Real Estate Branding");
        addProduct("Real Estate Marketing","Real Estate Website Designing");
        addProduct("Real Estate Marketing","Real Estate SEO");
        addProduct("Real Estate Marketing","Real Estate SMO");
        addProduct("Real Estate Marketing","Real Estate Graphic Designing");
        addProduct("Real Estate Marketing","Real Estate Marketing");
        addProduct("Real Estate Marketing","NA Plot Marketing");
        addProduct("Real Estate Marketing","Second Home Marketing");
        addProduct("Real Estate Marketing","NA Bunglow Marketing");
        addProduct("Real Estate Marketing","Bunglow Villa Marketing");
        addProduct("Real Estate Marketing","Residential Marketing");

        addProduct("Mobile Application","Android IOS App Developers");
        addProduct("Mobile Application","Android Application");
        addProduct("Mobile Application","IOS Application");

        addProduct("E-Commerce Website","E-Commerce");
        addProduct("E-Commerce Website","WooCommerce");
        addProduct("E-Commerce Website","Magento");
        addProduct("E-Commerce Website","Opencart");
        addProduct("E-Commerce Website","OS Commerce");

        addProduct("Brand Identity","Dye Sublimation Lanyards");
        addProduct("Brand Identity","Screen Printed Lanyards");
        addProduct("Brand Identity","Printed ID Cards");
        addProduct("Brand Identity","Printed Name Badges");
        addProduct("Brand Identity","Printed Mugs");
        addProduct("Brand Identity","Printed Access Cards");
        addProduct("Brand Identity","Printed Mouse Pad");
        addProduct("Brand Identity","Printed Pendrives");
        addProduct("Brand Identity","Printed Tshirt");
    }



    //here we maintain our products in various departments
    private int addProduct(String department, String product){

        int groupPosition = 0;

        //check the hash map if the group already exists
        GroupInfo headerInfo = subjects.get(department);
        //add the group if doesn't exists
        if(headerInfo == null){
            headerInfo = new GroupInfo();
            headerInfo.setName(department);
            subjects.put(department, headerInfo);
            deptList.add(headerInfo);
        }

        //get the children for the group
        ArrayList<ChildInfo> productList = headerInfo.getProductList();
        //size of the children list
        int listSize = productList.size();
        //add to the counter
        listSize++;

        //create a new child and add that to the group
        ChildInfo detailInfo = new ChildInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        //find the group position inside the list
        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }

}
