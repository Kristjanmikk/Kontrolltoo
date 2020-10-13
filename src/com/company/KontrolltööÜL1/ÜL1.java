package com.company.KontrolltööÜL1;

import java.util.Scanner;

public class ÜL1 {
    public static void main(String[] args) {
        int i = 9;
        int z = 9;
        int y = 9;
        int q = 1;
        int u = 10;
        while(i >= 0){
            int x = z;
            int t = u;
            while(x >= 0){
                if(t < 10){
                    System.out.print(x);
                    t = t + 1;
                }else {
                    System.out.print(x);
                    x = x - 1;
                }
            }
            System.out.println();
            i = i - 1;
            y = y - 1;
            z = z - 1;
            u = u - q;
        }

    }
}
