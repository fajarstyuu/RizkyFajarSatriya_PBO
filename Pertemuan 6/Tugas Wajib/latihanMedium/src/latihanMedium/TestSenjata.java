/*
Nama: Rizky Fajar Satriya
NIM: 24060122120017
Tanggal: Minggu, 5 Mei 2024 - 07.40 WIB
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author HP
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Senjata AK47 = new Senjata("TAR");
        Senjata M16 = new Senjata("DOR");
        
        KontrolSenjata kontrolAK47 = new KontrolSenjata(AK47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(M16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        
        System.out.println("============================");
        
        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
        kontrolM16.pasangBayonet();
        
        /*Jujur masih agak bingung kenapa dimintanya menusuk itu fungsi bukan prosedur
        Padahal lebih enak pake prosedur
        */
        String x = kontrolM16.menusuk();
        System.out.println(x);
    }
}
