package com.starmaan.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun buttonClicked(view: View) {
        val button = view as Button

        val imageView = findViewById<ImageView>(R.id.ImgPet)

        val progressBar = findViewById<ProgressBar>(R.id.PlayBar)

        val progressBar2 = findViewById<ProgressBar>(R.id.hungerBar)

        val progressBar3 = findViewById<ProgressBar>(R.id.CleanBar)

        when (button.id) {
            R.id.BtnPlay -> {

                imageView.setImageResource(R.drawable.play)
                progressBar.incrementProgressBy(10)

            }

            R.id.BtnFeed -> {

                imageView.setImageResource(R.drawable.chowing)
                progressBar2.incrementProgressBy(10)

            }

            R.id.BtnClean -> {

                imageView.setImageResource(R.drawable.clean)
                progressBar3.incrementProgressBy(10)

            }



        }
    }
}