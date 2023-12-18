/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab10;

/**
 *
 * @author Lenovo
 */
public abstract class ROKOK {

    String nama, merk, model, warna, tipe;
    double nikotin, harga;
    int stok;

    // Overloading method tambahStok
    void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        }
    }

    // Overloadingmethod  tambahStok dengan parameter
    void tambahStok(int jumlah, double harga) {
        if (jumlah > 0) {
            stok += jumlah;
            this.harga += harga;
        }
    }

    void jual(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Penjualan berhasil. Stok sekarang: " + this.stok);
        } else {
            System.out.println("Stok Rokok kurang dari jumlah yang diinginkan.");
        }
    }

    // Override harga
    double hitharga() {
        double harga = stok * this.harga;
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setNikotin(double nikotin) {
        this.nikotin = nikotin;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public String getMerk() {
        return merk;
    }

    public abstract String getModel();

    public abstract String getWarna();

    public abstract String getTipe();

    public abstract double getNikotin();

    public abstract double getHarga();

    public abstract int getStok();

}
