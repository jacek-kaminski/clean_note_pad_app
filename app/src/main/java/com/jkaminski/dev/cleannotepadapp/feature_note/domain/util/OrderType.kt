package com.jkaminski.dev.cleannotepadapp.feature_note.domain.util

sealed class OrderType {
  object Ascending: OrderType()
  object Descending: OrderType()
}
