/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author HP
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah : " + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap Menembak "+jumlah+" kali");
        if(isAdaPeluru()){
            for(int i = 1; i<=jumlah; i++){
                if(isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: "+senjata.getPeluru());
        }
        else{
            System.out.println("Peluru Habis");
        }
    }
    
    public void pasangBayonet(){
        System.out.println("Bayonet Terpasang!");
        senjata.setMenusuk(true);
    }
    
    public String menusuk(){
        if(senjata.isMenusuk()==true){
            return("Jleb!");
        }
        else{
            return("Bayonet Belum Terpasang! Tidak Bisa Menusuk!");
        }
    }
}
