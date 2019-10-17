package edu.gcccd.java;

import java.util.Random;
import java.util.Scanner;

public class PIPart2 {
    private static double montePI(int n) {
        int i, sum;
        double PI, x, y;
        sum = 0;
        Random r = new Random();
        for (i = 1; i < n; i++) {
            x = r.nextDouble();
            y = r.nextDouble();
            if ((x * x + y * y) <= 1) {
                sum++;
            }
        }
        PI = 4.0 * sum / n;
        return PI;
    }

    public static void main(String[] args) {
        int n;
        double PI;
        System.out.println("type in the number of drops(Better higher than 1000000)");
        //The bigger the number, the more accurate//
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        PI = montePI(n);
        System.out.println("PI=" + PI);
    }
}
