// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Main Titik
// Tanggal   : 29/02/2024

public class Mtitik {
    public static void main(String[] args) {
        titik T1;
        titik T2;
        titik T3;
        
        T1 = new titik();
        T2 = new titik();
        T3 = new titik(5, 6);
        
        T1.setabsis(1);
        T1.setordinat(2);
        
        T2.setabsis(3);
        T2.setordinat(4);

        double absis;
        double ordinat;
        double countertitik;
        double jarakpusat;

        countertitik = titik.getcountertitik();
        System.out.println("Jumlah Objek Titik : " + countertitik);

        absis = T1.getabsis();
        ordinat = T1.getordinat();
        System.out.printf("T1(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("T1(" + absis + ", " + ordinat + ")");

        absis = T2.getabsis();
        ordinat = T2.getordinat();
        System.out.printf("T2(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("T2(" + absis + ", " + ordinat + ")");

        absis = T3.getabsis();
        ordinat = T3.getordinat();
        System.out.printf("T3(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("T3(" + absis + ", " + ordinat + ")");

        jarakpusat = T1.getJarakPusat();
        System.out.printf("Jarak T1 ke titik pusat adalah = %.2f\n", jarakpusat);
        
        titik geser = T1.getRefleksiX();
        absis = geser.getabsis();
        ordinat = geser.getordinat();
        System.out.printf("T1(%.1f, %.1f)\n", absis, ordinat);

        geser = T2.getRefleksiY();
        absis = geser.getabsis();
        ordinat = geser.getordinat();

        System.out.printf("T1(%.1f, %.1f)\n", absis, ordinat);

        /*Kesimpulan: Dengan mengubah modifier akses, kita dapat mengatur sejauh mana atribut, konstruktor, dan metode dalam suatu 
        kelas dapat diakses dan terlihat. Penggunaan akses publik membolehkan panggilan langsung dari luar kelas terhadap atribut, 
        konstruktor, dan metode, sedangkan akses privat hanya dapat diakses dari dalam kelas itu sendiri. */
    }
}
