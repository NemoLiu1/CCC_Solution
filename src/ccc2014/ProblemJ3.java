package ccc2014;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scoreAntonia = 100;
        int scoreDavid = 100;
        int rollTime = scanner.nextInt();
        String[] diceData = new String[rollTime];
        String temp = scanner.nextLine();

        for (int i = 0; i < rollTime; i++) {
            diceData[i] = scanner.nextLine();
            String[] diceNumString = diceData[i].split(" ");
            int[] diceNum = new int[diceNumString.length];
            for (int j = 0; j < diceNumString.length; j++) {
                diceNum[j] = Integer.parseInt(diceNumString[j]);
            }
            if (diceNum[0] > diceNum[1]) {
                scoreDavid -= diceNum[0];
            }
            if (diceNum[0] < diceNum[1]) {
                scoreAntonia -= diceNum[1];
            }
        }
        System.out.println(scoreAntonia + "\n" + scoreDavid);
    }
}
