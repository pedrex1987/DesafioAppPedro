package com.example.pedrex.desafiopedro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lvItens);
        ArrayList<Vendas> vendas = adicionarVenda();
        ArrayAdapter adapter = new VendasAdapter(this, vendas);
        lista.setAdapter(adapter);


    }

    private ArrayList<Vendas> adicionarVenda() {
        ArrayList<Vendas> vendas = new ArrayList<Vendas>();
        Vendas v = new Vendas("29/09", "10:09","Atacadão Extra", "Dist. Bebidas Marabá",R.drawable.cart, "8.974,73");
                vendas.add(v);
        v = new Vendas("24/05", "11:00","Dia-A-Dia", "Mercado Veneza",R.drawable.cartdin, "14.500,00");
        vendas.add(v);

        v = new Vendas("24/05", "09:14","Dia-A-Dia", "Superbom",R.drawable.cartdin, "7.690,90");
        vendas.add(v);

        v = new Vendas("23/05", "13:10","Super Adega", "Cliente não cadastrado",R.drawable.cart, "2.300,00");
        vendas.add(v);

        v = new Vendas("23/05", "22:08","Ricardo Eletro", "Cliente não cadastrado",R.drawable.din, "299,99");
        vendas.add(v);

        v = new Vendas("24/05", "15:45","Bar da Jurema", "Zezinho",R.drawable.cartdin, "60,00");
        vendas.add(v);

        v = new Vendas("23/05", "12:30","Sinucas's Bar", "Cliente não cadastrado",R.drawable.din, "185,00");
        vendas.add(v);

        return vendas;
    }
}
