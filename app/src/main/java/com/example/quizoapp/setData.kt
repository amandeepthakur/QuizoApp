package com.example.quizoapp



object setData {

    const val name:String = "name"
    const val score:String = "score"
    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var question1 = QuestionData(
            1,
            "With the introduction of online education services students can learn from anywhere using the........",

            "Internet",
            "Electricity",
            "5G Technology",
            "E-Mail",
            1
        )
        var question2 = QuestionData(
            2,
            "Android operating system is a ........ operating system",

            "Computer",
            "Mobile",
            "Technology",
            "Virtual Reality",
            2
        )
        var question3 = QuestionData(
            3,
            ".......... is word processor software",

            "MS Window",
            "MS Excel",
            "MS PowerPoint",
            "MS Word",
            4
        )
        var question4 = QuestionData(
            4,
            "Switch-case is similar to ......... statement.",

            "if else",
            "if else-if",
            "break",
            "goto",
            2
        )

        var question5 = QuestionData(
            5,
            "A ........ is a 2 port device.",

            "Hub",
            "Switch",
            "Router",
            "Bridge",
            4
        )
        var question6 = QuestionData(
            6,
            "Wi-Fi stands for .........",
            "Wireless Field",
            "Wireless Fidelity",
            "Wire Fire",
            "Wire Fidelity",
            2
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        return que
    }
}