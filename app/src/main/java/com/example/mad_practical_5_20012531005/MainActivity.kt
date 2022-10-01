package com.example.mad_practical_5_20012531005

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun play(view: View) {
        Intent(applicationContext, MyService::class.java).putExtra(
            MyService.DATA_KEY,
            MyService.DATA_VALUE
        ).apply { startService(this) }
    }

    fun stop(view: View) {
        Intent(applicationContext, MyService::class.java).apply { stopService(this) }
    }
}