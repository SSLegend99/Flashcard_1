package com.example.samuel.flashcard_1;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {com.example.samuel.flashcard_1.Flashcard.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.example.samuel.flashcard_1.FlashcardDao flashcardDao();
}
