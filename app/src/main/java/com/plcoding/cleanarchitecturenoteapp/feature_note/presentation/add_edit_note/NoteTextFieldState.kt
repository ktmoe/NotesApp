package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

/**
 * Created by ktmmoe on 26, September, 2021
 **/
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
