package com.kjsce.slidingexample;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;


public class Plan_n_Pricing extends NavigationDrawer {


    WebView WebViewWithCSS_pnp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_planpricing, contentFrameLayout);
        // setContentView(R.layout.activity_planpricing);
        WebViewWithCSS_pnp = (WebView)findViewById(R.id.pnp_webView);

        WebSettings webSetting = WebViewWithCSS_pnp.getSettings();
        webSetting.setJavaScriptEnabled(true);

        WebViewWithCSS_pnp.setWebViewClient(new WebViewClient_pnp());

        WebViewWithCSS_pnp.loadUrl("file:///android_asset/nuwebwave201216/website-designing-seo-smo-ppc-graphic-plans-pricing.html");

    }
    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        Intent n = new Intent(this , HomePage.class);
        startActivity(n);
    }

    private class WebViewClient_pnp extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}