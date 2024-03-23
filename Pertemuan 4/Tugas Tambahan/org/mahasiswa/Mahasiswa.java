// Nama     : Rizky Fajar Satriya
// NIM      : 24060122120017
// Deskripsi: Kelas Driver
// Tanggal  : 17/03/2024

package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang{
    private String nim, jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    //Method Getter
    public String getNim(){
        return this.nim;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public WaliMahasiswa getWali(){
        return this.wali;
    }

    //Method Setter
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        super.cetak();
        System.out.printf("NIM : &s", this.getNim());
        System.out.printf("Jurusan : &s", this.getJurusan());
        System.out.printf("Wali");
        getWali().cetak();
    }
}
