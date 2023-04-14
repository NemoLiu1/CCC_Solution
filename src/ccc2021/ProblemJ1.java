package ccc2021;

import java.util.Scanner;

public class ProblemJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int p = b *5 - 400;
        System.out.println(p);
        if(p == 100){
            System.out.println(0);
        }else if(p > 100){
            System.out.println(-1);
        }else{
            System.out.println(1);
        }
    }
}
