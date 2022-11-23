package com.example.teamproject.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName= "Notes")
data class Notes (
    @PrimaryKey (autoGenerate = true)
var id: Int,

    @ColumnInfo(name = "title")
var title:String,
E. I: Structure
    @ColumnInfo(name = "sub_title")
var subTitle: String,
  @ColumnInfo(name - "date_time")
var datelime:String,
  @ColumnInfo(name = "note_text")
var noteText: String,
 @ColumnInfo(name = "img_path")
var ImgPath:String,
@ColumnInfo(name = "web_link")
var weblink:String,
@ColumnInfo(name = "color")
var color:String

){
    override fun tostring(): string (
    return "$title : $dateTime"
}