package datadiri;


import java.util.Date;

public class Transaksi {
    private Date tgl;
    private String idTransaksi;
    static String currId;
    private long total;
    static long currTotal;
    private String deskripsi;
    static String currDeskripsi;
    static int nTransaksi;
    private String idPengunjung;
    static String currPengunjung = null;
    private int nBuku;
    static int currNBuku;

    public Transaksi() {}

    public Transaksi(Buku b, Pengunjung p) {
        if(p.getIdPengunjung().equals(currPengunjung)){
            this.idTransaksi = currId;
            this.tgl = new Date();
            this.idPengunjung = currPengunjung;
            this.total = currTotal + b.getHarga();
            this.deskripsi = currDeskripsi + "\n\n" + b.toString();
            this.nBuku = currNBuku + 1;
            currTotal = this.total;
            currId = this.idTransaksi;
            currPengunjung = this.idPengunjung;
        }else{
            this.idTransaksi = "TRX" + nTransaksi++;
            this.tgl = new Date();
            this.idPengunjung = p.getIdPengunjung();
            this.total = b.getHarga();
            this.nBuku = 1;
            this.deskripsi = b.toString();
            currTotal = b.getHarga();
            currId = this.idTransaksi;
            currPengunjung = this.idPengunjung;
            currNBuku = this.nBuku;
            currDeskripsi = this.deskripsi;
        }
    }

    public Date getTgl() {
        return this.tgl;
    }

    public String getIdTransaksi() {
        return this.idTransaksi;
    }

    public long getTotal() {
        return this.total;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public String getIdPengunjung() {
        return this.idPengunjung;
    }

    public int getnBuku() {
        return nBuku;
    }
    
    public void displayTransaksi(){
        System.out.println("Id Transaksi : "+getIdTransaksi());
        System.out.println("Tanggal : "+getTgl());
        System.out.println("Id Pengunjung : "+getIdPengunjung());
        System.out.println("====================================");
        System.out.println("\n"+getDeskripsi());
        System.out.println("\nJumlah Buku : "+getnBuku());
        System.out.println("Total Harga : "+getTotal());
    }
    
}