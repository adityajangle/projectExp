package com.example.adityajangle.projectexampleone

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.adityajangle.projectexampleone.fragments.AddFragment
import com.example.adityajangle.projectexampleone.fragments.DashBoardFragment
import com.example.adityajangle.projectexampleone.fragments.EditFragment
import org.jetbrains.anko.toast

class Main2Activity : AppCompatActivity() {
     var productlist=ArrayList<DataSet>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val initFragment=intent.getStringExtra("data")
        toast(initFragment)
        when(initFragment)
        {
            "Add" -> loadFragment(AddFragment())
            "Edit" -> loadFragment(EditFragment())
            "DashBoard"->loadFragment(DashBoardFragment())
        }

    }
    fun loadFragment(frag:Fragment)
    {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameMain,frag)
        transaction.commit()
    }
}
