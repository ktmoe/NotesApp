package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

/**
 * Created by ktmmoe on 26, September, 2021
 **/
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
