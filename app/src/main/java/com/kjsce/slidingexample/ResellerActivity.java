package com.kjsce.slidingexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;

public class ResellerActivity extends NavigationDrawer{

    WebView WebViewWithCSS_reseller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_reseller, contentFrameLayout);
        //setContentView(R.layout.activity_reseller);



        WebViewWithCSS_reseller = (WebView)findViewById(R.id.reseller_webView);

        WebSettings webSetting = WebViewWithCSS_reseller.getSettings();
        webSetting.setJavaScriptEnabled(true);

        WebViewWithCSS_reseller.setWebViewClient(new WebViewClient_reseller());

        WebViewWithCSS_reseller.loadUrl("file:///android_asset/nuwebwave201216/web-designing-seo-reseller-mumbai-india-us-uk-middle-east.html");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.reseller_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(getApplicationContext(), Reseller_Form.class);
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


    private class WebViewClient_reseller extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
    }


