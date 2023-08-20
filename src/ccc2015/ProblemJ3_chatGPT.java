package ccc2015;

import java.util.Scanner;

public class ProblemJ3_chatGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String result = translateToRovarspraket(word);
        System.out.println(result);
    }

    public static String translateToRovarspraket(String word) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";

        for (char ch : word.toCharArray()) {
            if (consonants.indexOf(ch) != -1) {
                int index = consonants.indexOf(ch);
                char nextConsonant = (ch == 'z') ? 'z' : consonants.charAt(index + 1);

                int closestVowelIndex = vowels.indexOf(ch) - 1;
                char closestVowel = (closestVowelIndex >= 0) ? vowels.charAt(closestVowelIndex) : 'a';

                result.append(ch).append(closestVowel).append(nextConsonant);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

