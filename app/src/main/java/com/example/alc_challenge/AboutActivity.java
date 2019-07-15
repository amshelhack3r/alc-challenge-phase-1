package com.example.alc_challenge;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    private static final String alc_url = "https://andela.com/alc";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webView = findViewById(R.id.alc_webview);
        webView.setWebViewClient(new Client());
        webView.loadUrl(alc_url);
        Log.i("tag", "loading");
    }
}
