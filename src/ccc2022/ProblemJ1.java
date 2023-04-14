package ccc2022;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int s = in.nextInt();
        int result = (r * 8 + s * 3)-28;
        System.out.println(result);
    }
}
