package com.example.pedrex.desafiopedro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pedrex on 29/09/2016.
 */

public class VendasAdapter extends ArrayAdapter<Vendas> {

    private final Context context;
    private final ArrayList<Vendas> elementos;

    public VendasAdapter (Context context, ArrayList<Vendas> elementos){
        super(context, R.layout.linha, elementos);
                this.context = context;
                this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent, false);

        TextView data = (TextView) rowView.findViewById(R.id.txtData);
        TextView hora = (TextView) rowView.findViewById(R.id.txtHora);
        TextView nomeVendedor = (TextView) rowView.findViewById(R.id.txtVendedor);
        TextView nomeCliente = (TextView) rowView.findViewById(R.id.txtCliente);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imgcart);
        TextView valor = (TextView) rowView.findViewById(R.id.txtValor);

        data.setText(elementos.get(position).getDataVenda());
        hora.setText(elementos.get(position).getHoraVenda());
        nomeVendedor.setText(elementos.get(position).getNmVendedor());
        nomeCliente.setText(elementos.get(position).getNmCliente());
        imagem.setImageResource(elementos.get(position).getImagem());
        valor.setText(elementos.get(position).getValor());

        return rowView;
    }

}
