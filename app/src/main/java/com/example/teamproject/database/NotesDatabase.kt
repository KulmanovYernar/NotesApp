package com.example.teamproject.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.codingwithme.notesapp.dao.NoteDao
import com.codingwithme.notesapp.entities.Notes
@Database(entities = [Notes: :class], version = 1, exportSchema = false)
abstract class NotesDatabase : RoomDatabase0 {
    companion object f
    var notesDatabase: NotesDatabase? = null
    @Synchronized
    fun getDatabase (context: Context): NotesDatabase
    if (notesDatabase != null) f
    notesDatabase = Room.databaseBuilder(
    context
    NotesDatabase: :class. java
    name: "notes.db"
    ). buildO
    return notesDatabase!!
    abstract fun notrDao:NoteDao
}