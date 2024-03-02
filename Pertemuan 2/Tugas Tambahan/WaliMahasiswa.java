// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Class WaliMahasiswa
// Tanggal   : 01/03/2024
public class WaliMahasiswa {
    //Atribute
    private String nama;
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    //Getter
    public String getNama(){
        return this.nama;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }

    public String getAlamat(){
        return this.alamat;
    }

    //setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
