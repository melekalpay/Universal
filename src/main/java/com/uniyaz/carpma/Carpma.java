package com.uniyaz.carpma;

import com.uniyaz.Utils.Generator;

public class Carpma {
    public static void main(String[] args) {
        int [][] matris1= Generator.createRandomMatris(3,3);
        int [][] matris2= Generator.createRandomMatris(3,3);
        int [][] multipMatris= Generator.getMultip(matris1,matris2);
        Generator.writeMatris(multipMatris);
    }
}
