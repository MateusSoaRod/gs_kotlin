package com.example.alexcosta_rm96022.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.alexcosta_rm96022.model.ItemModel

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}