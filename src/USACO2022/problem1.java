package USACO2022;

import java.util.Arrays;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        // the 7 integer that is given
        long[] numbers = new long[7];

        // take in the input form teriminal
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextLong();
        }

        // sort the array
        Arrays.sort(numbers);

        long abc = numbers[6];
        long a = numbers[0];
        long b = numbers[1];
        long c = abc - a - b;

        System.out.println(a + " " + b + " " + c);
    }
}
