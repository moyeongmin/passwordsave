package com.example.passwordsave

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Account")
data class AccountEntity(
    @PrimaryKey(autoGenerate = true)
    var title  : String ,
    var id : String ="",
    var pw: String = "")