package com.teamtreehouse.pizzakeeper.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters

@Suppress("unused")
@Database(entities= [Pizza::class, PizzaTopping::class, Topping::class], version = 1 )
@TypeConverters(DateConverter::class)
abstract class PizzaDatabase : RoomDatabase() {

    abstract fun pizzaDao() : PizzaDao
    abstract fun toppingDao() : ToppingDao
    abstract fun pizzaToppingDao() : PizzaToppingDao

}