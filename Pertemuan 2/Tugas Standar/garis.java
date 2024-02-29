// Nama      : Rizky Fajar Satriya
// NIM       : 24060122120017
// Deskripsi : Class Garis
// Tanggal   : 29/02/2024
public class garis {
    private titik titikAwal;
    private titik titikAkhir;
    static double countergaris;

    public garis(){
        titikAwal = new titik();
        titikAkhir = new titik();
        countergaris++;
    }

    public garis(titik titikAwal, titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        countergaris++;
    }

    //Setter titik awal
    public void settitikAwal(titik titikAwal){
        this.titikAwal = titikAwal;
    }

    //setter titik akhir
    public void settitikAkhir(titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    //getter titik awal
    public titik gettitikAwal(){
        return this.titikAwal;
    }

    //getter titik akhir
    public titik gettitikAkhir(){
        return this.titikAkhir;
    }

    static double getcountergaris(){
        return countergaris;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow((gettitikAkhir().getabsis()-gettitikAwal().getabsis()), 2)+Math.pow((gettitikAkhir().getordinat()-gettitikAwal().getordinat()),2));
    }

    public double getGradien(){
        return (float)((gettitikAkhir().getordinat()-gettitikAwal().getordinat())/(gettitikAkhir().getabsis()-gettitikAwal().getabsis()));
    }

    public garis getRefleksiY(){
        titik cont = new titik();
        titik cont2 = new titik();
        cont.setabsis(gettitikAwal().getabsis() * -1); 
        cont.setordinat(gettitikAwal().getordinat());

        cont2.setabsis(gettitikAkhir().getabsis()*-1);
        cont2.setordinat(gettitikAkhir().getordinat());

        return new garis(cont, cont2);
    }

    public boolean isTegakLurus(garis G){
        return this.getGradien() * G.getGradien()==-1;
    }
}
