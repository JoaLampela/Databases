package com.example.databases;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SymptomEntity")
public class SymptomEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Symptom")
    private String symptomName;

    @ColumnInfo(name = "Diseases")
    private String associatedDiseases;

    public SymptomEntity(String symptomName, String associatedDiseases) {
        this.symptomName = symptomName;
        this.associatedDiseases = associatedDiseases;
    }
}
