package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

/**
 * Created by ktmmoe on 26, September, 2021
 **/
data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase,
    val getNoteUseCase: GetNoteUseCase
)
