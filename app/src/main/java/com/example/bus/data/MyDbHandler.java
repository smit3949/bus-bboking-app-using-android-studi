package com.example.bus.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.bus.Parameters.Parameters;
import com.example.bus.model.Contact;

public class MyDbHandler extends SQLiteOpenHelper {
    public MyDbHandler(Context context)
    {
        super(context, Parameters.DB_NAME,null,Parameters.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE " + Parameters.TABLE_NAME + "(" + Parameters.key_id + "INTEGER PRIMARY KEY,"+ Parameters.key_name + "TEXT," + Parameters.key_add + "TEXT," + Parameters.key_phone + "TEXT," + Parameters.key_email + "TEXT" + ")";
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void addContact(Contact contact)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Parameters.key_name, contact.getName());
        values.put(Parameters.key_phone, contact.getPhoneno());
        values.put(Parameters.key_add, contact.getAdd());
        values.put(Parameters.key_email, contact.getEmail());
        db.insert(Parameters.TABLE_NAME, null, values);
        db.close();
    }
}
