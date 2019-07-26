package com.stuffshuf.institute_course

import kotlin.random.Random

data class Data (
    val lang:String,
    val desc:String,
    val img:Int

)


val langauge= arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")

val description= arrayOf<String>("C programming is considered as the base for other programming languages",
    "C++ is an object-oriented programming language.",
    "Java is a programming language and a platform.",
    ".NET is a framework which is used to develop software applications.",
    "Kotlin is a open-source programming language, used to develop Android apps and much more.",
    "Ruby is an open-source and fully object-oriented programming language.",
    "Ruby on Rails is a server-side web application development framework written in Ruby language.",
    "Python is interpreted scripting  and object-oriented programming language.",
    "JavaScript is an object-based scripting language.",
    "PHP is an interpreted language, i.e., there is no need for compilation.",
    "AJAX allows you to send and receive data asynchronously without reloading the web page.",
    "Perl is a cross-platform environment used to create network and server-side applications.",
    "Hadoop is an open source framework from Apache written in Java.",
    "Hadoop is an open source framework from Apache written in Java.")


val image= arrayOf<Int>(R.drawable.c,
    R.drawable.cplus,
    R.drawable.java,
    R.drawable.dot_net,
    R.drawable.kotlin,
    R.drawable.ruby,
    R.drawable.rails,
    R.drawable.python,
    R.drawable.java,
    R.drawable.js,
    R.drawable.php,
    R.drawable.ajax,
    R.drawable.perl,
    R.drawable.hadoop)

fun randon(n:Int):ArrayList<Data>
{
    val course=ArrayList<Data>()

    for (i in 1..n)
    {
        course.add(Data(langauge[i],
                         description[i],
                         image[i]


            ))
    }
    return course
}