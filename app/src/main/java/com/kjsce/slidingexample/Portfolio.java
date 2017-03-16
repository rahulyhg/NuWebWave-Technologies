package com.kjsce.slidingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;

public class Portfolio extends AppCompatActivity {

    private WebView webView;
    private Button portfolio_website;
    private Button portfolio_seo;
    private Button portfolio_smo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
       //setContentView(R.layout.activity_portfolio);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_portfolio, contentFrameLayout);

      /*  portfolio_website = (Button) findViewById(R.id.portfolio_website);
        portfolio_seo = (Button) findViewById(R.id.portfolio_seo);
        portfolio_smo = (Button) findViewById(R.id.portfolio_smo);
*/

        this.webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

       /* WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        webView.setWebViewClient(webViewClient); */

        webView.loadUrl("http://www.nuwebwave.com/website-designing-graphic-designing-portfolio-work2.html");





    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientImpl extends WebViewClient {


        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String url) {
            return false;
        }
    }


}
