package com.sorapp.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class main_ac : AppCompatActivity()
{

    lateinit var b:WebView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_ac)
        GetComponents()
    }


    fun GetComponents()
    {
        b=findViewById(R.id.main_ac_webview)
        b.loadUrl("https://google.com")
    }


    override fun onBackPressed()
    {
        var intent:Intent= Intent()
        intent.setAction(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        startActivity(intent)
    }


}