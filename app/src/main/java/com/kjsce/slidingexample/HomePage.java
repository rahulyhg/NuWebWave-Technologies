package com.kjsce.slidingexample;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.Timer;
import java.util.TimerTask;


public class HomePage extends NavigationDrawer{

    private Button wwd_ideas;
    private Button wwd_design;
    private Button wwd_build;
    private Button wwd_html;
    private Button wwd_seo;
    private Button wwd_support;
    private WebView wwd;
    private int former_count, down_count;
    private static int former_currentPage = 0;
    private static int down_currentPage = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_home_page, contentFrameLayout);
        //setContentView(R.layout.activity_home_page);



        //Home Page Buttons and Auto Slider Start
    wwd = (WebView) findViewById(R.id.wwd);
    wwd_ideas = (Button) findViewById(R.id.nu_ideas);
    wwd_design = (Button) findViewById(R.id.nu_design);
    wwd_build = (Button) findViewById(R.id.nu_build);
    wwd_html = (Button) findViewById(R.id.nu_html);
    wwd_seo = (Button) findViewById(R.id.nu_seo);
    wwd_support = (Button) findViewById(R.id.nu_support);

    {
        final WebSettings webSettings = wwd.getSettings();
        Resources res = getResources();
        float fontSize = res.getDimension(R.dimen.textSize);
        webSettings.setDefaultFontSize((int)fontSize);

        String head = "<html><body><p align=\"justify\" >";
        head+= "Here, at Nu Web Wave Technologies , we have always focussed on generating soultions for businesses that would ultimately benefit both the business as well the consumers and help them grow in this digital world.";
        head += "</p></body></html>";
        wwd.loadData(head, "text/html", "utf-8");
        wwd_ideas.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
    }


    final ViewPager pager_down = (ViewPager) findViewById(R.id.why_us);
    down_count = 2;
    Why_Us_Adapter wua = new Why_Us_Adapter(getSupportFragmentManager(),down_count);
    pager_down.setAdapter(wua);

    final ViewPager former_pager = (ViewPager) findViewById(R.id.former_slider);
    former_count = 3;
    Former_Slider fs = new Former_Slider(getSupportFragmentManager(),former_count);
    former_pager.setAdapter(fs);


    ////////////////////////////////Former Slider Timer////////////////////////////
    final Handler handler = new Handler();
    final Runnable Update = new Runnable() {
        public void run() {
            if (former_currentPage == former_count) {
                former_currentPage = 0;
            }
            former_pager.setCurrentItem(former_currentPage++, true);
        }
    };
    Timer swipeTimer = new Timer();
    swipeTimer.schedule(new TimerTask() {
        @Override
        public void run() {
            handler.post(Update);
        }
    }, 2000, 2000);

    ////////////////////////////////Former Slider Timer////////////////////////////

    ////////////////////////////////Pager_Down Timer///////////////////////////////
    final Handler down_handler = new Handler();
    final Runnable down_Update = new Runnable() {
        public void run() {
            if (down_currentPage == down_count) {
                down_currentPage = 0;
            }
            pager_down.setCurrentItem(down_currentPage++, true);
        }
    };
    Timer swipeTimer2 = new Timer();
    swipeTimer2.schedule(new TimerTask() {
        @Override
        public void run() {
            down_handler.post(down_Update);
        }
    }, 2000, 2000);
    ////////////////////////////////Pager_Down Timer///////////////////////////////

    View.OnClickListener oclBtn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String txt;

            switch (v.getId()){

                case R.id.nu_ideas:{
                    wwd_ideas.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    wwd_build.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_support.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_html.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_seo.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_design.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    txt = "<html><body><p align=\"justify\">";
                    txt+= "Here, at Nu Web Wave Technologies , we have always focussed on generating soultions for businesses that would ultimately benefit both the business as well the consumers and help them grow in this digital world.";
                    txt+= "</p></body></html>";
                    wwd.loadData(txt, "text/html", "utf-8");
                    break;
                }
                case R.id.nu_design:{
                    wwd_ideas.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_build.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_support.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_html.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_seo.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_design.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    txt = "<html><body><p align=\"justify\">";
                    txt+= "Effectiveness of any design, is in its simplicity and this also makes it easier for anyone to understand the whole idea and the concept, and which makes it likely to be accepted readily. Simple but efffective design is the key to a succesful business.";
                    txt+= "</p></body></html>";
                    wwd.loadData(txt, "text/html", "utf-8");
                    break;
                }
                case R.id.nu_build:{
                    wwd_ideas.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_build.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    wwd_support.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_html.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_seo.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_design.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    txt = "<html><body><p align=\"justify\">";
                    txt+= "Adding small and miniscule elements that contribute towards a bigger cause is the essence of perfect teamwork. Here, at Nu web wave, we constantly reinvent ourselves to try and figure out ways through which we can enhance our performance and deliver even better to your business. ";
                    txt+= "</p></body></html>";
                    wwd.loadData(txt, "text/html", "utf-8");
                    break;
                }
                case R.id.nu_html:{
                    wwd_ideas.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_build.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_support.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_html.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    wwd_seo.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_design.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    txt = "<html><body><p align=\"justify\">";
                    txt+= "One of the most dynamic languages used for web designing and extremely compatible, makes it easier for businesses to handle their businesses very independently.";
                    txt+= "</p></body></html>";
                    wwd.loadData(txt, "text/html", "utf-8");                        break;
                }
                case R.id.nu_seo:{
                    wwd_ideas.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_build.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_support.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_html.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_seo.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    wwd_design.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    txt = "<html><body><p align=\"justify\">";
                    txt+="For any business to be successful it is very important to be visible at the first glance and be available to the customers at their fingertips, SEO as a tool helps your business achieve it.";
                    txt+= "</p></body></html>";
                    wwd.loadData(txt, "text/html", "utf-8");                        break;
                }
                case R.id.nu_support:{
                    wwd_ideas.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_build.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_support.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    wwd_html.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_seo.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    wwd_design.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    txt = "<html><body><p align=\"justify\">";
                    txt+="We have a highly experienced staff, which is known for its round the clock commitment and always delivers what it promises.";
                    txt+= "</p></body></html>";
                    wwd.loadData(txt, "text/html", "utf-8");
                    break;
                }
            }
        }
    };
    wwd_ideas.setOnClickListener(oclBtn);
    wwd_design.setOnClickListener(oclBtn);
    wwd_build.setOnClickListener(oclBtn);
    wwd_html.setOnClickListener(oclBtn);
    wwd_seo.setOnClickListener(oclBtn);
    wwd_support.setOnClickListener(oclBtn);

// Home Page Buttons and Auto Sliders End


}

    @Override
    public void onBackPressed() {
        finish();
    }
    /////////////////////////////////////////////////////////////



    private class Why_Us_Adapter extends FragmentPagerAdapter {

        int numOfTabs;
        public Why_Us_Adapter(FragmentManager fm, int n) {
            super(fm);
            this.numOfTabs=n;
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0:{
                    why_us clients = new why_us();
                    clients.Instance(R.mipmap.why_us_clients, R.mipmap.why_us_seo,pos);
                    return clients;
                }
                case 1:{
                    why_us seo = new why_us();
                    seo.Instance(R.mipmap.why_us_tickets, R.mipmap.why_us_hours,pos);
                    return seo;
                }

                default:{
                    why_us clients = new why_us();
                    return clients;
                }
            }
        }

        @Override
        public int getCount() {
            return numOfTabs;
        }
    }



    ///////////////////////////////////////////////////////////////////////



    private class Former_Slider extends FragmentPagerAdapter {
        int numOfTabs;
        public Former_Slider(FragmentManager fm, int n) {
            super(fm);
            this.numOfTabs=n;
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0:{
                    Nu_Slider s1 = new Nu_Slider();
                    s1.Nu_Instance(R.mipmap.sliders1, pos);
                    return s1;
                }
                case 1:{
                    Nu_Slider s2 = new Nu_Slider();
                    s2.Nu_Instance(R.mipmap.sliders2, pos);
                    return s2;
                }

                case 2:{
                    Nu_Slider s3 = new Nu_Slider();
                    s3.Nu_Instance(R.mipmap.sliders3, pos);
                    return s3;
                }

                default:{
                    Nu_Slider s1 = new Nu_Slider();
                    s1.Nu_Instance(R.mipmap.sliders1, pos);
                    return s1;
                }
            }
        }

        @Override
        public int getCount() {
            return numOfTabs;
        }

    }



}

