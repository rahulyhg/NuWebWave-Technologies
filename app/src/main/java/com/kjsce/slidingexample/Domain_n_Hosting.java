package com.kjsce.slidingexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Domain_n_Hosting extends NavigationDrawer {
    private TextView DnH1;
    private TextView DnH2;
    private TextView DnH3;
    private TextView DnH4;
    WebView WebViewWithCSS_dnh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_domain_hosting, contentFrameLayout);
        //setContentView(R.layout.activity_domain_hosting);

        WebViewWithCSS_dnh = (WebView)findViewById(R.id.domain_hosting_webView);

        WebSettings webSetting = WebViewWithCSS_dnh.getSettings();
        webSetting.setJavaScriptEnabled(true);

        WebViewWithCSS_dnh.setWebViewClient(new WebViewClient_dnh());

        WebViewWithCSS_dnh.loadUrl("file:///android_asset/nuwebwave201216/cheap-domain-hosting-providers-in-mumbai.html");

       /* DnH1 = (TextView) findViewById(R.id.D_n_H1);
        DnH2 = (TextView) findViewById(R.id.D_n_H2);
        DnH3 = (TextView) findViewById(R.id.D_n_H3);
        DnH4 = (TextView) findViewById(R.id.D_n_H4);
        String h1 = "<p align=\"justify\">•<b>NU WEB WAVE TECHNOLOGIES PVT. LTD.</b> is India's TOP domain registration & web hosting company offers cheap domain name registration, web hosting and website builder tools to register your Domain name India at low cost across India. Register domain, Purchase domain, Back order domains, search domains, reserve domains helps you register a domain name for your business before then others do Register <b>.com, .net, .in, .org, .info, .asia, .mobi, .co, .cc, .eu, .co.uk, .us, .edu, .gov, .nl, .hk, .ae, .co.in, .tr, .cz, .ca, .cm, .ua</b> domains at lowest price. Web hosting and email service absolutely free with domain registration.</p>";
        DnH1.setText(Html.fromHtml(h1));
        String h2 = "<p align=\"justify\">• A domain name is like a unique address which is there to indicate the ownership to that name on the web for your customers and friends so they find all the information about your services or about you.</p>";
        DnH2.setText(Html.fromHtml(h2));
        String h3 = "<p align=\"justify\">• If you are looking to book a <b>domain and website</b> in South Mumbai, <b>Nuwebwave Technologies Pvt Ltd</b> is in the Heart and center of location. We provide Booking for all domains as per clients requirements be it<b>.COM, .IN, .CO.IN, .CO, .AE, .NET, .ORG, .COMPANY, .WEBSITE, .US, .IT, .TR</b> and others. Our <b>Hosting</b> facilities are Linux US based Servers with the best with an assured 99.99% Uptime.</p>";
        DnH3.setText(Html.fromHtml(h3));
        String h4 ="<p align=\"justify\"> • To book your website you need a <b>domain name</b> hence please contact us for the best domain name and suggestions from Nuwebwave Technologies Pvt Ltd. We even provide domain on auctions and having high brand values.</p>";
        DnH4.setText(Html.fromHtml(h4));*/
    }
    @Override
    public void onBackPressed() {
        // code here to show dialog
        Intent n = new Intent(this, HomePage.class);
        startActivity(n);
    }

    private class WebViewClient_dnh extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

}
