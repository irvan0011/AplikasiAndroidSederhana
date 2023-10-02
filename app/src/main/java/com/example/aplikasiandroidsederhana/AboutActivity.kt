package com.example.aplikasiandroidsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.me)
        findViewById<TextView>(R.id.txtNama).text="Nama : Irvan Repaldo "
        findViewById<TextView>(R.id.txtEmail).text="Email : irvanrepaldo.work@gmail.com"
    }
}