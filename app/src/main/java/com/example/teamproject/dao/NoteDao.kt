package com.example.teamproject.dao

import androidx.room.*
import com.codingwithme.notesapp.entities.Notes
import com.example.teamproject.entities.Notes

@Dao
interface NoteDao{
    @get: Query( value: "SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<Notes>
    @InsertonConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotes(note:Notes)
    @Delete
    suspend fun deleteNote(note:Notes )
}