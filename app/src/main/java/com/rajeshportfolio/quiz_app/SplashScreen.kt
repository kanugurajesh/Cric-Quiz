package com.rajeshportfolio.quiz_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // set timeout for 1 seconds
        val timeout = 500

        // create a thread
        val thread = Thread {
            try {
                Thread.sleep(timeout.toLong())

                // Use runOnUiThread to execute UI-related code on the UI thread
                runOnUiThread {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        thread.start()
    }
}
