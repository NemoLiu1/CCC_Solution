package ccc2017;

import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long sum = n;
        for (int i = 0; i < k; i++) {
            n = n * 10;
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
