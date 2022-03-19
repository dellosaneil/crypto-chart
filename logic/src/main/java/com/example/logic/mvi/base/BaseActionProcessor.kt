package com.example.logic.mvi.base

import com.example.logic.mvi.base.interfaces.MviAction
import com.example.logic.mvi.base.interfaces.MviResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.*

abstract class BaseActionProcessor<Action : MviAction, Result : MviResult> {

    abstract fun processAction(action: Action): Flow<Result>
    abstract val coroutineDispatcher: CoroutineDispatcher

    fun toResult(resultSuccessBlock: suspend () -> Result): Flow<Result> {
        return flow {
            emit(resultSuccessBlock())
        }.flowOn(coroutineDispatcher)
    }

    fun toResult(
        resultSuccessBlock: suspend () -> Result,
        resultErrorBlock: (Throwable) -> Result
    ): Flow<Result> {
        return flow {
            emit(resultSuccessBlock.invoke())
        }.catch {
            emit(resultErrorBlock.invoke(it))
        }.flowOn(coroutineDispatcher)
    }

    fun toResult(
        resultSuccessBlock: suspend () -> Result,
        resultErrorBlock: (Throwable) -> Result,
        initialIntent: Result
    ): Flow<Result> {
        return flow {
            emit(resultSuccessBlock.invoke())
        }.catch {
            emit(resultErrorBlock.invoke(it))
        }.onStart {
            emit(initialIntent)
        }.flowOn(coroutineDispatcher)
    }

}
