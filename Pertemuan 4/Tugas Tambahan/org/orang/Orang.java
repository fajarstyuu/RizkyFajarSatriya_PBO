// Nama     : Rizky Fajar Satriya
// NIM      : 24060122120017
// Deskripsi: Kelas Driver
// Tanggal  : 17/03/2024


 package org.orang;

 public class Orang{
    private String nama, nik;

    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    //Methode Getter
    public String getNama(){
        return this.nama;
    }

    public String getNik(){
        return this.nik;
    }

    //Methode Setter
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }

    //Another Methode
    public void cetak(){
        System.out.printf("Nama : %s", getNama());
        System.out.printf("NIK : %s", getNik());
    }
 }