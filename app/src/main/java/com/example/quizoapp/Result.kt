package com.example.quizoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(setData.name)
        val score = intent.getStringExtra(setData.score)
        val totalQuestion  = intent.getStringExtra("total size")

        congo.text = "Congratulations ${username} !!"
        Score.text = "${score} / ${totalQuestion}"
        doneBtn.setOnClickListener{

            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}