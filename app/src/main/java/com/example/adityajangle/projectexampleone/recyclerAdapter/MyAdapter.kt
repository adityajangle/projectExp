package com.example.adityajangle.projectexampleone.recyclerAdapter

import android.app.Activity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.adityajangle.projectexampleone.DataSet
import com.example.adityajangle.projectexampleone.Main2Activity
import com.example.adityajangle.projectexampleone.R
import kotlinx.android.synthetic.main.edit_recyclerview.view.*

class MyAdapter(
    private val context: Context,
    private val dataset:List<DataSet>,
    private val fn:(pos:Int)-> Unit
):RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {

        return MyViewHolder(
             LayoutInflater
            .from(context)
            .inflate(R.layout.edit_recyclerview, parent, false))
    }

    override fun getItemCount(): Int=dataset.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val  item=dataset[position]
        holder.view.setOnClickListener {
            fn(position)
        }
        holder.prodname().text=item.productname
        holder.prodrate().text=item.productprice
    }

    class MyViewHolder(val view:View): RecyclerView.ViewHolder(view)
    {
        fun prodname()=view.findViewById<TextView>(R.id.txtprodnameid)
        fun prodrate()=view.findViewById<TextView>(R.id.txtprodpriceid)
    }
}