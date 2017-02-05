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
public class Rak {
    private String namaRak;
    private int noRak;
    private Buku[] buku = new Buku[700];
    private String judul;
    private String author;
    static int nRak;

    public Rak() {}

    public Rak(String namaRak) {
        this.namaRak = namaRak;
        this.noRak = nRak++;
    }

    public String getNamaRak() {
        return namaRak;
    }

    public int getNoRak() {
        return noRak;
    }
    
}

