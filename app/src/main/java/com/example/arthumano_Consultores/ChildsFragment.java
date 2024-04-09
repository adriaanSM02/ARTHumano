package com.example.arthumano_Consultores;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChildsFragment extends Fragment {

    private HombresFragment.OnFragmentInteractionListener mListener;
    RecyclerView recyclerChild;
    ArrayList<Producto> listaChild;

    public ChildsFragment() {
    }

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaChild = inflater.inflate(R.layout.fragment_childs, container, false);
        listaChild = new ArrayList<>();
        recyclerChild = vistaChild.findViewById(R.id.recyclerViewChild);
        recyclerChild.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarlistaChild();

        AdapterProducto adapterChild = new AdapterProducto(listaChild);
        recyclerChild.setAdapter(adapterChild);

        return vistaChild;
    }

    private void llenarlistaChild() {
        listaChild.add(new Producto("Jersey Portero Azul Niño", "$1,399.00",R.drawable.childs1,"34 artículos", "Jersey", "Playera de poliéster y spandex ajustada deportiva"));
        listaChild.add(new Producto("Chamarra Protocolo Niño", "$980.00",R.drawable.childs2,"12 artículos", "Chamarra", "Chamarra de spandex de cuello alto ajustada"));
        listaChild.add(new Producto("Sudadera de Niño", "$99.00",R.drawable.childs3,"8 artículos", "Sudadera", "Sudadera de algodón con capucha"));
        listaChild.add(new Producto("Kit de Fútbol Toluca FC para bebé", "$420.00",R.drawable.childs4,"28 artículos", "Kit", "Kit de regalo para bebés de 6 meses hasta niños de 4 años de edad"));
    }
}
