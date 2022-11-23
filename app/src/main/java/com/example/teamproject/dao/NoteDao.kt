package com.example.teamproject.dao

import androidx.room.*
import com.codingwithme.notesapp.entities.Notes
@Dao
interface NoteDao{
    @get: Query( value: "SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<Notes>
    @InsertonConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(note:Notes)
    @Delete
    fun deleteNote(note:Notes)
}