package com.sliacen.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which champion has this ability?",
            R.drawable.caitlyn_90_caliber_net,
            "Kled", "Caitlyn", "Fizz", "Elise",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Which champion has this ability?",
            R.drawable.azir_shurimas_legacy,
            "Sivir", "Renekton", "Akshan", "Azir",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Which champion has this ability?",
            R.drawable.senna_last_embrace,
            "Senna", "Thresh", "Vex", "Yorick",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What is Kennen's champion title?",
            R.drawable.kennen_icon,
            "The Fist of Shadow", "The Eye of Twilight",
            "The Electric Rat", "The Heart of the Tempest",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What is Draven's champion title?",
            R.drawable.draven_icon,
            "The Noxian Grand General", "The Glorious Executioner",
            "The Axes of Noxus", "Draven",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What is Nilah's champion title?",
            R.drawable.nilah_icon,
            "The Battle Mistress", "The Desert Rose",
            "The Joy Unbound", "The Child of the Yun",
            3
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What is the name of this removed item?",
            R.drawable.leviathan_icon,
            "Cinderhulk", "Heart of Gold",
            "Leviathan", "Atma's Reckoning",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What is the name of this removed item?",
            R.drawable.ohmwrecker_icon,
            "Ohmwrecker", "Zz'Rot Portal", "Malady", "Spellbinder",
            1
        )
        questionsList.add(que8)

        questionsList.shuffle()

        return questionsList
    }

}