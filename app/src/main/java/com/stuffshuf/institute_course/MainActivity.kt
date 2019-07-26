package com.stuffshuf.institute_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.course_list.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val courses= randon(12)

        Rec.layoutManager=GridLayoutManager(
            this,
            1,
            GridLayoutManager.VERTICAL,
            false)
        Rec.adapter=CustomAdapter(courses)


    }

}
