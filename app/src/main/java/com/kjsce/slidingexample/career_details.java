package com.kjsce.slidingexample;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class career_details extends AppCompatActivity {
    WebView WebViewWithCSS_career;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_details);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.career_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        WebViewWithCSS_career = (WebView) findViewById(R.id.career_details_webView);

        WebSettings webSetting = WebViewWithCSS_career.getSettings();
        webSetting.setJavaScriptEnabled(true);

        WebViewWithCSS_career.setWebViewClient(new WebViewClient_career());

        String field = getIntent().getStringExtra("field");

        switch (field) {
            case "Sales & Marketing": {
                WebViewWithCSS_career.loadUrl("file:///android_asset/nuwebwave201216/business-developement-sales-executive-jobs-in-south-central-western-mumbai.html");

                break;
            }
            case "Graphics": {
                WebViewWithCSS_career.loadUrl("file:///android_asset/nuwebwave201216/graphic-designer-html-website-designing-jobs-in-south-central-western-mumbai.html");

                break;
            }
            case "SEO": {
                WebViewWithCSS_career.loadUrl("file:///android_asset/nuwebwave201216/search-engine-optimisation-jobs-in-south-central-western-mumbai.html");

                break;
            }
            case "Magento , Wordpress & PHP": {
                WebViewWithCSS_career.loadUrl("file:///android_asset/nuwebwave201216/magento-php-wordpress-development-jobs-in-south-central-western-mumbai.html");

                break;
            }
            case "Internship": {
                WebViewWithCSS_career.loadUrl("file:///android_asset/nuwebwave201216/marketing-graphicdesigning-mba-telecalling-contentwriting-internship-in-south-central-western-mumbai.html");

                break;
            }

        }
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.reseller_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(getApplicationContext(), Career_Form.class);
                startActivity(intent);
            }

        });

    }
    private class WebViewClient_career extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
