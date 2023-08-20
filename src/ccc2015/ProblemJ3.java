package ccc2015;

import java.util.Scanner;

public class ProblemJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英文单词：");
        String inputWord= scanner.nextLine();
        System.out.println("输入完成");

        StringBuilder robbersLanguage = new StringBuilder();
        for (int i = 0; i < inputWord.length(); i++) {
            char latter = inputWord.charAt(i);
            robbersLanguage.append(latter);
            if (!isVowel(latter)) {
                robbersLanguage.append(findSecondLetter(latter))
                        .append(findThirdLetter(latter));
            }
        }
        System.out.println(robbersLanguage);
    }

    public static boolean isVowel (char letter) {
        switch (letter) {
            case 'a' : case 'e' : case 'i' : case 'o' : case 'u':
                return true;
        }
        return false;
    }

    public final static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static char findSecondLetter (char consonant) {
        int index = consonant - 'a';
        // forward 与 backward 的 加 1 与 减 1 都是为了跳过第一轮结果无意义的寻找
        for (int forward = index - 1, backward = index + 1;; forward--, backward++) {
            if (forward >= 0 && isVowel(alphabet[forward])) {
                return alphabet[forward];
            }
            if (backward < alphabet.length && isVowel(alphabet[backward])) {
                return alphabet[backward];
            }
        }
    }

    public static char findThirdLetter (char consonant) {
        if (consonant == 'z') {
            return 'z';
        }
        int index = consonant - 'a' + 1;
        for (; index < alphabet.length; index++) {
            if (!isVowel(alphabet[index])) {
                break;
            }
        }
        return alphabet[index];
    }
}