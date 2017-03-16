package com.kjsce.slidingexample;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class Career_Form extends AppCompatActivity {

    WebView WebViewWithCSS_cform;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_career_form);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.career_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        WebViewWithCSS_cform = (WebView) findViewById(R.id.career_webView);

        WebSettings webSetting = WebViewWithCSS_cform.getSettings();
        webSetting.setJavaScriptEnabled(true);

        WebViewWithCSS_cform.setWebViewClient(new WebViewClient_cform());

        WebViewWithCSS_cform.loadUrl("http://www.nuwebwave.com/w/html-career-form.html");


    }


    public void contact_Request(View view) {
        Toast.makeText(this, "Your Message will be sent", Toast.LENGTH_SHORT).show();

    }

    private class WebViewClient_cform extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    }

