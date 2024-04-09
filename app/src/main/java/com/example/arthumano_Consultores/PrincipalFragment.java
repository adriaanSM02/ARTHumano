package com.example.arthumano_Consultores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class PrincipalFragment extends Fragment {

    private HombresFragment.OnFragmentInteractionListener mListener;
    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> listaVP;

    public PrincipalFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaPrincipal = inflater.inflate(R.layout.fragment_principal, container, false);
        listaVP = new ArrayList<>();
        viewPager2 = vistaPrincipal.findViewById(R.id.viewpager);
        //viewPager2.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarlistaVP();

        VPAdapter vpAdapter = new VPAdapter(listaVP);
        //viewPager2.setAdapter(vpAdapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

        return vistaPrincipal;
    }

    private void llenarlistaVP() {
        //listaVP.add(R.drawable.ventas1,"");

        int[] images = {R.drawable.ventas1, R.drawable.ventas2, R.drawable.ventas3, R.drawable.ventas4};
        String [] heading = {"Ejemplo 1", "Ejemplo 2", "Ejemplo 3", "Ejemplo 4"};
        String [] desc = {"Ejemplo de elemento proeua"};

        listaVP = new ArrayList<>();
        for (int i=0; i<images.length; i++) {

        }
    }

    /**
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_principal, container, false);
    }
    **/
}
