package com.example.brunosouza.appviajem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Travel> Travels = todosAsTravels();

        ListView listaDeTravels = (ListView) findViewById(R.id.lista);

        //chamada da nossa implementação
        AdapterViajens adapter =
                new AdapterViajens(Travels, this);
        listaDeTravels.setAdapter(adapter);

        listaDeTravels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(AdapterViajens<> Adapter, View v, int position) {

            }
        });

    }
    private List<Travel> todosAsTravels() {
        return new ArrayList<>(Arrays.asList(
                new Travel("Cancun", "Lindos Passeios", EstadoAtual.FINALIZADO, Categoria.cat1),
                new Travel("Portugal", "Conheça a História do Brasil", EstadoAtual.FAZENDO, Categoria.cat2),
                new Travel("EUA", "Aproveita a maravilha", EstadoAtual.FINALIZADO, Categoria.cat3)));
    }



}
