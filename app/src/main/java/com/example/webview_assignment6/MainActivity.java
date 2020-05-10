package com.example.webview_assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private Object WebSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webvw);
        webView.setWebViewClient(new WebViewClient());

        WebSettings = webView.getSettings();
        ((android.webkit.WebSettings) WebSettings).setJavaScriptEnabled(true);

        webView.loadUrl("https://yujigun.github.io/");

    }
}
