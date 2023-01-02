package com.uniyaz.io;

import java.io.File;
import java.io.FileFilter;

public class DirectoryTest {

    public static void main(String[] args) {
        File directory = new File("C:\\Users\\MAlpay\\Desktop\\DosyaOrnek");

        System.out.println("String Türünde dosya/klasör isimlerini :");
        for(String fileName : directory.list()){
            System.out.println("- "+fileName);
        }
        System.out.println("String Türünde dosya/klasör isimlerini listeleme bitti. \n\n");

        System.out.println("File Türünde dosya/klasör isimleri : ");
        for(File file : directory.listFiles()){
            if(file.isDirectory()){
                System.out.println(file.getName().toUpperCase());
            } else {
                System.out.println("- " +file.getName() + " " +file.length());
            }
        }
        System.out.println("File Türünde dosya/klasör isimlerini listeleme bitti. \n\n");


        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isFile() && file.getName().endsWith(".txt");
            }
        };
        System.out.println("Sonu .txt ile biten dosyalar :");

        File[] files = directory.listFiles(filter);
        for (File file : files){
            System.out.println(file.getName());
        }



    }


}
