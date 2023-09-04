package ccc2023;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int addition = in.nextInt();
        int subtraction = in.nextInt();
        int points = (addition * 50) + (subtraction * -10);
        if (addition > subtraction){
            points += 500;
        }
        System.out.println(points);
    }
}
