package com.example.newsapp.db.table;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.newsapp.db.DatabaseHelper;
import com.example.newsapp.models.ListItemModel;
import com.example.newsapp.models.News;
import com.example.newsapp.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class ListItemTable {

    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;
    private Context context;


    public ListItemTable(Context context) {
        this.context = context;
        if (dbHelper == null)
            dbHelper = new DatabaseHelper(context);
    }

    /**
     * open db  connection
     */
    private void open() throws SQLException {
        try {
            database = dbHelper.getWritableDatabase();
        } catch (SQLException e) {
            throw e;
        }
    }

    /**
     * close db connection
     */
    private void close() {
        dbHelper.close();
        database.close();
    }

    /**
     * delete all rows
     */
    public void deleteALL() throws Exception {
        try {
            open();
            database.delete(DatabaseHelper.TABLE_STUFF, null, null);
        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }
    }

    public void insertListItem(ListItemModel dataBean, String s) {
        try {
            open();
            ContentValues values = new ContentValues();
            values.put(DatabaseHelper.IMAGE_URL, s);
            values.put(DatabaseHelper.AUTHOR, dataBean.getTypeAttributes().getAuthor().getName());
            values.put(DatabaseHelper.DESCRIPTION, dataBean.getDescription());
            values.put(DatabaseHelper.TYPE, dataBean.getType());
            values.put(DatabaseHelper.PUBLISH_DATE, dataBean.getPublishedAt().toString());
            values.put(DatabaseHelper.HEADLINE, dataBean.getTitle());

            long i = database.insert(DatabaseHelper.TABLE_STUFF, null, values);

            Utils.log("i", " : " + i);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }


    public List<News> getOfflineNews() {
        Cursor cursor = null;
        try {
            open();
            String query = "SELECT *" +
                    " FROM " + DatabaseHelper.TABLE_STUFF;

            cursor = database.rawQuery(query, null);

            List<News> newsList = new ArrayList<>();
            while (cursor.moveToNext()) {
                String image = cursor.getString(cursor.getColumnIndex(DatabaseHelper.IMAGE_URL));
                String author = cursor.getString(cursor.getColumnIndex(DatabaseHelper.AUTHOR));
                String description = cursor.getString(cursor.getColumnIndex(DatabaseHelper.DESCRIPTION));
                String headline = cursor.getString(cursor.getColumnIndex(DatabaseHelper.HEADLINE));
                String publishedDate = cursor.getString(cursor.getColumnIndex(DatabaseHelper.PUBLISH_DATE));
                String type = cursor.getString(cursor.getColumnIndex(DatabaseHelper.TYPE));

                News news = new News(image, author, description, headline, publishedDate, type);
                newsList.add(news);

            }

            return newsList;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            close();
            if (cursor != null) {
                cursor.close();
            }
        }
    }

}
