package com.example.databases;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {SymptomEntity.class}, exportSchema = false, version = 1)
public abstract class Database extends RoomDatabase {

}
