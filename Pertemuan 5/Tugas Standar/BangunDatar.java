// Nama     : Rizky Fajar Satriya
// NIM      : 24060122120017
// Deskripsi: Kelas Driver
// Tanggal  : 23/03/2024
public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
