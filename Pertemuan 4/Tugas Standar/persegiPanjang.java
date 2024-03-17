//nama : Rizky Fajar Satriya
//nim. : 24060122120017

package org.bangundatar;

import org.poligon.Poligon;

public class persegiPanjang extends Poligon {
    private double panjang, lebar;

    public persegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printInfo() {
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
