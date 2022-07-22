package com.example.passwordsave


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

//리사이클러 뷰

class CustomAdapter(var context: Context,
var list : List<AccountEntity>) : RecyclerView.Adapter<CustomAdapter.MyViewHolder>()
{


    override fun getItemCount(): Int {//item 개수
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.activity_for_test_room,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }



    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {

    }


}