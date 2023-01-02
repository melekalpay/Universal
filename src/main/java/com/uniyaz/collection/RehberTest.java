package com.uniyaz.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RehberTest {

    static Scanner scanner = new Scanner(System.in);

    public static void listele(List<Rehber> rehberList){

        System.out.println("Liste :");

        for(Rehber list : rehberList) {

            String name = list.getName();
            String phone = list.getPhone();

            System.out.println(name + " " + phone);
        }

    }
    public static void ekle(List<Rehber> rehberList){

        Rehber rehber = new Rehber();

        System.out.println("İsim :");
        String isim = scanner.next();
        rehber.setName(isim);

        System.out.println("Tel :");
        String tel = scanner.next();
        rehber.setPhone(tel);

        rehberList.add(rehber);
        System.out.println("Eklendi.");

    }

    public static void guncelle(List<Rehber> rehberList){
        System.out.println("Guncellemek istediğiniz ismi giriniz :");
        String guncellenmekIstenenİsim = scanner.next();

        for(Rehber list : rehberList) {

            String name = list.getName();
            if(guncellenmekIstenenİsim.equals(name)){
                System.out.println("Yeni İsim :");
                String isim = scanner.next();
                list.setName(isim);

                System.out.println("Yeni Tel :");
                String tel = scanner.next();
                list.setPhone(tel);

                System.out.println("Guncellendi");
            }

        }

    }
    public static void sil(List<Rehber> rehberList) {

        System.out.println("Silmek istediğiniz ismi giriniz :");
        Rehber rehber = new Rehber();
        String silmekIstenenIsım = scanner.next();
        rehber.setName(silmekIstenenIsım);
        rehberList.remove(rehber);
    }


    public static void main(String[] args) {
        List<Rehber> rehberList = new ArrayList<Rehber>();

        while(true){

            int secim;
            System.out.println("Eklemek için 1 Listelemek için 2 Guncellemek için 3 Silmek için 4");
            secim=scanner.nextInt();

            if(secim==1){
                ekle(rehberList);
            }

            else if(secim==2)
            listele(rehberList);

            else if(secim==3)
               guncelle(rehberList);

            else if(secim==4)
                sil(rehberList);

            else
                break;
        }
    }


}
