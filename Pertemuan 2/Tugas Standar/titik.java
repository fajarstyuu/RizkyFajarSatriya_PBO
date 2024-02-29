// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Class Titik
// Tanggal   : 29/02/2024
public class titik {
    private double absis;
    private double ordinat;
    private static double countertitik;

    public titik(){
        absis = 0;
        ordinat = 0;
        countertitik++;
    }

    public titik(double a, double o){
        this.absis = a;
        this.ordinat = o;
        countertitik++;
    }

    public void setabsis(double a){
        absis = a;
    }

    public void setordinat(double o){
        ordinat = o;
    }

    public double getabsis(){
        return absis;
    }

    public double getordinat(){
        return ordinat;
    }

    public static double getcountertitik(){
        return countertitik;
    }

    public double getJarakPusat(){
        return Math.sqrt((absis*absis)+(ordinat*ordinat));
    }

    public void refleksiX(){
        this.ordinat = -1*(this.ordinat);
    }

    public void refleksiY(){
        this.absis = -(this.absis);
    }

    public titik getRefleksiX(){
        new titik();
        refleksiX();
        return this;
    }

    public titik getRefleksiY(){
        new titik();
        refleksiY();
        return this;
    }

    /*Kesimpulan: Dengan mengubah modifier akses, kita dapat mengatur sejauh mana atribut, konstruktor, dan metode dalam suatu 
    kelas dapat diakses dan terlihat. Penggunaan akses publik membolehkan panggilan langsung dari luar kelas terhadap atribut, 
    konstruktor, dan metode, sedangkan akses privat hanya dapat diakses dari dalam kelas itu sendiri. */
}