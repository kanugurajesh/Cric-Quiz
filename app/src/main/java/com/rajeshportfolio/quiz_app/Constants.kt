package com.rajeshportfolio.quiz_app

object Constants {

    // TODO  Create a constant variables which we required in the result screen
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "First trible hundred for india",
            R.drawable.virendersehwag,
            "virender sehwag", "Harbhajan Singh",
            "Sachin tendulkar", "kapil dev", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "First hatrick?",
            R.drawable.harbajansingh,
            "harbajan singh", "zaheer khan",
            "Rahul Dravid", "bhuvananeshwar kumar", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Has the most international wins(307) and played the most international matches(664)",
            R.drawable.sachintendulkar,
            "KL Rahul", "MS Dhoni",
            "Sachin tendulkar", "virat Kohli", 3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "first wicket for india in t20s",
            R.drawable.zaheerkhan,
            "None of these", "Harbhajan Singh",
            "Bhuvaneshwar kumar", "Zaheer Khan", 4
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Holds the record for the most consecutive ODI innings.",
            R.drawable.rahuldravid,
            "Virat Kohli", "Rahul Dravid",
            "Sachin tendulkar", "MS Dhoni", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Third highest wicket taker of all time(619)",
            R.drawable.anilkhumble,
            "Jasprit Bumrah", "bhuvaneswar kumar",
            "Mohammed Shami", "Anil kumble", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "6 sixes in an over",
            R.drawable.yuvrajsingh,
            "Sachin tendulkar", "M.S Dhoni",
            "Rohit Sharma", "Yuvraj singh", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "He is the first captain to win all three ICC trophies",
            R.drawable.msdhoni,
            "Rohit Sharma", "Sachin Tendulkar",
            "Virat kohli", "M.S Dhoni", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Highest number os sixes in all formats",
            R.drawable.rohisharma,
            "KL Rahul", "Ravindra Jadeja",
            "M.S Dhoni", "Virat Kohli", 4
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "known for his unconventional bowling action",
            R.drawable.jaspritbumrah,
            "Bhuvaneshwar kumar", "Ashwin ravichandran",
            "Jaspreet bumrah", "Harbajan singh", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}