package ccc2016;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //total times for win and total times for loss
        int totalWin = 0;
        int group = -1;
        for (int i = 0; i < 6; i++) {
            String latter = in.next();
            if (latter.equals("W")) {
                totalWin++;
            }
        }
        switch (totalWin) {
            case 5:
            case 6:
                group = 1;
                break;
            case 3:
            case 4:
                group = 2;
                break;
            case 1:
            case 2:
                group = 3;
                break;
        }
        System.out.print(group);
    }
}
