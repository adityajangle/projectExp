package com.example.adityajangle.projectexampleone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            val commonActivity=Intent(this@MainActivity,Main2Activity::class.java)
            commonActivity.putExtra("data","Add")
            startActivity(commonActivity)
        }
        btnedit.setOnClickListener {
            val commonActivity=Intent(this@MainActivity,Main2Activity::class.java)
            commonActivity.putExtra("data","Edit")
            startActivity(commonActivity)
        }
        btndashboard.setOnClickListener {
            val commonActivity=Intent(this@MainActivity,Main2Activity::class.java)
            commonActivity.putExtra("data","DashBoard")
            startActivity(commonActivity)
        }
    }
}
