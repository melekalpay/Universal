package com.uniyaz.nesneproje3;

public class DizustuBilgisayar extends Bilgisayar implements PrizsizCalisabilme {
    public void prizsizCalis() {
        System.out.println("Dizüstü bilgisayar şarja takılı olmadan çalışabilir.");
    }
    public void klavyeKullan(){
        System.out.println("Laptoplarda bağımlı klavye vardır.");
    }
}
