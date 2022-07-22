package com.example.passwordsave

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface DAO {

    @Insert(onConflict = REPLACE)
    fun insert(title : AccountEntity, id : AccountEntity , pw : AccountEntity)

    @Query("SELECT * FROM Account")
    fun getAll() : List<AccountEntity>

    @Delete
    fun delete(title: AccountEntity, id: AccountEntity, pw: AccountEntity)
}