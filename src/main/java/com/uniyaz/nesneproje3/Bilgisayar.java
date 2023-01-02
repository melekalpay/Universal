package com.uniyaz.nesneproje3;

public class Bilgisayar extends ElektronikAletler implements GamePlayable {

    public void play() {
        System.out.println("Bilgisayarda oyun oynanabilir.");
    }
    public void klavyeKullan(){
        System.out.println("Bilgisayarlarda klavye vardır.");
    }
}
