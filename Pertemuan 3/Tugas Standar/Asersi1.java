// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Asersi1.java
// Tanggal   : 06/03/2024

public class Asersi1{
    public static void main(String[] args) {
        int x=0;
        if(x>0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}