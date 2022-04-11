package com.barrytu.webviewapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import com.barrytu.webviewapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBind: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBind.root)

        viewBind.activityMainWebView.apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.loadWithOverviewMode = true
            settings.useWideViewPort = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.loadsImagesAutomatically = true
            webViewClient = WebViewClient()
            webChromeClient = WebChromeClient()
        }.also {
            it.loadUrl("https://www-sandbox.thekono.com/viewer")
        }
    }
}