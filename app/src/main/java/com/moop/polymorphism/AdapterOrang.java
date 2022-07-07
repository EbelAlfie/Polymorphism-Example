package com.moop.polymorphism;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterOrang extends RecyclerView.Adapter<AdapterOrang.OrangViewHolder> {
    Context cont ;
    ArrayList<DataOrang> rangOrang ;

    public AdapterOrang(Context cont, ArrayList<DataOrang> rangOrang) {
        this.cont = cont;
        this.rangOrang = rangOrang;
    }

    @NonNull
    @Override
    public OrangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(cont).inflate(R.layout.personrecord, parent, false) ;
        return new OrangViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull OrangViewHolder holder, int position) {
        DataOrang orang = rangOrang.get(position) ;
        orang.display(holder);
    }


    @Override
    public int getItemCount() {
        return rangOrang.size();
    }

    public class OrangViewHolder extends RecyclerView.ViewHolder {
        TextView nama, umur, penghasilan, nik, nip, jurusan ;
        TextView statusNip, txtJurusan;
        public OrangViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.namanya) ;
            umur = itemView.findViewById(R.id.umurnya);
            penghasilan = itemView.findViewById(R.id.penghasilannya) ;
            statusNip = itemView.findViewById(R.id.infoNip) ;
            nik = itemView.findViewById(R.id.niknya) ;
            nip = itemView.findViewById(R.id.nipnya) ;
            txtJurusan = itemView.findViewById(R.id.infoJurusan) ;
            jurusan = itemView.findViewById(R.id.jurusannya) ;
        }
    }
}
