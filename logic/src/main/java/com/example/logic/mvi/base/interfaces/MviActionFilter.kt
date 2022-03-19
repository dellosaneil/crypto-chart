package com.example.logic.mvi.base.interfaces

interface MviActionFilter<I : MviIntent, A : MviAction> {
    fun actionFromIntent(intent: I): A
}
