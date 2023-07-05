package com.jkaminski.dev.cleannotepadapp.feature_note.domain.use_case

import Note
import com.jkaminski.dev.cleannotepadapp.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
  private val repository: NoteRepository
) {
  suspend operator fun invoke(note: Note) {
    repository.deleteNote(note)
  }
}