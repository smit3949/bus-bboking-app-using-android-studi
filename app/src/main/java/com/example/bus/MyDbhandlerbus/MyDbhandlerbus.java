package com.example.bus.MyDbhandlerbus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.bus.Contactbus.Contactbus;
import com.example.bus.Parameters.Parameters;
import com.example.bus.model.Contact;
import com.example.bus.parambus.Parambus;

public class MyDbhandlerbus extends SQLiteOpenHelper {
    public MyDbhandlerbus(Context context)
    {
        super(context, Parameters.DB_NAME,null,Parameters.DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE " + Parambus.TABLE_NAME + "(" + Parameters.key_phone + "TEXT PRIMARY KEY,"+ Parambus.key_pick+ "TEXT," + Parambus.key_dest + "TEXT," + Parambus.key_time + "TEXT," + Parambus.key_date + "TEXT," +Parambus.key_type + "TEXT"+ ")";
        db.execSQL(create);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void addContactbus(Contactbus contactbus)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Parambus.key_pick, contactbus.getPick());
        values.put(Parambus.key_dest, contactbus.getDest());
        values.put(Parambus.key_date, contactbus.getDate());
        values.put(Parambus.key_time, contactbus.getTime());
        values.put(Parambus.key_type, contactbus.getType());
        db.insert(Parambus.TABLE_NAME, null, values);
        db.close();
    }
}
