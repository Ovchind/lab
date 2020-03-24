package data

data class Student(
    val firstName:String,
    val surName:String,
    var presence:Boolean
)
    var studentList =
        arrayListOf(
            Student("Sheldon", "Cooper", true),
            Student("Leonard", "Hofstadter", true),
            Student("Howard", "Wolowitz", true),
            Student("Dmitry", "Ovchinnikov", true)
        )

