package ccc2017;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short x = in.nextShort();
        short y = in.nextShort();
        if ((x == 0) || (y == 0)) {
            return;
        }
        if (x > 0) {
            if (y > 0) {
                //Quadrant 1
                System.out.println(1);
            } else {
                //Quadrant 4
                System.out.println(4);
            }
        } else {
            if (y > 0) {
                //Quadrant 2
                System.out.println(2);
            } else {
                //Quadrant 3
                System.out.println(3);
            }
        }
    }
}
