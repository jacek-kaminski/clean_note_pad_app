package com.jkaminski.dev.cleannotepadapp.feature_note.presentation.notes

import Note
import com.jkaminski.dev.cleannotepadapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
  data class Order(val noteOrder: NoteOrder): NotesEvent()
  data class DeleteNote(val note: Note): NotesEvent()
  object RestoreNote: NotesEvent()
  object ToggleOrderSection: NotesEvent()
}
