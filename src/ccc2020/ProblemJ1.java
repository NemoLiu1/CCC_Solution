package ccc2020;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();
        int happinessScore = 1 * s + 2 * m + 3 * l;
        if (happinessScore >= 10) {
            System.out.println("happy");
        }else {
            System.out.println("sad");
        }
    }
}
