package com.uniyaz.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) throws IOException {

        String path ="C:\\Users\\MAlpay\\Desktop\\DosyaOrnek\\Ornek.txt"; /*Program bu satırı çalıştırırken eğer Write.txt dosyası varsa,
        varolan dosyanın içeriği silinip yeni içerik olarak gönderilen metin yazılır.
         Eğer ornek.txt dosyası yoksa, yeni bir dosya oluşturulup gönderilen metin yazılır. */
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file,true);
        
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

       // bufferedWriter.write("Java8\r\n");
       // bufferedWriter.write("OOP\r\n");
        //bufferedWriter.write("Web\r\n");
       // bufferedWriter.write("Android");
        bufferedWriter.append("Merhaba Dunya");
        bufferedWriter.append("ali veli");
        bufferedWriter.close();
    }
}
