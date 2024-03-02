// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Class Mahasiswa
// Tanggal   : 02/03/2024
public class Mahasiswa {
    //Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;
    
    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    //getter
    public String getNama() {
        return this.nama;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public String getNim() {
        return this.nim;
    }

    public WaliMahasiswa getWali() {
        return this.wali;
    }

    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak(){
        System.out.printf("\nNama = %s\n", this.getNama());
        System.out.printf("NIM = %s\n", this.getNim());
        System.out.printf("Jurusan = %s\n", this.getJurusan());
        System.out.printf("Nama Wali = %s\n", this.getWali().getNama());
        System.out.printf("Nomor HP Wali = %s\n", this.getWali().getNomorHp());
        System.out.printf("Alamat Wali = %s\n", this.getWali().getAlamat());
    }
}
