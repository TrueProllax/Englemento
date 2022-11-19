package com.example.englemento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        Handler(Looper.getMainLooper()).postDelayed({
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        },3000);
    }
}