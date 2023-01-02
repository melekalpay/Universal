package com.uniyaz.nesneproje2;

public abstract class Tasit {
    private float hiz;
    private int uretimYili;
    private Kullanici kullanici;

    public abstract void hizlan() ;
    public  void tasi(){
        System.out.println("Genellikle insan veya kargo taşir.");
    };

}
