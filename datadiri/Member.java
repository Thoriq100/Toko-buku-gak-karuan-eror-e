package datadiri;


public class Member extends User{
    private final double diskon = 0.1;
    private String idMember;
    private long saldo;
    static int nMember;

    public Member() {}

    public Member(Pengunjung p) {
        super(p.getNama(), p.getJk(), p.getNoHp(), p.getNoHp());
        if(p.getSaldo()>=25000){
            this.saldo = p.getSaldo() - 25000;
            this.idMember = "M00" + nMember++;
        }else{
            throw new IllegalArgumentException("Saldo tdiak mencukupi");
        }
    }

    public double getDiskon() {
        return diskon;
    }

    public String getIdMember() {
        return idMember;
    }

    public long getSaldo() {
        return saldo;
    }
    
    public void displayMember(){
        System.out.println(getIdMember());
        System.out.println(getNama());
        System.out.println(getDiskon());
    }
    
}