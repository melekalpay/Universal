package com.uniyaz.nesneproje3;

public class DokunmatikLaptop extends Bilgisayar implements Touchable {
    public void dokunmatikCalis() {
        System.out.println("Dokunmatik çalışabilir.");
    }

    public void klavyeKullan(){
        System.out.println("Dokunmatik bilgisayarlarda kalem ve klavye vardır.");
    }
}
