/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadiri;

/**
 *
 * @author samsungpc
 */
public class Buku {
    private String judul;
    private String author;
    private String kategori;
    private long harga;
    private String idBuku;
    private String idBPesanan;
    static int nBuku;
    static int nBPesanan;

    public Buku() {}

    public Buku(String judul, String author, String kategori, long harga) {
        this.judul = judul;
        this.author = author;
        this.kategori = kategori;
        this.harga = harga;
        this.idBuku = "B" + nBuku++;
    }

    public Buku(String judul, String author, String kategori) {
        this.judul = judul;
        this.author = author;
        this.kategori = kategori;
        this.idBPesanan = "BP" + nBPesanan++;
    }

    public String getJudul() {
        return judul;
    }

    public String getAuthor() {
        return author;
    }

    public String getKategori() {
        return kategori;
    }

    public long getHarga() {
        return harga;
    }

    public String getIdBuku() {
        return idBuku;
    }
    
    public String toString(){
        return ("Judul   : "+this.judul
                +"\nAuthor  : "+this.author
                +"\nKategori : "+this.kategori);
    }
}