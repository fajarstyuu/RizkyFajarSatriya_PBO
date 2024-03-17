//nama : Rizky Fajar Satriya
//nim. : 24060122120017

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        persegiPanjang persegi = new persegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang : " + persegi.hitungLuas());

        segitiga Segitiga = new segitiga(10, 12, 3);
        Segitiga.printInfo();
        System.out.println("Luas segtiga :" + Segitiga.hitungLuas());
    }
}
