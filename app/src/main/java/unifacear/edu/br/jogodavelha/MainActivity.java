package unifacear.edu.br.jogodavelha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import unifacear.edu.br.jogodavelha.dao.Connect;
import unifacear.edu.br.jogodavelha.dao.JogadaDAO;
import unifacear.edu.br.jogodavelha.dao.ResultadoDAO;
import unifacear.edu.br.jogodavelha.entity.Jogada;
import unifacear.edu.br.jogodavelha.entity.Resultado;

public class MainActivity extends AppCompatActivity {
    boolean jogador = true;
    Resultado r = new Resultado();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Connect(getApplicationContext(),
                "jogodavelha.db",
                null,
                1);

        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        ImageButton imageButton9 = findViewById(R.id.imageButton9);




        imageButton1.setTag(R.drawable.vazio);
        imageButton2.setTag(R.drawable.vazio);
        imageButton3.setTag(R.drawable.vazio);
        imageButton4.setTag(R.drawable.vazio);
        imageButton5.setTag(R.drawable.vazio);
        imageButton6.setTag(R.drawable.vazio);
        imageButton7.setTag(R.drawable.vazio);
        imageButton8.setTag(R.drawable.vazio);
        imageButton9.setTag(R.drawable.vazio);


    }



    public void limpar(View v){


        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        ImageButton imageButton9 = findViewById(R.id.imageButton9);


        imageButton1.setImageResource(R.drawable.vazio);
        imageButton2.setImageResource(R.drawable.vazio);
        imageButton3.setImageResource(R.drawable.vazio);
        imageButton4.setImageResource(R.drawable.vazio);
        imageButton5.setImageResource(R.drawable.vazio);
        imageButton6.setImageResource(R.drawable.vazio);
        imageButton7.setImageResource(R.drawable.vazio);
        imageButton8.setImageResource(R.drawable.vazio);
        imageButton9.setImageResource(R.drawable.vazio);

        imageButton1.setEnabled(true);
        imageButton2.setEnabled(true);
        imageButton3.setEnabled(true);
        imageButton4.setEnabled(true);
        imageButton5.setEnabled(true);
        imageButton6.setEnabled(true);
        imageButton7.setEnabled(true);
        imageButton8.setEnabled(true);
        imageButton9.setEnabled(true);

        imageButton1.setTag(R.drawable.vazio);
        imageButton2.setTag(R.drawable.vazio);
        imageButton3.setTag(R.drawable.vazio);
        imageButton4.setTag(R.drawable.vazio);
        imageButton5.setTag(R.drawable.vazio);
        imageButton6.setTag(R.drawable.vazio);
        imageButton7.setTag(R.drawable.vazio);
        imageButton8.setTag(R.drawable.vazio);
        imageButton9.setTag(R.drawable.vazio);


    }

    public void desabilita(){

        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        ImageButton imageButton9 = findViewById(R.id.imageButton9);

        imageButton1.setEnabled(false);
        imageButton2.setEnabled(false);
        imageButton3.setEnabled(false);
        imageButton4.setEnabled(false);
        imageButton5.setEnabled(false);
        imageButton6.setEnabled(false);
        imageButton7.setEnabled(false);
        imageButton8.setEnabled(false);
        imageButton9.setEnabled(false);

    }




    public void clique (View v) {
        ImageButton imageButton = (ImageButton) v;

        Jogada jogada = new Jogada();
        jogada.setJogada(jogador);

        if(v.getId() == R.id.imageButton1) {
            jogada.setPosicao(1);
        }

        if(v.getId() == R.id.imageButton2) {
            jogada.setPosicao(2);
        }

        if(v.getId() == R.id.imageButton3) {
            jogada.setPosicao(3);
        }

        if(v.getId() == R.id.imageButton4) {
            jogada.setPosicao(4);
        }

        if(v.getId() == R.id.imageButton5) {
            jogada.setPosicao(5);
        }

        if(v.getId() == R.id.imageButton6) {
            jogada.setPosicao(6);
        }

        if(v.getId() == R.id.imageButton7) {
            jogada.setPosicao(7);
        }

        if(v.getId() == R.id.imageButton8) {
            jogada.setPosicao(8);
        }

        if(v.getId() == R.id.imageButton9) {
            jogada.setPosicao(9);
        }

        new JogadaDAO().inserir(jogada);

        if (jogador) {
            if (imageButton.getTag().equals(R.drawable.vazio)) {
                imageButton.setImageResource(R.drawable.circulo);
                imageButton.setTag(R.drawable.circulo);

                jogador = false;
            } else {
                Toast.makeText(getApplicationContext(), "Jogada Impossível", Toast.LENGTH_LONG).show();
            }
        } else {
            if (imageButton.getTag().equals(R.drawable.vazio)) {
                imageButton.setImageResource(R.drawable.x);
                imageButton.setTag(R.drawable.x);
                jogador = true;
            } else {
                Toast.makeText(getApplicationContext(), "Jogada Impossível", Toast.LENGTH_LONG).show();
            }

        }


        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        ImageButton imageButton9 = findViewById(R.id.imageButton9);


        if (imageButton1.getTag().equals(R.drawable.circulo) && (imageButton2.getTag().equals(R.drawable.circulo) &&
                imageButton3.getTag().equals(R.drawable.circulo))) {
            Toast.makeText(getApplicationContext(), "Circulo Ganhou", Toast.LENGTH_LONG).show();


            r.setGanhador(true);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton4.getTag().equals(R.drawable.circulo) && (imageButton5.getTag().equals(R.drawable.circulo) &&
                imageButton6.getTag().equals(R.drawable.circulo))) {
            Toast.makeText(getApplicationContext(), "Circulo Ganhou", Toast.LENGTH_LONG).show();


            desabilita();
        } else if (imageButton7.getTag().equals(R.drawable.circulo) && (imageButton8.getTag().equals(R.drawable.circulo) &&
                imageButton9.getTag().equals(R.drawable.circulo))) {
            Toast.makeText(getApplicationContext(), "Circulo Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(true);
            new ResultadoDAO().inserir(r);

            desabilita();


        } else if (imageButton1.getTag().equals(R.drawable.circulo) && (imageButton5.getTag().equals(R.drawable.circulo) &&
                imageButton9.getTag().equals(R.drawable.circulo))) {
            Toast.makeText(getApplicationContext(), "Circulo Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(true);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton7.getTag().equals(R.drawable.circulo) && (imageButton5.getTag().equals(R.drawable.circulo) &&
                imageButton3.getTag().equals(R.drawable.circulo))) {
            Toast.makeText(getApplicationContext(), "Circulo Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(true);
            new ResultadoDAO().inserir(r);

            desabilita();


        } else if (imageButton1.getTag().equals(R.drawable.circulo) && (imageButton4.getTag().equals(R.drawable.circulo) &&
                imageButton7.getTag().equals(R.drawable.circulo))) {
            Toast.makeText(getApplicationContext(), "Circulo Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(true);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton2.getTag().equals(R.drawable.circulo) && (imageButton5.getTag().equals(R.drawable.circulo) &&
                imageButton8.getTag().equals(R.drawable.circulo))) {
            Toast.makeText(getApplicationContext(), "Circulo Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(true);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton3.getTag().equals(R.drawable.circulo) && (imageButton6.getTag().equals(R.drawable.circulo) &&
                imageButton9.getTag().equals(R.drawable.circulo))) {
            Toast.makeText(getApplicationContext(), "Circulo Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(true);
            new ResultadoDAO().inserir(r);

            desabilita();


        } else if (imageButton1.getTag().equals(R.drawable.x) && (imageButton2.getTag().equals(R.drawable.x) &&
                imageButton3.getTag().equals(R.drawable.x))) {
            Toast.makeText(getApplicationContext(), "X Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(false);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton4.getTag().equals(R.drawable.x) && (imageButton5.getTag().equals(R.drawable.x) &&
                imageButton6.getTag().equals(R.drawable.x))) {
            Toast.makeText(getApplicationContext(), "X Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(false);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton7.getTag().equals(R.drawable.x) && (imageButton8.getTag().equals(R.drawable.x) &&
                imageButton9.getTag().equals(R.drawable.x))) {
            Toast.makeText(getApplicationContext(), "X Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(false);
            new ResultadoDAO().inserir(r);

            desabilita();


        } else if (imageButton1.getTag().equals(R.drawable.x) && (imageButton5.getTag().equals(R.drawable.x) &&
                imageButton9.getTag().equals(R.drawable.x))) {
            Toast.makeText(getApplicationContext(), "X Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(false);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton7.getTag().equals(R.drawable.x) && (imageButton5.getTag().equals(R.drawable.x) &&
                imageButton3.getTag().equals(R.drawable.x))) {
            Toast.makeText(getApplicationContext(), "X Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(false);
            new ResultadoDAO().inserir(r);

            desabilita();


        } else if (imageButton1.getTag().equals(R.drawable.x) && (imageButton4.getTag().equals(R.drawable.x) &&
                imageButton7.getTag().equals(R.drawable.x))) {
            Toast.makeText(getApplicationContext(), "X Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(false);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton2.getTag().equals(R.drawable.x) && (imageButton5.getTag().equals(R.drawable.x) &&
                imageButton8.getTag().equals(R.drawable.x))) {
            Toast.makeText(getApplicationContext(), "X Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(false);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else if (imageButton3.getTag().equals(R.drawable.x) && (imageButton6.getTag().equals(R.drawable.x) && imageButton9.getTag().equals(R.drawable.x))) {
            Toast.makeText(getApplicationContext(), "X Ganhou", Toast.LENGTH_LONG).show();

            r.setGanhador(false);
            new ResultadoDAO().inserir(r);

            desabilita();
        } else

        if (!imageButton1.getTag().equals(R.drawable.vazio) && !imageButton2.getTag().equals(R.drawable.vazio) && !imageButton3.getTag().equals(R.drawable.vazio) &&
                !imageButton4.getTag().equals(R.drawable.vazio) && !imageButton5.getTag().equals(R.drawable.vazio) && !imageButton6.getTag().equals(R.drawable.vazio)&&
                !imageButton7.getTag().equals(R.drawable.vazio) && !imageButton8.getTag().equals(R.drawable.vazio) && !imageButton9.getTag().equals(R.drawable.vazio)) {
            Toast.makeText(getApplicationContext(), "Deu Velha!!!", Toast.LENGTH_LONG).show();
        }


    }

    public void listar(View v) {
        Intent intent = new Intent(this, ListActivity.class);

        startActivity(intent);
    }

}

