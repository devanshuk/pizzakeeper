package com.teamtreehouse.pizzakeeper.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface PizzaToppingDao {

    @Insert
    fun addTopping(pizzaId : Int, toppingId : Int)

    @Query("select toppingId from pizzatopping where pizzaId = :id")
    fun getToppingIdsForPizzaId(id : Int) : List<Int>

    @Insert
    fun insert(pizzaTopping: PizzaTopping)

    @Query("delete from pizzatopping where pizzaId = :id")
    fun deletePizzaToppingsByPizzaId(id : Int)
}