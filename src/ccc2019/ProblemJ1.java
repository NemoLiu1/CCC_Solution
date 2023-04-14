package ccc2019;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a3 = in.nextInt();
        int a2 = in.nextInt();
        int a1 = in.nextInt();
        int totalA = a3 * 3 + a2 * 2 + a1;
        int b3 = in.nextInt();
        int b2 = in.nextInt();
        int b1 = in.nextInt();
        int totalB = b3 * 3 + b2 * 2 + b1;
        if (totalA > totalB) {
            System.out.println("A");
        } else if (totalB > totalA) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
