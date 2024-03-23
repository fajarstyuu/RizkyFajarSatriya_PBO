// Nama     : Rizky Fajar Satriya
// NIM      : 24060122120017
// Deskripsi: Kelas Driver
// Tanggal  : 17/03/2024

package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang{
    private String NomorHp, alamat;

    public WaliMahasiswa(String nama, String nik,String NomorHp, String alamat){
        super(nama, nik);
        this.NomorHp = NomorHp;
        this.alamat = alamat;
    }

    //Methode Getter
    public String getNomorHp(){
        return this.NomorHp;
    }

    public String getAlamat(){
        return this.alamat;
    }

    //Methode Setter
    public void setNomorHp(String NomorHp){
        this.NomorHp = NomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        super.cetak();
        System.out.printf("Nomor HP : %s", this.getNomorHp());
        System.out.printf("Alamat : %s", this.getAlamat());
    }
}