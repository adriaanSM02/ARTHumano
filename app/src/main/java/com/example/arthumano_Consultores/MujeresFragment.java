package com.example.arthumano_Consultores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MujeresFragment extends Fragment {

    private HombresFragment.OnFragmentInteractionListener mListener;
    RecyclerView recyclerMujeres;
    ArrayList<Producto> listaMujeres;

    public MujeresFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View vistaMujeres = inflater.inflate(R.layout.fragment_mujeres, container, false);
         listaMujeres = new ArrayList<>();
         recyclerMujeres = vistaMujeres.findViewById(R.id.recyclerViewWomen);
         recyclerMujeres.setLayoutManager(new LinearLayoutManager(getContext()));

         llenarlistaMujeres();

         AdapterProducto adapterMujer = new AdapterProducto(listaMujeres);
         recyclerMujeres.setAdapter(adapterMujer);

         return vistaMujeres;
    }

    private void llenarlistaMujeres() {
        listaMujeres.add(new Producto("Jersey Local Dama 22-23", "$1,499.00",R.drawable.mujer1,"30 artículos", "Jersey", "Playera ajustada de poliéster y spandex"));
        listaMujeres.add(new Producto("Sudadera de Aficionado Dama", "$1,399.00",R.drawable.mujer2,"11 artículos", "Sudadera", "Sudadera de algodón con una capucha"));
        listaMujeres.add(new Producto("Jersey Local para Mujer 20-21", "$1,050.00",R.drawable.mujer3,"7 artículos", "Jersey", "Playera increiblemente lifera, suave y ayuda a mantenerte seco al absorber tu sudor, con tecnología antiolores además de estar hecha de 90% poliéster/10% elastano"));
        listaMujeres.add(new Producto("Jersey Alternativo Dama 21-22", "$1,120.00",R.drawable.mujer4,"29 artículos", "Jersey", "Playera ajustada y hecha de poliester y elastano"));
    }
}
