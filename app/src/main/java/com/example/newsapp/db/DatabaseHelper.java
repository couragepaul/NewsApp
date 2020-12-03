package com.example.newsapp.db;

/**
 * this class use to create sqlite database
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.newsapp.Info.Info;

public class DatabaseHelper extends SQLiteOpenHelper implements Info {

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TEAM_TABLE = "CREATE TABLE "
                + TABLE_STUFF + "("
                + IMAGE_URL + " TEXT ,"
                + AUTHOR + " TEXT,"
                + DESCRIPTION + " TEXT,"
                + HEADLINE + " TEXT,"
                + TYPE + " TEXT,"
                + PUBLISH_DATE + " TEXT"
                + ")";
        db.execSQL(CREATE_TEAM_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
