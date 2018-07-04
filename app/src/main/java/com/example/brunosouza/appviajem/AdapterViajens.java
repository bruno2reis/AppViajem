package com.example.brunosouza.appviajem;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class AdapterViajens extends BaseAdapter {
    private final List<Travel> travels;
    private final Activity act;

    public AdapterViajens(List<Travel> travels, Activity act) {
        this.travels = travels;
        this.act = act;
    }

    @Override
    public int getCount() {
        return travels.size();
    }

    @Override
    public Object getItem(int position) {
        return travels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_travel, parent, false);
        Travel travel = travels.get(position);

        //pegando as referencias

        TextView nome = (TextView)
                view.findViewById(R.id.lista_travel_nome);
        TextView informacao = (TextView)
                view.findViewById(R.id.lista_travel_informacao);
        ImageView img = (ImageView)
                view.findViewById(R.id.lista_travel_img);

        Categoria categoria = travel.getCategoria();

        if (categoria.equals(Categoria.cat1)){
            img.setImageResource(R.mipmap.img3);
        } else if(categoria.equals(Categoria.cat2)){
            img.setImageResource(R.mipmap.img2_round);
        }else if(categoria.equals(Categoria.cat3)){
            img.setImageResource(R.mipmap.img3);
        }

        //popoulando as views
        nome.setText(travel.getTitulo());
        informacao.setText(travel.getInformacao());
        //img.setImageResource(R.mipmap.ic_launcher);
        return view;
    }


}
