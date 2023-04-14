package ccc2023;

import java.util.HashMap;
import java.util.Scanner;

public class ProblemJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> SHU_Table = new HashMap<>();
        SHU_Table.put("Poblano",1500);
        SHU_Table.put("Mirasol",6000);
        SHU_Table.put("Serrano",15500);
        SHU_Table.put("Cayenne",40000);
        SHU_Table.put("Thai",75000);
        SHU_Table.put("Habanero",125000);
        int num_pepper = Integer.parseInt(in.nextLine());
        int sum = 0;
        for(int i = 0; i < num_pepper; i++){
            String pepper_name = in.nextLine();
            int shu = SHU_Table.get(pepper_name);
            sum += shu;
        }
        System.out.println(sum);
    }
}
