package com.uniyaz.io;

import com.uniyaz.collection.Rehber;
import com.uniyaz.collection.RehberTest;

import java.io.*;
import java.util.*;

public class Cmd{
    static List<Rehber> rehberList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String startPath = "C:\\";

        while (true) {
            System.out.print(startPath + ">");
            String komut = scanner.nextLine();
            if ("dir".equals(komut)) {
                UtilsCmd.writeAllFileName(startPath);
            } else if (komut.startsWith("cd")) {
                String filePath = UtilsCmd.getNewFilePath(startPath, komut);
                startPath = filePath;
            } else if (komut.startsWith("mkdir")) {
                UtilsCmd.klasorOlustur(startPath,komut);
            }else if (komut.startsWith("cat")) {
               UtilsCmd.dosyaOlustur(startPath,komut);
            } else if(komut.startsWith("write")){
                UtilsCmd.yaz(startPath,komut,scanner);
            }
            else if(komut.startsWith("read")){
                UtilsCmd.oku(startPath,komut);
            } else if(komut.startsWith("nesneyaz")){
            UtilsCmd.dosyayaNesne(startPath,komut,rehberList);
            }else if(komut.startsWith("nesneoku")){
                UtilsCmd.dosyayaNesneOku(startPath,komut);
            }
            else if (komut.equals("exit")) {
                System.exit(0);
            } else {
                System.out.println("Tanımsız komut girildi.");
            }
        }

    }
}
