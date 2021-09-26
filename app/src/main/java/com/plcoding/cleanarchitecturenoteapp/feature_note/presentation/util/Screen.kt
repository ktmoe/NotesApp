package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.util

/**
 * Created by ktmmoe on 26, September, 2021
 **/
sealed class Screen (val route: String) {
    object NotesScreen: Screen("note_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}
