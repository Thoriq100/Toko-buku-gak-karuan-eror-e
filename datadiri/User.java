package datadiri;


public class User {
    private String nama;
    private char jk;
    private String noHp;
    private String email;

    public User() {}

    public User(String nama, char jk, String noHp, String email) {
        this.nama = nama;
        this.jk = jk;
        this.noHp = noHp;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getJk() {
        return jk;
    }

    public void setJk(char jk) {
        this.jk = jk;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
