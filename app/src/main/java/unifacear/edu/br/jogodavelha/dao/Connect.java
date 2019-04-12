package unifacear.edu.br.jogodavelha.dao;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Connect extends SQLiteOpenHelper {

    private static SQLiteDatabase instance;

    public Connect(Context context,
                   String name,
                   SQLiteDatabase.CursorFactory factory,
                   int version) {
        super(context, name, factory, version);
        instance = getWritableDatabase();
    }

    public static SQLiteDatabase getInstatnce() {
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table jogada(" +
                "id integer not null primary key autoincrement, " +
                "posicao integer not null, " +
                "jogada boolean not null);" +
                "");

        db.execSQL("create table resultado(" +
                "id integer not null primary key autoincrement, " +
                "ganhador boolean not null);" +
                "");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
