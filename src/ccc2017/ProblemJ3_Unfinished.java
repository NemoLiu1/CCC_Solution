package ccc2017;

import java.util.Scanner;

public class ProblemJ3_Unfinished {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x\ty\ntart:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("destination:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("--------------\nbattery amount:");
        int batteryNum = scanner.nextInt();

        while (x1 != x2 && y1 != y2) {
            if (x1 != x2) {
                if (y1 != y2) {
                    x1++;
                    y1++;
                }
            }
        }


    }

    public static void lShapeRoot(int x1, int y1, int x2, int y2) {
        if (x1 > x2) {
            if (y1 > y2) {
                x1--;
                y1--;
                
            }
        }
    }
}
