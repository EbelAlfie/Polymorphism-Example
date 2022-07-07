package com.moop.polymorphism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private DataOrang orang ;
    private ArrayList<DataOrang> orangOrang ;
    private RecyclerView recyclerView ;
    private AdapterOrang adapterOrang ;
    private EditText nama, umur, penghasilan, nik, nip, jurusan ;
    private Button add ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.dataOrang) ;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        nama = (EditText) findViewById(R.id.editTxtNama) ;
        umur = (EditText) findViewById(R.id.editTxtUmur) ;
        penghasilan = (EditText) findViewById(R.id.editTxtPenghasilan);
        nik = (EditText) findViewById(R.id.editTxtNik);
        nip = (EditText) findViewById(R.id.editTxtNip);
        jurusan = (EditText) findViewById(R.id.editTxtJurusan);
        add = (Button) findViewById(R.id.btnAdd) ;

        orangOrang = new ArrayList<>() ;
        adapterOrang = new AdapterOrang(getApplicationContext(), orangOrang) ;

        recyclerView.setAdapter(adapterOrang);

        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String name = String.valueOf(nama.getText());
        if(name.equals("")){
            nama.setError("Nama tidak boleh kosong!");
            nama.requestFocus();
            return;
        }
        String age = String.valueOf(umur.getText()) ;
        if(age.equals("")){
            umur.setError("Umur tidak boleh kosong!");
            umur.requestFocus() ;
            return ;
        }
        String salary = String.valueOf(penghasilan.getText()) ;
        if(salary.equals("")){
            penghasilan.setError("Penghasilan tidak boleh kosong!");
            penghasilan.requestFocus() ;
            return;
        }
        String nomorIndukPenduduk = String.valueOf(nik.getText()) ;
        if(nomorIndukPenduduk.equals("")){
            nik.setError("NIK tidak boleh kosong!");
            nik.requestFocus() ;
            return;
        }
        String nomorIndukMahasiswa = String.valueOf(nip.getText()) ;
        if(nomorIndukMahasiswa.equals("")){
             nip.setError("NIP tidak boleh kosong!");
             nip.requestFocus();
             return ;
        }
        String major = String.valueOf(jurusan.getText()) ;
        if(major.equals("")){ //Polymorphism, objek orang bisa punya bentuk kelas Mahasiswa atau DataOrang
            orang = new DataOrang(name, Integer.parseInt(age), salary, nomorIndukPenduduk, nomorIndukMahasiswa) ;
        }else{
            orang = new Mahasiswa(name, Integer.parseInt(age), salary, nomorIndukPenduduk, nomorIndukMahasiswa, major) ;
        }
        orangOrang.add(orang) ;
        adapterOrang.notifyDataSetChanged();
    }
}