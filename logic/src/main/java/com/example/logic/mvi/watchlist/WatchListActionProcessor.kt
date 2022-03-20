package com.example.logic.mvi.watchlist

import com.example.logic.mvi.base.BaseActionProcessor
import com.example.network.usecase.RetrieveCoinList
import com.example.usecase.MapCoinList
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow

class WatchListActionProcessor(
    override val coroutineDispatcher: CoroutineDispatcher,
    private val retrieveCoinList: RetrieveCoinList,
    private val mapCoinList: MapCoinList,
) : BaseActionProcessor<WatchListAction, WatchListResult>() {
    override fun processAction(action: WatchListAction): Flow<WatchListResult> {
        return when (action) {
            WatchListAction.LoadCoinsListAction -> toResult(
                resultSuccessBlock = {
                    val coins = mapCoinList(retrieveCoinList()).sortedByDescending { it.volume }
                    WatchListResult.LoadCoinsList.Success(items = coins)
                },
                resultErrorBlock = {
                    WatchListResult.LoadCoinsList.Error(it)
                },
                initialIntent = WatchListResult.LoadCoinsList.Loading
            )
            is WatchListAction.SearchCoinAction -> toResult(
                resultSuccessBlock = {
                    val filteredItems = action.items.filter {
                        it.name.contains(action.term, ignoreCase = true) || it.fullName.contains(action.term, ignoreCase = true)
                    }
                    WatchListResult.SearchCoinResult(
                        items = filteredItems,
                    )
                }
            )
        }
    }
}
