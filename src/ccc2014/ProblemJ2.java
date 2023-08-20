package ccc2014;

import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // this subject represent the total number of voting
        // it also helps to determine the times of the loop
        int numberOfVote = scanner.nextInt();
        String votes = scanner.next();
        char[] vote = votes.toCharArray();
        int CountingA = 0;
        int CountingB = 0;

        for (int i = 0; i < vote.length; i++) {
            if (vote[i] == 'A') {
                CountingA++;
            } else if (vote[i] == 'B') {
                CountingB++;
            } else {
                System.out.println("There were unrecognizable character in vote number " + i);
                break;
            }
        }

        if (CountingA > CountingB) {
            System.out.println("A");
        } else if (CountingA < CountingB) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }

    }
}
