package com.example.teamproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.teamproject.R
import com.example.teamproject.entities.Notes

class NotesAdapter (val arrList: ArrayList<Notes>) :
    RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        return NotesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_rv_notes, parent, attachToRoot: false)
        )
    }
    override fun getItemCount(): Int {
        return arrList.size
    }
    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.itemView.tvTitle.text = arrlist[position].title
        holder.itemView.tvDesc.text = arrlist[position].noteText
        holder.itemView.tvDateTime.text = arrList[position].dateTime
    }
    class NotesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
    }