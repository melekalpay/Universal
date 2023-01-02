package com.uniyaz.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) throws IOException {

        String path ="C:\\Users\\MAlpay\\Desktop\\Write.txt"; /*Eğer dosya adı yanlış yazılırsa
         java.io.FileNotFoundException hatası alırız. */

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();// Performans için StringBuilder tercih edilmesi daha iyi olur.
        String line;

        while((line=bufferedReader.readLine())!=null){
            stringBuilder.append(line).append("\r\n");
        }

        System.out.println("Okunan Metin : \r\n" + stringBuilder.toString());
        bufferedReader.close();
    }
}
