//nama : Rizky Fajar Satriya
//nim. : 24060122120017

package org.bangundatar;

import org.poligon.Poligon;

public class segitiga extends Poligon {
    private double alas, tinggi;

    public segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public void printInfo() {
        System.out.println("Bangun segitiga berisi " + this.getJumlahSisi() + "sisi");
    }
}
