package com.uniyaz.Utils;

import java.util.Random;
import java.util.Scanner;


public class Generator {
    public static int[][] createRandomMatris(int satir, int sutun){
        int firstDizi[][]= new int[satir][sutun];

        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                Random random = new Random();
                firstDizi[i][j]=random.nextInt(100);
            }
        }
        return firstDizi;
    }

    public static int[][] createMatris(int satir, int sutun) {
        int dizi[][] = new int[satir][sutun];
        int deger = 1;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = deger;
            }
        }
        return dizi;
    }
    public static int[][] emptyMatris() {
        int dizi[][] = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                dizi[i][j] = 1;
            }
        }
        return dizi;
    }
    public static int[][] scan(int[][] dizi){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır :");
        a=scanner.nextInt();
        System.out.println("Sutun :");
        b=scanner.nextInt();

        for(int i=0; i<8;i++){
            dizi[i][b-1] = 0;
        }
        for(int i=0; i<8;i++){
            dizi[a-1][i] = 0;
        }
        dizi[a-1][b-1] = 9;
        return dizi;

    }



    public static int randomAdress(int[][] dizi){
        Random random = new Random();
        int a = random.nextInt(dizi.length);
        int b=random.nextInt(dizi[0].length);
        int bomba;
        bomba =dizi[a][b] ;
        return bomba;
    }

    public static int[][] getMultip(int [][] firstDizi,int [][] secondDizi){

        int[][] multipDizi = new int[firstDizi.length][firstDizi[0].length];
        int toplam =0;
        for(int i=0;i<firstDizi.length;i++){
            for(int j=0;j<firstDizi[0].length;j++){
                 toplam += firstDizi[i][j] * secondDizi[j][i];
                 multipDizi[i][j]=toplam;
            }
        }
        return multipDizi;
    }

    public  static int[][] getSum (int [][] firstDizi,int [][] secondDizi){
        int sumDizi[][]=new int[firstDizi.length][firstDizi[0].length];
        for(int i=0;i<firstDizi.length;i++){
            for(int j=0;j<firstDizi[0].length;j++){
                Random random = new Random();
                firstDizi[i][j]=random.nextInt(100);
                secondDizi[i][j]=random.nextInt(100);
                sumDizi[i][j] = firstDizi[i][j] + secondDizi[i][j];
            }
        }

        return sumDizi;
    }

    public static void writeMatris(int [][] matris){
        for(int i=0;i<matris.length;i++){
            System.out.println(" ");
            for (int j=0;j<matris[0].length;j++){
                System.out.print(matris[i][j] + " ");
            }
        }
    }

}
