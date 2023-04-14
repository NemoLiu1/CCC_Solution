package ccc2022;


import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int record = 0;
        for(int i = 0; i < n; i++){
            int point = in.nextInt();
            int fouls = in.nextInt();
            int stars = (point * 5) - (fouls * 3);
            if(stars > 40){
                record ++;
            }
        }
        if(record == n){
            System.out.println(record + "+");
        }else{
            System.out.println(record);
        }

    }
}
