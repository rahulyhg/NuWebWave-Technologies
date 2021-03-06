package com.kjsce.slidingexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class NavigationDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent newItem;
        switch(id){
            case R.id.nav_home:{
                newItem = new Intent(this,HomePage.class);
                startActivity(newItem);
                break;
            }
            case R.id.nav_services:{
                newItem = new Intent(this,Services.class);
                startActivity(newItem);

                break;
            }
            case R.id.nav_domain:{
                newItem = new Intent(this,Domain_n_Hosting.class);
                startActivity(newItem);

                break;
            }
            case R.id.nav_pnp:{
                newItem = new Intent(this,Plan_n_Pricing.class);
                startActivity(newItem);

                break;
            }
            case R.id.nav_portfolio:{
                newItem = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nuwebwave.com/website-designing-graphic-designing-portfolio-work2.html"));
                startActivity(newItem);
                break;
            }
            case R.id.nav_career:{

                newItem = new Intent(this,CareerActivity.class);
                startActivity(newItem);

                break;
            }
            case R.id.nav_reseller:{
                newItem = new Intent(this,ResellerActivity.class);
                startActivity(newItem);

                break;
            }
            case R.id.nav_contact_us:{
                newItem = new Intent(this,Contact_Us.class);
                startActivity(newItem);

                break;
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
