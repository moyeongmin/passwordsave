package com.example.passwordsave

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(AccountEntity::class), version = 1)
abstract class DB : RoomDatabase(){

    abstract fun accountdao() : DAO


    companion object {

        var INSTANCE : DB? = null


        fun getInstance(context : Context) : DB?
        {
            if (INSTANCE == null)
            {
                synchronized(DB::class)
                {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                    DB::class.java, "account.DB")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }

            return INSTANCE
        }


    }
}