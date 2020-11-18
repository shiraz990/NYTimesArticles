package com.app.base.mainapp.data.source.local;

import android.content.Context;

import com.app.base.mainapp.data.source.remote.model.response.TodoItem;
import com.app.base.mainapp.utils.Util;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;


public class DatabaseManager {

    private static DatabaseManager mInstance;
    private static DatabaseHelper mHelper;
    private static List<Class<?>> tables;


    public static DatabaseManager getInstance(Context context) {
        if (context != null)
            if (null == mInstance) {
                mInstance = new DatabaseManager(context.getApplicationContext());
            }

        return mInstance;
    }

    public boolean isTodoListExisiOnDB() {
        boolean isTodoListExist = false;
        List<Todo> todoItemList = getAllTodos();
        if ( todoItemList!= null && !todoItemList.isEmpty()) {

            isTodoListExist = true;

        }
        return isTodoListExist;
    }

    @Inject
    DatabaseManager(Context context) {
        tables = new ArrayList<Class<?>>();
        tables.add(Todo.class);
        mHelper = new DatabaseHelper(context, tables);

    }

    public DatabaseHelper getDatabaseHelper() {
        return mHelper;
    }

    public void close() {
        try {
            mInstance = null;
            mHelper.close();
        } catch (Exception ex) {
            Util.logException(ex);
        }
    }



    public List<Todo> getAllTodos() {
        try {
            return mHelper.getDao(Todo.class).callBatchTasks(new Callable<List<Todo>>() {
                public List<Todo> call() throws Exception {
                    return mHelper.getDao(Todo.class).queryBuilder().orderBy(Todo.USERID_FIELD_ID, true).query();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    public boolean saveTodos(List<Todo> todos) {
        try {
            return mHelper.getDao(Todo.class).create(todos) == todos.size();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public <T> T createOrUpdate(Class<T> type, T data) throws SQLException {
        Dao.CreateOrUpdateStatus createOrUpdateStatus = mHelper.getDao(type).createOrUpdate(data);
        return data;
    }




}
