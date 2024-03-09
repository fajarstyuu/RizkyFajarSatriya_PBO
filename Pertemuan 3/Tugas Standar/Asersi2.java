// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Asersi2.java
// Tanggal   : 06/03/2024

class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jarijari=0;
        assert(jarijari>0):"jari jari tidak boleh nol!!!";
        Lingkaran circle = new Lingkaran(jarijari);
        double kelilingLingkaran = circle.hitungKeliling();
        //Jawaban pertanyaan, nama objek tidak boleh angka
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
