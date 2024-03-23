import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran : ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas bujur sangkar dengan sisi "+jejari+" satuan dalah "+l.hitungLuas());
        scan.close();
    }
}
