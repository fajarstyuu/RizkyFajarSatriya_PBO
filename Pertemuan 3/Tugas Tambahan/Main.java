public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Si Anak Pemberani");
        Buku buku2 = new Buku("Life Of Pi");
        Buku buku3 = new Buku("The Jungle Book");
        Buku buku4 = new Buku("Purple Cow");
        Buku buku5 = new Buku("Ayat Ayat Kiri");
        Buku buku6 = new Buku("Mein Kampf");

        Anggota anggota1 = new Anggota("Farrel Arduino Uno");
        Anggota anggota2 = new Anggota("Jati Komoj");

        try {
        anggota2.pinjamBuku(buku5);
        anggota2.pinjamBuku(buku4);
        anggota2.pinjamBuku(buku2);
        anggota1.pinjamBuku(buku1);
        anggota1.pinjamBuku(buku2);
        anggota1.pinjamBuku(buku3);
        anggota1.pinjamBuku(buku6);

        } catch (MaksimumBukuTerpinjamException maks) {
            System.out.println(maks.getMessage());
        } catch (BukuTidakTersediaException not){
            System.out.println(not.getMessage());
        }
    }
}
