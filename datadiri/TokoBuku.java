package datadiri;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author samsungpc
 */
public class TokoBuku {

    private Rak[] rak = new Rak[20];
    private Member[] member = new Member[100];
    private Transaksi[] transaksi = new Transaksi[700];
    private int nRak = 0;
    private int nMember = 0;
    private int nTransaksi = 0;
    static String currPengunjung;
    static int currnTrans;

    public TokoBuku() {}
    
    public void addRak(Rak r){
        if(nRak<20){
            this.rak[nRak++] = r;
            System.out.println("Berhasil\n");
        }else{
            throw new IllegalArgumentException("Sudah Penuh\n");
        }
    }
    
    public void setRak(){
        
    }
    
    public void cariBuku(){
        
    }
    
    public void pesanBuku(){
        
    }
    
    public void addMember(Member m){
        if(nMember<100){
            this.member[nMember++] = m;
            System.out.println("Berhasil\n");
        }else{
            throw new IllegalArgumentException("Sudah Penuh\n");
        }
    }
    
    public void displayMember(){
        int i = 0;
        while(i!=this.nMember){
            System.out.println(i+". "+member[i].getIdMember()
                    +" - "+member[i].getNama()+"\n");
            i++;
        }
    }
    
    public void cariMember(String id){
        String temp;
        try{for (int i = 0; i <= this.nMember; i++) {
            temp = member[i].getIdMember();
            if(temp.equals(id)){
                this.member[i].displayMember();
            }
        }}catch(NullPointerException e){
            System.out.println("");
        }
    }
    
    public void beliBuku(Buku b, Pengunjung p){
        if(p.getIdPengunjung().equals(currPengunjung)){
            Transaksi t = new Transaksi(b,p);
            this.transaksi[currnTrans] = t;
            System.out.println("Berhasil\n");
        }else{
            try{if(nTransaksi<700){
                Transaksi t = new Transaksi(b,p);
                this.transaksi[nTransaksi] = t;
                System.out.println("Berhasil\n");
                currPengunjung = p.getIdPengunjung();
                currnTrans = nTransaksi;
                nTransaksi++;
            }else{
                throw new ArrayIndexOutOfBoundsException("Transaksi gagal");
            }}catch(ArrayIndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void viewTransaksi(){
        int i = 0;
        while(i!=nTransaksi){
            this.transaksi[i].displayTransaksi();
            i++;
        }
    }
    
}