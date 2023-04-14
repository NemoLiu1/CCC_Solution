package ccc2018;

import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String yesterday = in.next();
        String today = in.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ((yesterday.charAt(i) == today.charAt(i))
                    &&(yesterday.charAt(i) == 'C')
                    &&(today.charAt(i) == 'C')) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
