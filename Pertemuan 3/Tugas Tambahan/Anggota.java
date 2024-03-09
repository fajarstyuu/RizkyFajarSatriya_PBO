public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama){
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama(){
        return nama;
    }

    public Buku[] getBukuPinjaman(){
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman(){
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException{
        if(jumlahBukuPinjaman+1==4){
            throw new MaksimumBukuTerpinjamException("Maximum Number Of Book Has Reached");
        }else if(buku.isTersedia()==false){
            throw new BukuTidakTersediaException("Book With The Name " + buku.getJudul() + " Is Not Available" );
        }
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }
}
