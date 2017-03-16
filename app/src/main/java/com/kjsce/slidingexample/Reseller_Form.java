package com.kjsce.slidingexample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;

public class Reseller_Form extends AppCompatActivity {

    WebView WebViewWithCSS_rform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reseller_form);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.reseller_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        WebViewWithCSS_rform = (WebView)findViewById(R.id.reseller_webView);

        WebSettings webSetting = WebViewWithCSS_rform.getSettings();
        webSetting.setJavaScriptEnabled(true);

        WebViewWithCSS_rform.setWebViewClient(new WebViewClient_rform());

        WebViewWithCSS_rform.loadUrl("http://www.nuwebwave.com/w/html-reseller-form.html");


    }



    public void contact_Request(View view) {
        Toast.makeText(this, "Your Message will be sent", Toast.LENGTH_SHORT).show();

    }
    private class WebViewClient_rform extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
