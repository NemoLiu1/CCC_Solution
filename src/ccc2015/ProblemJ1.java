package ccc2015;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please impute the month of it.");
        int imputeMonth = scanner.nextInt();
        if (imputeMonth > 13 || imputeMonth < 0) {
            System.out.println("Please chack again your impute.");
            return;
        }
        System.out.println("Now please impute the date.");
        int imputeDate = scanner.nextInt();
        final int before = 1;
        final int after = 2;
        final int special = 3;
        int determind = -1;
        if (imputeMonth < 2) {
            determind = before;
        } else if (imputeMonth > 2) {
            determind = after;
        } else if (imputeMonth == 2) {
            if (imputeDate < 18) {
                determind = before;
            } else if (imputeDate > 18) {
                determind = after;
            } else if (imputeDate == 18) {
                determind = special;
            }
        }
        if (determind == before) {
            System.out.println("Before");
        } else if (determind == after) {
            System.out.println("After");
        } else if (determind == special) {
            System.out.println("Special!!!");
        }
    }
}
