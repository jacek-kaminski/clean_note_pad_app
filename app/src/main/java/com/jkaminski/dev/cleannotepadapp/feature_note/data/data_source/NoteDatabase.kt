package com.jkaminski.dev.cleannotepadapp.feature_note.data.data_source

import Note
import NoteDao
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
  entities = [Note::class],
  version = 1
)
abstract class NoteDatabase : RoomDatabase() {

  abstract val noteDao: NoteDao

  companion object {
    const val DATABASE_NAME = "notes_db"
  }
}