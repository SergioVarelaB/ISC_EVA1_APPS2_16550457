package com.example.eva1_6_lista_clima;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragLista extends Fragment {
    ListView listaClima;

    Clima[] Ciudades = {
            new Clima(),
            new Clima(R.drawable.sunny, "Camargo", 25, " Fuga al cinepolis"),
            new Clima(R.drawable.rainy, "Delicias", 18, "puro Delicias Fried Chicken"),
            new Clima(R.drawable.atmospher, "Parrar", 14, "0 pa parral"),
            new Clima(R.drawable.cloudy, "Chihuahua", 21, "Caluroso y cito 'Prefiero estar en el infierno'"),
            new Clima(R.drawable.tornado, "Juarez", 23, "Puro Leyendas podcast"),
    };

    public FragLista() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_frag_lista, container, false);

        listaClima = ll.findViewById(R.id.lista);
        listaClima.setAdapter(new ClimaAdapter(getContext(), R.layout.fragment_frag_clima, Ciudades));
        listaClima.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), Ciudades[position].getCiudad(), Toast.LENGTH_SHORT).show();
            }
        });
        return ll;

    }

}
