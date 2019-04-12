package unifacear.edu.br.jogodavelha.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import unifacear.edu.br.jogodavelha.entity.Jogada;
import unifacear.edu.br.jogodavelha.entity.Resultado;

public class ResultadoDAO {

    SQLiteDatabase conn = Connect.getInstatnce();

    public void inserir(Resultado r) {
        ContentValues values = new ContentValues();
        values.put("ganhador", r.getGanhador());

        conn.insert("resultado",
                null,
                values);
    }

    public List<Resultado> listar() {
        Cursor c = conn.query("resultado",
                new String[]{"id", "ganhador"},
                null,
                null,
                null,
                null,
                "id asc");
        List<Resultado> resultados = new ArrayList<Resultado>();
        if(c.moveToFirst()) {
            do {
                Resultado r = new Resultado();
                r.setId(c.getInt(c.getColumnIndex("id")));
                r.setGanhador(c.getInt(c.getColumnIndex("ganhador")) == 1);
                resultados.add(r);
            }while (c.moveToNext());
        }
        return resultados;
    }
}
