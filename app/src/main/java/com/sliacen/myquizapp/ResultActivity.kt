package com.sliacen.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tvName)
        val tvCongrats: TextView = findViewById(R.id.tvCongrats)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val buttonFinish: TextView = findViewById(R.id.buttonFinish)
        val ivTrophy : ImageView = findViewById(R.id.ivTrophy)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text = "Your score is $correctAnswers out of $totalQuestions."

        val percentage = correctAnswers / totalQuestions.toDouble()

        if (percentage == 1.0) tvCongrats.text = "Congratulations!!"
        else if (percentage >= 0.75) tvCongrats.text = "Well done!"
        else if (percentage >= 0.5) tvCongrats.text = "You could do better"
        else tvCongrats.text = "Yikes my guy"

        if (percentage >= 0.5) ivTrophy.setImageResource(R.drawable.worlds2019)
        else ivTrophy.setImageResource(R.drawable.lcs_logo)

        buttonFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}