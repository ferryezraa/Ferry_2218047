
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab10;

/**
 *
 * @author Lenovo
 */
public class NOTE extends ROKOK {

    String distributor;
    int tersedia;

    void datadistributor(String distributor) {
        this.distributor = distributor;
    }

    String cetakdistributor() {
        return distributor;
    }

    // Override harga
    @Override
    double hitharga() {
        double harga = stok * this.harga;
        return harga;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getWarna() {
        return warna;
    }

    @Override
    public String getTipe() {
        return tipe;
    }

    @Override
    public double getNikotin() {
        return nikotin;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public int getStok() {
        return stok;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setTersdia(int tersedia) {
        this.tersedia = tersedia;
    }

    public int getTersedia() {
        return tersedia;
    }

    NOTE() {
        this.tersedia = stok;
    }

    void tersedia() {
        if (tersedia < stok) {
            System.out.println("Stok Part PC Ini Belum Tersedia");
        } else {
            System.out.println("Stok Part PC Ini Tersedia");
        }
    }

    void CetakNOTE() {
        System.out.println("Nama Rokok : " + super.getNama());
        System.out.println("Model Rokok: " + getModel());
        System.out.println("Warna Rokok : " + getWarna());
        System.out.println("Tipe Rokok : " + getTipe());
        tersedia();
    }

    // Implementasi metode baru dari interface


    public void JadwalPencatatan() {
        System.out.println("Distributor: " + getDistributor());
        System.out.println("Status Ketersediaan: " + (tersedia < stok ? "Belum Tersedia" : "Tersedia"));
    }

}
