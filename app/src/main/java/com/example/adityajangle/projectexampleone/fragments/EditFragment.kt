package com.example.adityajangle.projectexampleone.fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adityajangle.projectexampleone.Main2Activity

import com.example.adityajangle.projectexampleone.R
import com.example.adityajangle.projectexampleone.recyclerAdapter.MyAdapter
import org.jetbrains.anko.support.v4.toast

class EditFragment : Fragment() {

    private lateinit var recylerView:RecyclerView
    private lateinit var viewAdapter:RecyclerView.Adapter<*>
    private lateinit var viewManager:RecyclerView.LayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rtVw=inflater.inflate(R.layout.fragment_edit, container, false)

        recylerView=rtVw.findViewById(R.id.Edit_RecyclerView)
        viewManager=LinearLayoutManager(activity)
        recylerView.layoutManager=viewManager

        viewAdapter=MyAdapter(activity as Context,(activity as Main2Activity).productlist)
        {
            toast("clicked ")
        }
        return rtVw
    }

}
