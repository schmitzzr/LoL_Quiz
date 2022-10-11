package com.sliacen.myquizapp

data class Question(
    val id: Int,
    val question: String,
    val image: Int, // location inside our res folder
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: Int
)