/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author abdan
 */
public class mod_transaksi {

    public String getNoPesan() {
        return noPesan;
    }

    public void setNoPesan(String noPesan) {
        this.noPesan = noPesan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getIdDistributor() {
        return idDistributor;
    }

    public void setIdDistributor(String idDistributor) {
        this.idDistributor = idDistributor;
    }

    public String getNamaDistributor() {
        return namaDistributor;
    }

    public void setNamaDistributor(String namaDistributor) {
        this.namaDistributor = namaDistributor;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    private String noPesan;
    private String tanggal;
    private String idDistributor;
    private String namaDistributor;
    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int jumlah;
    private double subTotal;
}
