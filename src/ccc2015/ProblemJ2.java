package ccc2015;

import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfHappy = 0;
        int numOfSad = 0;

        String input = scanner.nextLine();
        char[] chs = input.toCharArray();
        for (int i = 0; i < chs.length - 2; i++) {
            char c1 = chs[i];
            char c2 = chs[i + 1];
            char c3 = chs[i + 2];
            if (c1 == ':' && c2 == '-') {
                switch (c3) {
                    case '(':
                        numOfSad++;
                        break;
                    case ')':
                        numOfHappy++;
                }
            }
        }
        if (numOfHappy + numOfSad == 0) {
            System.out.println("none");
        } else if (numOfHappy > numOfSad) {
            System.out.println("happy");
        } else if (numOfHappy < numOfSad) {
            System.out.println("sad");
        } else {
            System.out.println("unsure");
        }
    }
}
