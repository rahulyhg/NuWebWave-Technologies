package com.kjsce.slidingexample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class service_details extends AppCompatActivity {

    WebView WebViewWithCSS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_details);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.services_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        WebViewWithCSS = (WebView)findViewById(R.id.services_webView);

        WebSettings webSetting = WebViewWithCSS.getSettings();
        webSetting.setJavaScriptEnabled(true);

        WebViewWithCSS.setWebViewClient(new WebViewClient());

        String group = getIntent().getStringExtra("Group");

        String topic = getIntent().getStringExtra("Topic");
        String s =" ";
            switch (topic) {
                case "Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/website-designing-companies-in-mumbai.html");

                    break;
                }
                case "Static Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/static-website-designing-services-mumbai-india.html");
                    break;
                }
                case "Dynamic Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/dynamic-website-designing-services-mumbai-india.html");
                    break;
                }
                case "CMS Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/cms-website-designing-services-mumbai-india.html");
                    break;
                }
                case "Joomla Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/joomla-website-designing-services-mumbai-india.html");
                    break;
                }
                case "PHP Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/php-website-designing-services-mumbai-india.html");
                    break;
                }
                case "Responsive Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/responsive-website-designing-services-mumbai-india.html");
                    break;
                }
                case "Industries Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/industries-website-designing-services-mumbai-india.html");
                    break;
                }
                case "Real Estate Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/real-estate-website-designing-services-mumbai-india.html");
                    break;
                }
                case "Wordpress Website Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/wordpress-website-designing-services-mumbai-india.html");
                    break;
                }
                //////////////////////////
                case "What is graphic designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/logo-corporate-brochure-letterhead-graphic-designing.html");
                    break;
                }
                case "Corporate Logo Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/corporate-logo-designing-services-mumbai-india.html");
                    break;
                }
                case "Brochure Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/corporate-brochure-designing-printing-services-mumbai-india.html");
                    break;
                }
                case "Letterhead Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/corporate-letterhead-designing-printing-services-mumbai-india.html");
                    break;
                }
                case "Envelope Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/corporate-envelope-designing-printing-services-mumbai-india.html");
                    break;
                }
                case "Visiting Cards Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/corporate-visiting-cards-designing-printing-services-mumbai-india.html");
                    break;
                }
                case "Flyers Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/corporate-flyers-designing-printing-services-mumbai-india.html");
                    break;
                }
                case "PPT Presentations": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/corporate-ppt-presentation-services-mumbai-india.html");
                    break;
                }
                case "Flex & Banner Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/corporate-flex-and-banner-designing-printing-services-mumbai-india.html");
                    break;
                }
                ///////////////////////////
                case "SEO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/search-engine-optimisation-seo-company.html");
                    break;
                }
                case "About SEO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/what-is-search-engine-optimisation.html");
                    break;
                }
                case "SEO Process": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/search-engine-optimisation-process.html");
                    break;
                }
                case "Content Writing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/content-writing-for-search-engine-optimisation.html");
                    break;
                }
                case "On Page Optimisation": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/on-page-optimisation-seo-services-in-mumbai.html");
                    break;
                }
                case "Off Page Optimisation": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/off-page-optimisation-seo-services-in-mumbai.html");
                    break;
                }
                case "1st Page Google Ranking": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/first-page-google-seo-ranking.html");
                    break;
                }
                case "Guaranteed SEO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/guaranteed-search-engine-optimisation-services.html");
                    break;
                }
                case "Google SEO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/google-guaranteed-search-engine-optimisation-services.html");
                    break;
                }
                case "Small Business SEO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/small-business-search-engine-optimisation-services.html");
                    break;
                }
                case "Real Estate SEO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/real-estate-search-engine-optimisation-services.html");
                    break;
                }
                case "Metal Companies SEO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/metal-companies-search-engine-optimisation-services.html");
                    break;
                }
                case "SEO by Countries": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/search-engine-optimisation-services-by-countries-providers.html");
                    break;
                }
                ////////////////////////////////
                case "What is SMO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/social-media-optimisation-smo-company.html");
                    break;
                }
                case "Why is SMO important": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/why-social-media-optimisation-is-important.html");
                    break;
                }
                case "Facebook Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/facebook-marketing-services-social-media-optimisation.html");
                    break;
                }
                case "Twitter Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/twitter-marketing-services-social-media-optimisation.html");
                    break;
                }
                case "Google+ Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/google-plus-marketing-services-social-media-optimisation.html");
                    break;
                }
                case "Linkedin Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/linkdein-marketing-services-social-media-optimisation.html");
                    break;
                }
                case "Instagram Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/instragram-marketing-services-social-media-optimisation.html");
                    break;
                }
                case "E-Commerce SMO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/e-commerce-social-media-optimisation.html");
                    break;
                }
                ////////////////////
                case "Real Estate Branding": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/real-estate-branding-website-seo-smo-graphic.html");
                    break;
                }
                case "Real Estate SMO": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/real-estate-social-media-optimsation-services-india.html");
                    break;
                }
                case "Real Estate Graphics Designing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/real-estate-logo-brochure-designing-services-mumbai-india.html");
                    break;
                }
                case "Real Estate Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/real-estate-guaranteed-marketing-services-mumbai-india.html");
                    break;
                }
                case "NA Plot Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/non-agricultural-plot-marketing-services-mumbai-india.html");
                    break;
                }
                case "Second Home Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/second-home-marketing-services-mumbai-india.html ");
                    break;
                }
                case "NA Bunglow Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/non-agricultural-bunglow-marketing-services-mumbai-india.html");
                    break;
                }
                case "Bunglow Villa Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/bunglow-villa-marketing-services-mumbai-india.html");
                    break;
                }
                case "Residential Marketing": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/residential-marketing-services-mumbai-india.html");
                    break;
                }
                ////////////////////////////
                case "Android IOS App Developers": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/android-ios-mobile-applications-developers-india.html");
                    break;
                }
                case "Android Application": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/android-mobile-application-mumbai-india.html");
                    break;
                }
                case "IOS Application": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/ios-mobile-application-mumbai-india.html");
                    break;
                }
                //////////////////////////
                case "E-Commerce": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/e-commerce-website-with-payment-gateway-providers.html");
                    break;
                }
                case "WooCommerce": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/woocommerce-website-designing-services-mumbai-india.html");
                    break;
                }
                case "Magento": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/magento-website-designing-services-mumbai-india.html");
                    break;
                }
                case "Opencart": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/opencart-website-designing-services-mumbai-india.html");
                    break;
                }
                case "OS Commerce": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/os-commerce-website-designing-services-mumbai-india.html");
                    break;
                }
                //////////////////////////
                case "Dye Sublimation Lanyards": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/dye-sublimation-lanyards-manufacturer.html");
                    break;
                }
                case "Screen Printed Lanyards": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/screen-printed-lanyards-manufacturer.html");
                    break;
                }
                case "Printed ID Cards": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/office-school-id-cards-designers-printers-in-mumbai.html");
                    break;
                }
                case "Printed Name Badges": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/button-badges-PVC-name-badges-designer-printers-in-mumbai.html");
                    break;
                }
                case "Printed Mugs": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/white-black-inside-magic-gold-silver-mugs-printer-manufacturer-in-mumbai.html");
                    break;
                }
                case "Printed Access Cards": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/access-RFID-smart-magnetic-cards-designers-printers-in-mumbai.html");
                    break;
                }
                case "Printed Mouse Pad": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/sublimation-gel-mouse-pad-designers-printers-in-mumbai.html");
                    break;
                }
                case "Printed Pendrives": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/pendrives-powerbanks-UV-printing-in-mumbai.html");
                    break;
                }
                case "Printed Tshirt": {
                    WebViewWithCSS.loadUrl("file:///android_asset/nuwebwave201216/tshirt-printing-designing-services-in-mumbai.html");
                    break;
                }
            }
       /* TextView t = (TextView) findViewById(R.id.content);
        t.setText(Html.fromHtml(s));*/
        }

    private class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    }

