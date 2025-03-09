/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author abdan
 */
public class model_barang {

    public Integer getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(Integer kode_barang) {
        this.kode_barang = kode_barang;
    }

    public model_jenisbarang getKd_jenis() {
        return kd_jenis;
    }

    public void setKd_jenis(model_jenisbarang kd_jenis) {
        this.kd_jenis = kd_jenis;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
    private Integer kode_barang;
    private model_jenisbarang kd_jenis;
    private String nama_barang;
    private String satuan;
    private String harga;
    private String stok;
}
