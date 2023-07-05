import com.jkaminski.dev.cleannotepadapp.ui.theme.*

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
  val title: String,
  val content: String,
  val timestamp: Long,
  val color: Int,
  @PrimaryKey val id: Int? = null
) {
  companion object {
    val noteColors = listOf(Red, Blue, Green)
  }
}

class InvalidNoteException(message: String) : Exception(message)
