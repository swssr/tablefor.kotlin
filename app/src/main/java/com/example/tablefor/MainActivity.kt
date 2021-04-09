package com.example.tablefor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebview: WebView = findViewById(R.id.web_view);
        myWebview.settings.javaScriptEnabled = true;
        myWebview.loadUrl("https://tablefor.app/");
    }
}