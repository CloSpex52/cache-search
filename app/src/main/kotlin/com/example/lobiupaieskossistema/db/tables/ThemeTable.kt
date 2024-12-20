package com.example.lobiupaieskossistema.database

object ThemeTable {
    // Themes table
    const val TABLE_NAME = "themes"
    const val ID = "id"
    const val DESCRIPTION = "description"
    const val ABSOLUTE_TIME = "abs_time"
    const val TIME = "time"

    const val CREATE_TABLE = """
        CREATE TABLE $TABLE_NAME (
            $ID INTEGER PRIMARY KEY AUTOINCREMENT,
            $DESCRIPTION TEXT UNIQUE,
            $ABSOLUTE_TIME INTEGER DEFAULT 0,
            $TIME INTEGER DEFAULT 0
        )
    """
}