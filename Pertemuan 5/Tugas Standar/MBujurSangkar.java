// Nama     : Rizky Fajar Satriya
// NIM      : 24060122120017
// Deskripsi: Kelas Driver
// Tanggal  : 23/03/2024
import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan dalah "+bs.hitungLuas(sisi));

        scan.close();
    }
}
