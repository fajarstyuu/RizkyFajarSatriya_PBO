// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : AngkaSial.java
// Tanggal   : 06/03/2024

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
        //Jawaban Pertanyaan
        //1. Tidak, karena masuk ke throw lalu ke catcg
        //2. Iya, karena kondisi throw terjadi pada baris 19. Karena terjadi, maka 
        //barus ke 21, catch dieksekusi untuk menangkap trhow
    }
}
