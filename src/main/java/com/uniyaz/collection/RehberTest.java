package com.uniyaz.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RehberTest implements Serializable {

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
        System.out.print("Kaç tane girmek istiyorsun :");
        int count = scanner.nextInt();

        for(int i = 0 ; i<count;i++) {

            System.out.print("Ad girin : ");
            String name = scanner.next();
            System.out.print("Gsm girin : ");
            String phone= scanner.next();
            Rehber rehber = new Rehber(name,phone);
            rehberList.add(rehber);
        }
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
