package com.app.base.mainapp.data.source.local;

/**
 * Created by hunain.liaquat.
 */

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@Keep
@DatabaseTable(tableName = "todo")
public class Todo implements Parcelable{

    public static final String ID_FIELD_NAME = "id";

    public static final String USERID_FIELD_ID = "userId";
    public static final String TITLE = "title";
    public static final String COMPLETED = "completed";

    @DatabaseField(generatedId = true, columnName = ID_FIELD_NAME)
    private long id;
    @SerializedName("userId")
    @Expose
    @DatabaseField(columnName = USERID_FIELD_ID)
    private String userId;

    @SerializedName("title")
    @Expose
    @DatabaseField(columnName = TITLE)
    private String title;

    @SerializedName("completed")
    @Expose
    @DatabaseField(columnName = COMPLETED)
    private boolean isCompleted;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }


    public Todo() {}

    protected Todo(Parcel in) {
        id = in.readLong();
        userId = in.readString();
        title = in.readString();
        isCompleted = in.readByte() != 0;
    }

    public static final Creator<Todo> CREATOR = new Creator<Todo>() {
        @Override
        public Todo createFromParcel(Parcel in) {
            return new Todo(in);
        }

        @Override
        public Todo[] newArray(int size) {
            return new Todo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(userId);
        dest.writeString(title);
        dest.writeByte((byte) (isCompleted ? 1 : 0));
    }
}