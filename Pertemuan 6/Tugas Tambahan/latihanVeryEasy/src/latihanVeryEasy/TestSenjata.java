/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanVeryEasy;

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
        
        System.out.println("Jumlah Peluru AK47: "+AK47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        AK47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: "+AK47.getPeluru());
        
        System.out.println("AK47 menembak");
        AK47.menembak();
    }
    
}
