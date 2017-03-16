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

public class Contact_Form extends AppCompatActivity {

    WebView WebViewWithCSS_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_form);
        /*FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_contact_form, contentFrameLayout);*/

        Toolbar myToolbar = (Toolbar) findViewById(R.id.contact_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        WebViewWithCSS_contact = (WebView)findViewById(R.id.contact_webView);

        WebSettings webSetting = WebViewWithCSS_contact.getSettings();
        webSetting.setJavaScriptEnabled(true);

        WebViewWithCSS_contact.setWebViewClient(new WebViewClient_contact());

        WebViewWithCSS_contact.loadUrl("http://www.nuwebwave.com/w/html-contact-form.html");


    }



    public void contact_Request(View view) {
        Toast.makeText(this, "Your Message will be sent", Toast.LENGTH_SHORT).show();

    }
    private class WebViewClient_contact extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
