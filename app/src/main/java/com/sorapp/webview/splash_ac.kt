package com.sorapp.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash_ac : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_ac)

        Handler().postDelayed(Runnable {

           startActivity(Intent(this,main_ac::class.java))

        },3000)

    }
}