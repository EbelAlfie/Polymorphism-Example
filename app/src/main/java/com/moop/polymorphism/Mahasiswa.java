/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moop.polymorphism;


public class Mahasiswa extends DataOrang{
    public String jurusan = "-";
    public Mahasiswa(String name, int age, String duit, String nik, String nip, String jurusan) {
        super(name, age, duit, nik, nip);
        this.jurusan = jurusan ;
    }
    @Override
    public void display(AdapterOrang.OrangViewHolder holder){
        super.display(holder);
        if(!jurusan.equals("-")){
            holder.statusNip.setText("Nomor Induk Mahasiswa : ") ;
            holder.txtJurusan.setText("Jurusan : ");
            holder.jurusan.setText(jurusan);
        }
    }
}
