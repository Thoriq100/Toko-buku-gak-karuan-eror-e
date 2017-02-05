package datadiri;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author samsungpc
 */
public class TUBES1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //code di TUBES1.java sementara ini hanya untuk testing pada method2 yang ada
        
        /*String tanggal;
        Date tgl = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");*/
        
        int pil = -1;
        String id;
        Scanner input = new Scanner(System.in);
        TokoBuku tokoBuku = new TokoBuku();
        Pengunjung p = new Pengunjung("Haha", 'L', "0812", null, 150000);
        Buku b = new Buku("AADC", "Hmm", "Line", 50000);
        Buku b2 = new Buku("Nic&Mar", "Hmm", "Line", 50000);
        while(pil!=0){
            System.out.println("0. Exit");
            System.out.println("1. Jadi Member");
            System.out.println("2. Cari Member");
            System.out.println("3. Add Transaksi");
            System.out.print("Pilihan : ");
            pil = input.nextInt();
            switch (pil) {
                case 0 :
                    System.out.println("Bye bye");
                    break;
                case 1 :
                    p.jadiMember(p);
                    Member m = new Member(p);
                    tokoBuku.addMember(m);
                    m.displayMember();
                    System.out.println("");
                    break;
                case 2 :
                    tokoBuku.displayMember();
                    System.out.print("Id Member yang dicari : ");
                    id = input.next();
                    tokoBuku.cariMember(id);
                    break;
                case 3 :
                    tokoBuku.beliBuku(b, p);
                    tokoBuku.beliBuku(b2, p);
                    tokoBuku.viewTransaksi();
                    break;
            }
            System.out.println("");
        }
    }
    
}