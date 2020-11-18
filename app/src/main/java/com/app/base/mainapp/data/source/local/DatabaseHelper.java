package com.app.base.mainapp.data.source.local;

import android.content.Context;
import android.database.Cursor;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.app.base.mainapp.utils.Util;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;


public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    public static final String TAG = DatabaseHelper.class.getSimpleName();
    private static final String DATABASE_NAME = "my_todo";
    private static final int SPRINT_1 = 1;
    private static final int DATABASE_VERSION = SPRINT_1;

    private static String DATABASE_PATH;
    private List<Class<?>> tables;

    public DatabaseHelper(Context context, List<Class<?>> mTables) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        tables = mTables;
    }


    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {
            for (Class<?> key : tables) {
                TableUtils.createTableIfNotExists(connectionSource, key);
            }

        } catch (java.sql.SQLException e) {
            Util.logException(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }


    private void dropTables(SQLiteDatabase db) {
        // query to obtain the names of all tables in your database
        Cursor c = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        List<String> tables = new ArrayList<>();

// iterate over the result set, adding every table name to a list
        while (c.moveToNext()) {
            tables.add(c.getString(0));
        }

// call DROP TABLE on every table name
        for (String table : tables) {
            String dropQuery = "DROP TABLE IF EXISTS " + table;
            db.execSQL(dropQuery);
        }
    }

    /*
     * Check whether or not database exist
     */
    private boolean checkDatabase() {
        boolean checkDB = false;
        String myPath = DATABASE_PATH + DATABASE_NAME;
        File dbFile = new File(myPath);
        checkDB = dbFile.exists();

        return checkDB;
    }

    private void copyDatabase(Context context) {
        try {
            InputStream inputStream = context.getAssets().open(DATABASE_NAME);
            String outFileName = DATABASE_PATH + DATABASE_NAME;
            Log.i(TAG, "DB Path : "
                    + outFileName);
            File mFolder = new File(DATABASE_PATH);
            if (!mFolder.exists()) {
                mFolder.mkdir();
            }
            OutputStream outputStream = new FileOutputStream(outFileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                bufferedOutputStream.write(buffer, 0, length);
            }
            bufferedOutputStream.flush();
            outputStream.flush();
            bufferedOutputStream.close();
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
