package com.example.aplikasiandroidsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.aplikasiandroidsederhana.model.Article
import de.hdodenhof.circleimageview.CircleImageView

class DetailActivity : AppCompatActivity() {
    lateinit var overview:TextView
    lateinit var judul:TextView
    lateinit var img:ImageView
    lateinit var desc:TextView
    lateinit var detail:Article
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        judul=findViewById(R.id.articleDetailTitle)
        overview=findViewById(R.id.articleDetailOverview)
        desc=findViewById(R.id.articleDetailDescription)
        img=findViewById(R.id.articleDetailImage)!!

        detail = intent.getParcelableExtra("article")!!
        img.setImageResource(detail.imageResourceId)
        judul.text=detail.title
        overview.text=detail.overview
        desc.text=detail.description
        //Lengkapi kode disini

        val shareButton = findViewById<Button>(R.id.btnShare)
        shareButton.setOnClickListener {
            shareArticle(detail)
            //Lengkapi kode disini
        }

    }


    private fun shareArticle(article: Article) {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, article.toString())
            type = "text/plain"
        }
        startActivity(Intent.createChooser(shareIntent, "Share using"))
    }

}