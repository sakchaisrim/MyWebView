package com.sakchaisr.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView mwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mwebview = (WebView)findViewById(R.id.webview);
        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.loadUrl("https://www.google.com");
    }
    private class WebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
        @Override
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            if ((keyCode ==KeyEvent.KEYCODE_BACK) && mwebview.canGoBack()) {
                mwebview.goBack();
                return true;
            }
            return  super.onKeyDown(keyCode, event);
    }
}
