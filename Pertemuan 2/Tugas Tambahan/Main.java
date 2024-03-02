// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Main
// Tanggal   : 02/03/2024
public class Main {
    public static void main(String[] args) {
        //Objek
        WaliMahasiswa WM1 = new WaliMahasiswa("Joko Darmono", "081212121212", "Jl. Perkutut, no.1, Banyummanik");
        WaliMahasiswa WM2 = new WaliMahasiswa("Agus Susantyo", "081313131313", "Jl. Kenari, no.2, Tembalang");
        WaliMahasiswa WM3 = new WaliMahasiswa(null, null, null);

        WM3.setNama("Garbono Agung");
        WM3.setNomorHp("081515151515");
        WM3.setAlamat("Jl. Emprit, no.4, Batang");

        Mahasiswa M1 = new Mahasiswa("Farrel Ardana", "24060122140165", "Informatika", WM1);
        Mahasiswa M2 = new Mahasiswa("Brenda Feodora", "24060123130097", "Kimia", WM2);
        Mahasiswa M3 = new Mahasiswa(null, null, null, WM3);

        M3.setNama("Fernando Tsaniya");
        M3.setNim("24060122120001");
        M3.setJurusan("Informatika");
        M3.setWali(WM3);

        String nama = WM1.getNama();
        String nomor = WM1.getNomorHp();
        String alamat = WM1.getAlamat();

        System.out.printf("Nama Wali WM1 adalah = %s\n", nama);
        System.out.printf("Nomor HP Wali WM1 adalah = %s\n", nomor);
        System.out.printf("Alamat Wali WM1 adalah = %s\n", alamat);

        nama = WM2.getNama();
        nomor = WM2.getNomorHp();
        alamat = WM2.getAlamat();

        System.out.printf("Nama Wali WM2 adalah = %s\n", nama);
        System.out.printf("Nomor HP Wali WM2 adalah = %s\n", nomor);
        System.out.printf("Alamat Wali WM2 adalah = %s\n", alamat);

        String namaM = M1.getNama();
        String nim = M1.getNim();
        String jurusan = M1.getJurusan();
        nama = M1.getWali().getNama();
        nomor = M1.getWali().getNomorHp();
        alamat = M1.getWali().getAlamat();

        System.out.printf("Nama Mahasiswa M1 adalah = %s\n", namaM);
        System.out.printf("NIM Mahasiswa M1 adalah = %s\n", nim);
        System.out.printf("Jurusan Mahasiswa M1 adalah = %s\n", jurusan);
        System.out.printf("Nama Wali dari Mahasiswa M1 adalah = %s\n", nama);
        System.out.printf("Nomor HP Wali dari Mahasiswa M1 adalah = %s\n", nomor);
        System.out.printf("Alamat Wali dari Mahasiswa M1 adalah = %s\n", alamat);

        namaM = M2.getNama();
        nim = M2.getNim();
        jurusan = M2.getJurusan();
        nama = M2.getWali().getNama();
        nomor = M2.getWali().getNomorHp();
        alamat = M2.getWali().getAlamat();

        System.out.printf("Nama Mahasiswa M2 adalah = %s\n", namaM);
        System.out.printf("NIM Mahasiswa M2 adalah = %s\n", nim);
        System.out.printf("Jurusab Mahasiswa M2 adalah = %s\n", jurusan);
        System.out.printf("Nama Wali dari Mahasiswa M2 adalah = %s\n", nama);
        System.out.printf("Nomor HP Wali dari Mahasiswa M2 adalah = %s\n", nomor);
        System.out.printf("Alamat Wali dari Mahasiswa M2 adalah = %s\n", alamat);

        M1.cetak();
        M2.cetak();
        M3.cetak();
    }
}
