package com.example.pedra_papel_tesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada(1);
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada(2);
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada(3);
    }

    public void opcaoSelecionada(int opcaoSelecionada) {
        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        TextView textoResultado = findViewById(R.id.textoResultado);

        int num = new Random().nextInt(3);

        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opApp = opcoes[num];

        switch (opApp) {
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        if (opcaoSelecionada == 1 && num == 1 || opcaoSelecionada == 2 && num == 2 || opcaoSelecionada == 3 && num == 0) {
            textoResultado.setText("Você Perdeu 😥");
        }
        else if (opcaoSelecionada == 1 && num == 2 || opcaoSelecionada == 2 && num == 0 || opcaoSelecionada == 3 && num == 1) {
            textoResultado.setText("Você ganhou 😁");
        }else {
            textoResultado.setText("Empate 🥱");
        }
    }
}