package ccc2014;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        if ((angle3 + angle2 + angle1) != 180) {
            System.out.println("Error");
        } else {
            if (angle3 == 60 && angle2 == 60 && angle1 == 60) {
                System.out.println("Equilateral");
            }
            if (angle3 == angle2 || angle3 == angle1 || angle2 == angle1) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
