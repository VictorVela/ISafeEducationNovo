package com.example.victorvela.isafeeducationnovo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.victorvela.isafeeducationnovo.DAO.AdministradorDAO;
import com.example.victorvela.isafeeducationnovo.R;
import com.example.victorvela.isafeeducationnovo.model.Administrador;

import java.util.List;

public class AdministradorListAdapter extends ArrayAdapter<Administrador> {
    private int rId;

    public AdministradorListAdapter(@NonNull Context context, int resource, @NonNull List<Administrador> objects){
        super(context, resource, objects);
        rId = resource;
    }

    @Override
    public View getView(int position, View currentView, ViewGroup parent){
        View mView = currentView;

        if(mView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView=inflater.inflate(rId, null);
        }

        Administrador administrador = (Administrador) getItem(position);

        TextView textNomeAdministrador = mView.findViewById(R.id.textNomeAdministrador);
        TextView textSenhaAdministrador = mView.findViewById(R.id.textSenhaAdministrador);

        textNomeAdministrador.setText(administrador.getNomeAdministrador());
        textSenhaAdministrador.setText(administrador.getSenhaAdministrador());

        return mView;
    }
}
