package com.uniyaz.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\MAlpay\\Desktop\\DosyaOrnek\\Ornek.txt");


        System.out.println("Ebeveyn :" + file.getParent());

        System.out.println("Var mı :" + file.exists());

        System.out.println("Boyutu :" + file.length());



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yy");
        Date date = new Date(file.lastModified());

        System.out.println("Değiştirilme Tarihi :" + simpleDateFormat.format(date));


    }
}
