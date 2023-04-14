package ccc2018;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digiOne = in.nextInt();
        int digiTwo = in.nextInt();
        int digiThree = in.nextInt();
        int digiFour = in.nextInt();
        if ((digiOne == 9 || digiOne == 8)
                &&(digiTwo == digiThree)
                &&(digiFour == 9 || digiFour == 8)){
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}
