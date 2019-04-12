package unifacear.edu.br.jogodavelha.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import unifacear.edu.br.jogodavelha.entity.Jogada;

public class JogadaDAO {

    SQLiteDatabase conn = Connect.getInstatnce();

    public void inserir(Jogada j) {
        ContentValues values = new ContentValues();
        values.put("posicao", j.getPosicao());
        values.put("jogada", j.getJogada());

        conn.insert("jogada",
                null,
                values);
    }

    public void alterar(Jogada j) {

    }

    public List<Jogada> listar() {
        Cursor c = conn.query("jogada",
                new String[]{"id", "posicao", "jogada"},
                null,
                null,
                null,
                null,
                "id asc");
        List<Jogada> jogadas = new ArrayList<Jogada>();
        if(c.moveToFirst()) {
            do {
                Jogada j = new Jogada();
                j.setId(c.getInt(c.getColumnIndex("id")));
                j.setPosicao(c.getInt(c.getColumnIndex("posicao")));
                j.setJogada(c.getInt(c.getColumnIndex("jogada")) == 1);
                jogadas.add(j);
            }while (c.moveToNext());
        }
        return jogadas;
    }

    public void excluir(Jogada j) {

    }
}
