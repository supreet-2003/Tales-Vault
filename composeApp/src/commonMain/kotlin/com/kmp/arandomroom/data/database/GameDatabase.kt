package com.kmp.arandomroom.data.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.kmp.arandomroom.data.dao.GameDao
import com.kmp.arandomroom.data.dao.ItemDao
import com.kmp.arandomroom.data.dao.MoveDao
import com.kmp.arandomroom.data.dao.RoomDao
import com.kmp.arandomroom.data.model.GameStateDMO
import com.kmp.arandomroom.data.model.ItemDMO
import com.kmp.arandomroom.data.model.MoveDMO
import com.kmp.arandomroom.data.model.RoomDMO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

@Database(
    entities = [
        GameStateDMO::class,
        RoomDMO::class,
        ItemDMO::class,
        MoveDMO::class
    ],
    version = 3,
    exportSchema = false
)
@ConstructedBy(GameDatabaseConstructor::class)
abstract class GameDatabase : RoomDatabase() {
    abstract fun getGameDao(): GameDao
    abstract fun getRoomDao(): RoomDao
    abstract fun getItemDao(): ItemDao
    abstract fun getMoveDao(): MoveDao
}

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object GameDatabaseConstructor : RoomDatabaseConstructor<GameDatabase> {
    override fun initialize(): GameDatabase
}

fun getRoomDatabase(builder: RoomDatabase.Builder<GameDatabase>): GameDatabase {
    return builder
        .fallbackToDestructiveMigration(dropAllTables = true)
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}

internal const val dbFileName = "games.db"


