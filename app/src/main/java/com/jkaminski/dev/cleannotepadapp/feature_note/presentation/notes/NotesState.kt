package com.jkaminski.dev.cleannotepadapp.feature_note.presentation.notes

import Note
import com.jkaminski.dev.cleannotepadapp.feature_note.domain.util.NoteOrder
import com.jkaminski.dev.cleannotepadapp.feature_note.domain.util.OrderType

data class NotesState(
  val notes: List<Note> = emptyList(),
  val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
  val isOrderSectionVisible: Boolean = false
)