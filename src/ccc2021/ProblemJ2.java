package ccc2021;

import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = Integer.parseInt(in.nextLine());
        int maxBid = 0;
        String winner = null;
        for (int i = 0; i < amount; i++) {
            String name = in.nextLine();
            int bid = Integer.parseInt(in.nextLine());
            if (bid > maxBid) {
                maxBid = bid;
                winner = name;
            }
        }
        System.out.println(winner);
    }
}
