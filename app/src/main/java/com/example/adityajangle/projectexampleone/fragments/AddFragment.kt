package com.example.adityajangle.projectexampleone.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adityajangle.projectexampleone.DataSet
import com.example.adityajangle.projectexampleone.Main2Activity

import com.example.adityajangle.projectexampleone.R
import kotlinx.android.synthetic.main.fragment_add.*
import org.jetbrains.anko.support.v4.toast

class AddFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnAddProductId.setOnClickListener {
            var prodname=addProductNameid.text
            var prodprice=addProductPriceId.text
            /*val productlist=ArrayList<DataSet>()*/
            (activity as Main2Activity).productlist.add(DataSet(prodname.toString(),prodprice.toString()))

            for(i in (activity as Main2Activity).productlist)
            {
                toast(i.productname+" "+i.productprice)
            }


        }

        }
    }

