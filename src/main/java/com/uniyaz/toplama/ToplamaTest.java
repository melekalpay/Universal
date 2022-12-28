package com.uniyaz.toplama;

import com.uniyaz.Utils.Generator;

public class ToplamaTest {
    public static void main(String[] args) {
        int[][] matris1 = Generator.createRandomMatris(3, 3);
        int[][] matris2 = Generator.createRandomMatris(3, 3);
        int[][] sumMatris = Generator.getSum(matris1, matris2);
        Generator.writeMatris(sumMatris);


    }


}
