package com.uniyaz.nesneproje3;

import java.util.Date;

public class ElektronikAletler {

    private String marka;
    private double fiyat;
    private String sahibiAdi;
    private String servisPhone;
    private String saticiAdi;
    private Date uretimTarihi;
    private long seriNumarasi;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getSahibiAdi() {
        return sahibiAdi;
    }

    public void setSahibiAdi(String sahibiAdi) {
        this.sahibiAdi = sahibiAdi;
    }

    public String getServisPhone() {
        return servisPhone;
    }

    public void setServisPhone(String servisPhone) {
        this.servisPhone = servisPhone;
    }

    public String getSaticiAdi() {
        return saticiAdi;
    }

    public void setSaticiAdi(String saticiAdi) {
        this.saticiAdi = saticiAdi;
    }

    public Date getUretimTarihi() {
        return uretimTarihi;
    }

    public void setUretimTarihi(Date uretimTarihi) {
        this.uretimTarihi = uretimTarihi;
    }

    public long getSeriNumarasi() {
        return seriNumarasi;
    }

    public void setSeriNumarasi(long seriNumarasi) {
        this.seriNumarasi = seriNumarasi;
    }
}
