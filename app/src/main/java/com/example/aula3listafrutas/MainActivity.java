package com.example.aula3listafrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Debug {
    /*
    * [*] 1 criar um arraylist para grurda as frutas
    * [*] 2 criar um metodo para carrega as frutas
    * [*] 3 criar um arrayadapter guardar a lista de frutas na lista da tela
    * [*] 4 tornar a lista clicavel
    */

    private ListView list;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // pega o id da listView da tela
        list = findViewById(R.id.lista);

        // criar lista de frutas
        final ArrayList<String> frutas = carregarFrutas();


        // criar um arrayadapter guardar a lista de frutas na lista da tela
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,frutas);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplication(), "seu clique  é " + position, Toast.LENGTH_SHORT).show();

                Toast.makeText(getApplication(), "sua fruta é " + frutas.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }/// end oncreate


    private ArrayList<String> carregarFrutas() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("peixe");
        dados.add("maça");
        dados.add("tomate");
        dados.add("banana");
        dados.add("abacaxi");
        dados.add("laranja");
        dados.add("abacate");
        dados.add("açaí");
        dados.add("coco");
        return dados;
    }


}// end main
