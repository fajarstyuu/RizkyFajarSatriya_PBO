/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author HP
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    public void menembak(){
        if(getPeluru()>0){
            System.out.println(getBunyi());
            setPeluru(getPeluru()-1);
            System.out.println("Sisa Peluru: "+getPeluru());
        }
        else{
            System.out.println("Peluru habis!");
        }
    }
}
