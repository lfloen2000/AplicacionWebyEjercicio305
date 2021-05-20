package com.example.aplicacionweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String webescrita = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        WebView webView = findViewById(R.id.WebView);
        webView.loadUrl(webescrita);
    }
}