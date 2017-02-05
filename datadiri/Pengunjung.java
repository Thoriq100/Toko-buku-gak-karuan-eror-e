package datadiri;


public class Pengunjung extends User{
    private String idPengunjung;
    private long saldo;
    static int nPengunjung;

    public Pengunjung() {}

    public Pengunjung(String nama, char jk, String noHp, String email, long saldo) {
        super(nama, jk, noHp, email);
        this.saldo = saldo;
        this.idPengunjung = "P00" + nPengunjung++;
    }

    public String getIdPengunjung() {
        return idPengunjung;
    }

    public long getSaldo() {
        return saldo;
    }
    
    public void jadiMember(Pengunjung p){
        Member member = new Member(p);
    }
}