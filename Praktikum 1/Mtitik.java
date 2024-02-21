public class Mtitik {
    public static void main(String[] args) {
        titik T1;
        titik T2;
        titik T3;
        
        T1 = new titik();
        T2 = new titik();
        T3 = new titik(5, 6);
        
        T1.setabsis(1);
        T1.setordinat(2);
        
        T2.setabsis(3);
        T2.setordinat(4);

        float absis;
        float ordinat;
        float countertitik;

        countertitik = titik.getcountertitik();
        System.out.println("Jumlah Objek Titik : " + countertitik);

        absis = T1.getabsis();
        ordinat = T1.getordinat();
        System.out.printf("T1(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("T1(" + absis + ", " + ordinat + ")");

        absis = T2.getabsis();
        ordinat = T2.getordinat();
        System.out.printf("T1(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("T2(" + absis + ", " + ordinat + ")");

        absis = T3.getabsis();
        ordinat = T3.getordinat();
        System.out.printf("T3(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("T3(" + absis + ", " + ordinat + ")");
    }
}
