package unifacear.edu.br.jogodavelha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import unifacear.edu.br.jogodavelha.dao.Connect;
import unifacear.edu.br.jogodavelha.dao.ResultadoDAO;
import unifacear.edu.br.jogodavelha.entity.Resultado;

public class ListActivity extends AppCompatActivity {
    Integer vitoriasCirculo = 0;
    Integer vitoriasX = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        new Connect(getApplicationContext(),
                "jogodavelha.db",
                null,
                1);

        ListView lv = findViewById(R.id.listaResultado);

        List<Resultado> resultados = new ResultadoDAO().listar();

        for(Resultado r : resultados) {
            if(r.getGanhador()) {
                vitoriasCirculo++;
            } else {
                vitoriasX++;
            }
        }

        ArrayAdapter<Resultado> arrayAdapterResultado =
                new ArrayAdapter<Resultado>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, resultados);

        lv.setAdapter(arrayAdapterResultado);

        TextView tv1 = findViewById(R.id.textView1);
        TextView tv2 = findViewById(R.id.textView2);

        tv1.setText("Vitórias do círculo: " + vitoriasCirculo);
        tv2.setText("Vitórias do X: " + vitoriasX);

    }

    public void voltar(View v) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
