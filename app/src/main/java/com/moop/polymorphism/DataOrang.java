/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moop.polymorphism;

/**
 *
 * @author admin
 */
public class DataOrang {
    public String nama;
    public int umur;
    public String penghasilan;
    public String nik;
    DataOrang(String name,int age,String duit, String nik){
        this.nama = name ;
        this.umur = age ;
        this.penghasilan = duit ;
        this.nik = nik ;
    }
    public void display(AdapterOrang.OrangViewHolder holder){
        holder.nama.setText(nama);
        holder.umur.setText(String.valueOf(umur));
        holder.penghasilan.setText(penghasilan);
        holder.nik.setText(nik);
    }
}
