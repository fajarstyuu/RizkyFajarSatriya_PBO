// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Main Garis
// Tanggal   : 29/02/2024
public class Mgaris {
    public static void main(String[] args){
        garis G1 = new garis(new titik(1, 2), new titik(3,4));

        double AbsisTitikAwal = G1.gettitikAwal().getabsis();
        double OrdinatTitikAwal = G1.gettitikAwal().getordinat();
        System.out.printf("Titik Awal G1 = (%.1f, %.1f)\n", AbsisTitikAwal, OrdinatTitikAwal);

        double AbsisTitikAkhir = G1.gettitikAkhir().getabsis();
        double OrdinatTitikAkhir = G1.gettitikAkhir().getordinat();
        System.out.printf("Titik Akhir G1 = (%.1f, %.1f)\n", AbsisTitikAkhir, OrdinatTitikAkhir);

        System.out.printf("Panjang Garis G1 = %.1f\n", G1.getPanjang());

        System.out.printf("Gradien Garis G1 = %.1f\n", G1.getGradien());

        garis G2 = G1.getRefleksiY();

        AbsisTitikAwal = G2.gettitikAwal().getabsis();
        OrdinatTitikAwal = G2.gettitikAwal().getordinat();
        System.out.printf("Titik Awal G2 (Refleksi Y) = (%.1f, %.1f)\n", AbsisTitikAwal, OrdinatTitikAwal);

        AbsisTitikAkhir = G2.gettitikAkhir().getabsis();
        OrdinatTitikAkhir = G2.gettitikAkhir().getordinat();
        System.out.printf("Titik Akhir G2 (Refleksi Y) = (%.1f, %.1f)\n", AbsisTitikAkhir, OrdinatTitikAkhir);

        System.out.printf("Apakah G1 tegak lurus dengan G2 = %b\n", G1.isTegakLurus(G2));
    }
}
