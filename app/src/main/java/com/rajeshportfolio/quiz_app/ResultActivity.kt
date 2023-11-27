package com.rajeshportfolio.quiz_app

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import nl.dionsegijn.konfetti.KonfettiView
import nl.dionsegijn.konfetti.models.Shape

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Todo: connect to each view in the layout through its id
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore:TextView = findViewById(R.id.tv_score)
        val btnFinish:Button = findViewById(R.id.btn_finish)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tvName.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions."

        val viewKonfettiData : KonfettiView = findViewById(R.id.viewKonfetti)

        viewKonfettiData.build()
            .addColors(Color.YELLOW, Color.RED, Color.BLUE)
            .setDirection(0.0, 359.0)
            .setSpeed(1f, 5f)
            .setFadeOutEnabled(true)
            .setTimeToLive(2000L)
            .addShapes(Shape.RECT, Shape.CIRCLE)
            .addSizes(nl.dionsegijn.konfetti.models.Size(12))
            .setPosition(-50f, viewKonfettiData.width + 50f, -50f, -50f)
            .streamFor(300, 5000L)

        btnFinish.setOnClickListener {
            //
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }
    }


}