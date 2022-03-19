package com.example.logic.mvi.base.interfaces

interface MviReducer<Result : MviResult, ViewState : MviViewState> {

    fun reduce(previous: ViewState, result: Result): ViewState
}
