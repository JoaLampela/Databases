package com.example.databases;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SymptomEntityDAO {

    @Query("SELECT Symptom FROM SymptomEntity")
    List<String> getAllSymptoms();

    @Query("SELECT id FROM SymptomEntity WHERE Symptom LIKE :symptomName")
    int getSymptomIDWithName(String symptomName);

    @Query("SELECT Symptom FROM SymptomEntity WHERE Symptom LIKE :symptomName")
    String getSymptomWithName(String symptomName);

    @Query("SELECT Diseases FROM SymptomEntity WHERE Symptom LIKE :symptomName")
    String getDiseasesWithSymptom(String symptomName);

    @Insert
    void insertSymptom(SymptomEntity symptom);
}
