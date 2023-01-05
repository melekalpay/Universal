package com.uniyaz.io;

import com.uniyaz.collection.Rehber;
import com.uniyaz.collection.RehberTest;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class UtilsCmd implements Serializable {

    public static void writeAllFileName(String path) {
        File file = new File(path);
        File[] fileList = file.listFiles();
        for (File fileFile : fileList) {
            System.out.println(fileFile.getName());
        }
    }

    public static String getNewFilePath(String startPath, String komut) {
        String[] komutArray = komut.split(" ");
        String araKomut = komutArray[1];
        File file = new File(startPath);
        if(araKomut.equals("..")){
            startPath = file.getParent() ;
        }
        else{
            startPath = startPath + "\\" + araKomut;
        }
        return startPath;
    }

    public static void klasorOlustur(String startPath,String komut) {
        String[] komutArray = komut.split(" ");
        String araKomut = komutArray[1];
        startPath = startPath + "\\" + araKomut;
        File file = new File(startPath);
        file.mkdir();
    }


    public static void dosyaOlustur(String startPath,String komut) throws IOException {
        String[] komutArray = komut.split(" ");
        String araKomut = komutArray[1];
        startPath = startPath + "\\" + araKomut;
        File file = new File(startPath);
        file.createNewFile();
    }


    public static void yaz(String startPath, String komut, Scanner scanner) throws IOException {
        String[] komutArray = komut.split(" ");
        String araKomut = komutArray[1];
        startPath = startPath + "\\" + araKomut;
        File file = new File(startPath);
        if(file.isFile()){
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while (true){
                System.out.print("Dosyaya yazmak istediğiniz texti girin : ");
                String writeText = scanner.nextLine();
                if(writeText.equals("1")){
                    bufferedWriter.close();
                    System.out.println("Yazdığınız veriler kaydedilmiştir.");
                    return;
                }
                bufferedWriter.append(writeText).append("\n");
            }
        }
        else System.out.println("Seçiminiz dosya değildir.");
    }

    public static void oku(String startPath, String komut) throws IOException {
        String[] komutArray = komut.split(" ");
        String araKomut = komutArray[1];
        startPath = startPath + "\\" + araKomut;
        File file = new File(startPath);
        if(file.isFile()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while((line=bufferedReader.readLine())!=null){
                stringBuilder.append(line).append("\r\n");
            }
            System.out.println("Okunan Metin : \r\n" + stringBuilder.toString());
            bufferedReader.close();
        }
        else System.out.println("Seçiminiz dosya değildir.");

    }

    public static void dosyayaNesne (String startPath, String komut, List<Rehber> rehberList){
        String[] komutArray = komut.split(" ");
        String araKomut = komutArray[1];
        startPath = startPath + "\\" + araKomut;
       RehberTest.ekle(rehberList);
        try (FileOutputStream fileOutputStream = new FileOutputStream(startPath, true)) {
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
           objectOutputStream.writeObject(rehberList);
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
     }

    }
    public static void dosyayaNesneOku (String startPath, String komut){
        String[] komutArray = komut.split(" ");
        String araKomut = komutArray[1];
        startPath = startPath + "\\" + araKomut;
        try(FileInputStream fileInputStream = new FileInputStream(startPath)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Rehber> okunanRehberList = (List<Rehber>) objectInputStream.readObject();
            for (Rehber rehber : okunanRehberList) {
                System.out.println(rehber.getName()+ " " +rehber.getPhone());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }



}
