package ccc2020;

import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        long infecter = n;
        long total = n;
        int days = 0;
        for (;;) {
            infecter *= r;
            total += infecter;
            //infecter = newInfect;
            days++;
            if (total > p) {
                break;
            }
        }
        System.out.println(days);
    }
}
